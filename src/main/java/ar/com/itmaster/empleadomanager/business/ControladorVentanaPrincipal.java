package ar.com.itmaster.empleadomanager.business;

import ar.com.itmaster.empleadomanager.persistencia.DAO;
import ar.com.itmaster.empleadomanager.persistencia.DAODB;
import ar.com.itmaster.empleadomanager.persistencia.DBInMemory;
import com.mycompany.empleadomanager.modelo.Empleado;

public class ControladorVentanaPrincipal {
    
    public static void grabarEmpleado(Empleado emp){
        //Validaciones del negocio
        DAO dao = new DAODB();
        dao.almacenar(emp);
        
    }
}
