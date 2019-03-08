package org.neosuniversity.clase4.arraysobj;

public class MateriaApp {

    public static void main(String[] args) {


        Materia [] materias = new Materia[2];

        materias[0] = new Materia("Matematicas", 78);
        materias[1] = new Materia("Español", 56);

        for(Materia materia : materias) {
            System.out.println("Nombre: " + materia.getNombre()
                    + " calificacion= " +  materia.getCalificacion());
        }

    }
}
