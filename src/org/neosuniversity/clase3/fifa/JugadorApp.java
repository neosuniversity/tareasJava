package org.neosuniversity.clase3.fifa;

public class JugadorApp {

    public static void main(String[] args) {


        Jugador jugador = new Jugador("Lionel Messi", 10, 31);
        jugador.tirarAlArco(30,48);
        System.out.println(" --------------------------------");
        jugador.tirarAlArcoMejorado(30,48);
    }
}
