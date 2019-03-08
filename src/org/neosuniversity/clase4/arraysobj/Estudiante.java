package org.neosuniversity.clase4.arraysobj;


/**
 * Modifique la clase Estudiante para que en lugar de tener un array de tipo double,
 * utilice un array de tipo
 * Materia.
 * */

public class Estudiante {

    private String nombre;
    private String apellidos;
    private Materia[] materias;

    public Estudiante(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Estudiante() {
        materias = new Materia[10];
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    public double promedio(){

        double suma = 0;
        for (Materia materia : materias){
            double calificacion = materia.getCalificacion();

            suma = suma + calificacion;
        }
        double  promedio = suma/ materias.length;
        return promedio;
    }

    public void imprimeBoleta(){
        System.out.println("Nombre: " + this.nombre + " " + this.apellidos);
        System.out.println("Materias : ");
        System.out.println("-----------------");
        for(Materia materia : materias) {
            System.out.println("Nombre: " + materia.getNombre()
                    + " calificacion= " +  materia.getCalificacion());
        }
        System.out.println( "Promedio: " + this.promedio());
    }

    public Estudiante(String nombre, Materia[] materias) {
        this.nombre = nombre;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


}
