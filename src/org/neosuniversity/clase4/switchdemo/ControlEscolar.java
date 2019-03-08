package org.neosuniversity.clase4.switchdemo;

import org.neosuniversity.clase4.arraysobj.Estudiante;

import java.util.Scanner;

/**
 *
 * En el desarrollo de la clase anterior creamos código estructurado,
 * nuestro líder de proyecto nos indicó que debemos transformarlo a Orientación a Objetos
 * ya que el código generado no cumple con los estándares.
 * */
public class ControlEscolar {


    private Estudiante[] estudiantes = new Estudiante[200];
    private int index = 0;

    public void muestraMenu() {
        System.out.println("------------------------");

        System.out.println("Seleccione una opcion");
        System.out.println("------------------------");
        System.out.println("1 Agregar un nuevo estudiante");
        System.out.println("2. Listar Estudiantes");
        System.out.println("3. Numero de Estudiantes");
        System.out.println("4. Salir");

    }

    public void agregaEstudiante(Estudiante estudiante){
        estudiantes[index] = estudiante;
        index++;
    }

    public Estudiante capturaEstudiante(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del estudiante");

        String nombre = scanner.nextLine();
        System.out.println("Apellido");
        String apellido = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombre, apellido);
        return estudiante;
    }

    public  void imprimeEstudiantes() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(estudiantes[i]);
        }

    }


    public void app() {
        int opcion;
        do {
            this.muestraMenu();
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Estudiante estudiante = this.capturaEstudiante();
                    this.agregaEstudiante(estudiante);
                    break;
                case 2:
                    this.imprimeEstudiantes();
                    break;
                case 3:
                    System.out.println("Total de estudiantes: " + index);
                    break;
                case 4:
                    System.out.println("Adios!!!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 4);
    }
}
