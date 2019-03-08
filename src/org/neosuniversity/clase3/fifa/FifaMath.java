package org.neosuniversity.clase3.fifa;

/**
 * En la tarea anterior calculaste la altura máxima y alcance máximo,
 * el código quedo definido en el método tirarAlArco(double velocidadInicial, double angulo),
 * ahora es necesario generar el código de altura máximo de un tiro y
 * alcance en una clase por separado, ya que programar en
 * este estilo te permite la reutilización.
 * */
public class FifaMath {


    public double alturaMaxima( double velocidadInicial, double angulo) {
        double gravedad = 9.81;
        double radianes = Math.toRadians(angulo);

        double sinCuadrado = Math.pow(Math.sin(radianes), 2);
        double altura = Math.pow(velocidadInicial,2 ) * sinCuadrado / (2* gravedad);

        return altura;

    }

    public double alcanceMaximo( double velocidadInicial, double angulo) {
        double gravedad = 9.81;
        double radianesAlcance = Math.toRadians(2*angulo);
        double alcance =  (Math.pow(velocidadInicial,2 ) * Math.sin(radianesAlcance) )/ gravedad;
        return alcance;
    }
}
