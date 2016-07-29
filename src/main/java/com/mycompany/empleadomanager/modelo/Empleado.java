
package com.mycompany.empleadomanager.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado {
    
    private String nombre;
    private LocalDate fechaNacimiento;
    private double sueldo;
    private Long id;
    private String dni;

    public Empleado(){
    
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNac) {
        this.fechaNacimiento = fechaNac;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Long getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }
    
    
}
