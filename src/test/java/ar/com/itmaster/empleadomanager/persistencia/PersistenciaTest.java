
package ar.com.itmaster.empleadomanager.persistencia;

import com.mycompany.empleadomanager.modelo.Empleado;
import org.junit.Test;
import static org.junit.Assert.*;


public class PersistenciaTest {
    
    public PersistenciaTest() {
    }
    
    @Test
    public void testSalvarEmpleado(){
        Empleado empleado = new Empleado();
        
        empleado.setNombre("Cosme");
        empleado.setEdad(67); 
    
        DBInMemory db = new DBInMemory();
        
        db.almacenar(empleado);
        Empleado empleadoDesdeLaBase = db.buscarEmpleado(empleado.getId());
        
        assertEquals(empleado, empleadoDesdeLaBase);
        
    }
    
    public void testSalvarEmpleadoEnArchivo(){
        Empleado empleado = new Empleado();
        
        empleado.setNombre("Cosme Fulanito");
        empleado.setEdad(34);
        
        DAO db = new DBInFile();
        db.almacenar(empleado);
        
        Long id= empleado.getId();
        Empleado empleadoDB=db.buscarEmpleado(id);
        
        assertEquals(empleadoDB,empleado);
        
        
        
    }
    
}
