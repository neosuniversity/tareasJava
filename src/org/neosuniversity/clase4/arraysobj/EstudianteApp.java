package org.neosuniversity.clase4.arraysobj;


public class EstudianteApp {

    public static void main(String[] args) {

        Materia[] materias = new Materia[2];

        materias[0] = new Materia("Matematicas", 78);
        materias[1] = new Materia("Español", 56);

        Estudiante estudiante = new Estudiante("Mario ", materias);
        estudiante.setApellidos("Hidalgo");

        estudiante.imprimeBoleta();

    }
}
