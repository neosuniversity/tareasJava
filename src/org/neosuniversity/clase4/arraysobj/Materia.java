package org.neosuniversity.clase4.arraysobj;



public class Materia {

    private String nombre;
    private double calificacion;

    public Materia(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }

    public String infoMateria(){
        return this.nombre + " = " + this.calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


}

