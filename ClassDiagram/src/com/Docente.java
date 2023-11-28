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
    
    
}
