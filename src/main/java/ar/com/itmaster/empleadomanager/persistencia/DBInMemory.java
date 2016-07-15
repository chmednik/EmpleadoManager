
package ar.com.itmaster.empleadomanager.persistencia;

import com.mycompany.empleadomanager.modelo.Empleado;
import java.util.HashMap;
import java.util.Map;

public class DBInMemory {

    private Long lastID = 0L;
    private Map<Long,Empleado> datos = new HashMap<>();
    
    public void almacenar(Empleado empleado){ 
    
        //Validaciones
        if (empleado == null)
            throw new IllegalArgumentException ("El empleado no contiene datos");
    
        lastID = lastID + 1L;
        datos.put(lastID, empleado);
        empleado.setId(lastID);
    }

    public Empleado buscarEmpleado(Long id) {
            return datos.get(id);
    }
    
    //Hacer remover y modificar
}
