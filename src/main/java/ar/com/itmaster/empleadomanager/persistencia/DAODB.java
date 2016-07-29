package ar.com.itmaster.empleadomanager.persistencia;

import com.mycompany.empleadomanager.modelo.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAODB implements DAO {

    public void almacenar(Empleado empleado) {
        
        try {
  
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empleado_manager","root","");
            PreparedStatement ps=connection.prepareStatement("INSERT INTO empleados (nombre,fecha_nacimiento,sueldo,dni) VALUES (?,?,?,?)");
            ps.setString(1,empleado.getNombre());
            ps.setObject(2,empleado.getFechaNacimiento());
            ps.setDouble(3,empleado.getSueldo());
            ps.setString(4,empleado.getDni());
            
            ps.execute();
            ps.close();
            connection.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAODB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAODB.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }
 
    @Override
    public Empleado buscarEmpleado(Long Id) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empleado_manager","root","");
            //PreparedStatement ps=connection.prepareStatement("SELECT * FROM empleados WHERE id=);
            //ResultSet rs=ps.executeQuery();
            
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAODB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAODB.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
        return null;
    }
        
    
        
    
}
