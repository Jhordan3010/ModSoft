package com;
public class Estudiante extends Persona{
    private String codMateria;
    private String carrera;
    private int nivelCarrera;
    private int nota1;
    private int nota2;

    public Estudiante(String codMateria, String carrera, int nivelCarrera, int nota1, int nota2, String dni, String nombre, boolean genero, Fecha fechaNac) {
        super(dni, nombre, genero, fechaNac);
        this.codMateria = codMateria;
        this.carrera = carrera;
        this.nivelCarrera = nivelCarrera;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNivelCarrera() {
        return nivelCarrera;
    }

    public void setNivelCarrera(int nivelCarrera) {
        this.nivelCarrera = nivelCarrera;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    
     
}
