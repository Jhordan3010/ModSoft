package com;
public class Persona {
    protected String dni;
    protected String nombre;
    protected boolean genero;
    protected Fecha fechaNac;
    
    public Persona(String dni, String nombre, boolean genero, Fecha fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNac = fechaNac;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }
    
}
