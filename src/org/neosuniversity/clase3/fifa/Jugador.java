package org.neosuniversity.clase3.fifa;

public class Jugador {


    private String nombre;
    private double velocidad; //ms 0.0
    private int edad; //0

    public Jugador() { //constructor por default

    }

    public Jugador( String nombre, double velocidad , int edad  ) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.edad = edad;
    }

    public Jugador( String nombre) {
        this.nombre = nombre;
        System.out.println("En mi constructor con un parametro");
    }

    //refactorizacion
    // modificador (public /private, ) retorno nombreMetodo(argumentos)
    public void tirarAlArco(double velocidadInical, double angulo){
        double gravedad = 9.81;
        double radianes = Math.toRadians(angulo);
        double radianesAlcance = Math.toRadians(2*angulo);
        double sinCuadrado = Math.pow(Math.sin(radianes), 2);
        double altura = Math.pow(velocidadInical,2 ) * sinCuadrado / (2* gravedad);

        double alcance =  (Math.pow(velocidadInical,2 ) * Math.sin(radianesAlcance) )/ gravedad;

        System.out.println("Altura max  disparo: " + altura + " m/s");
        System.out.println("El alcance máximo es: " + alcance + "m");
    }

    public void tirarAlArcoMejorado(double velocidadInical, double angulo) {
        FifaMath math = new FifaMath();
        double altura = math.alturaMaxima(velocidadInical, angulo);
        double alcance = math.alcanceMaximo(velocidadInical, angulo);
        System.out.println("Altura max  disparo: " + altura + " m/s");
        System.out.println("El alcance máximo es: " + alcance + "m");
    }

    public boolean quitarBalon() {

        if (this.velocidad > 15) {
            return true; //si quita el balon
        } else {
            return false;
        }

    }

    public void imprimeFicha() {
        System.out.println("Nombre" + this.nombre
        );
        System.out.println("Edad : " + this.edad);
        System.out.println("Velocidad: " + this.velocidad);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
