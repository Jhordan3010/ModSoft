package com;

public class Docente extends Persona {

    private double sueldo;
    private String titulo;
    private int horasTrab;

    public Docente(String dni, String nombre, boolean genero, Fecha fechaNac, double sueldo, String titulo, int horasTrab) {
        super(dni, nombre, genero, fechaNac);
        this.sueldo = sueldo;
        this.titulo = titulo;
        this.horasTrab = horasTrab;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }
    
    
}
