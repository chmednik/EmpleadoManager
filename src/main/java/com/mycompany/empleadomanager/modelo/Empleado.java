
package com.mycompany.empleadomanager.modelo;

public class Empleado {
    
    private String nombre;
    private Integer edad;
    private double sueldo;
    private Long id;
    private String dni;

    public Empleado(){
    
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
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

    public Integer getEdad() {
        return edad;
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
