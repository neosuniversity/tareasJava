package org.neosuniversity.clase2;

public class Diccionario {


    /**
     * Una aplicación necesita una funcionalidad para realizar la comparación entre palabras usando las
     * siguientes reglas (posteriormente se usara en un diccionario web).
     * Regla 1 si como entrada tenemos las palabras pera y mango al imprimir el diccionario,
     * la palabra "mango" deberá imprimirse antes que la palabra “pera” del diccionario.
     * Regla 2 si introducimos la palabra lapiz y lapiz deberá imprimir “las palabras son iguales”.
     * Regla 3 si introducimos la palabra azul y rosa al imprimir el diccionario, la palabra azul deberá
     * imprimirse antes que la palabra rosa del diccionario.
     * TIP: int compareTo (String otroString): Compara dos cadenas lexicográficamente. (Parte de la clase
     * String)
     * */
    public static void main(String[] args) {


        //String cadena1 = "pera";
        //String cadena2 = "mango";

        //String cadena1="lapiz";
        //String cadena2 = "lapiz";

        String cadena1="azul";
        String cadena2 = "rosa";

        int comp = cadena1.compareTo(cadena2);

        if ( comp< 0 ) {
            System.out.println("La palabra " + cadena1 + " deberá imprimirse antes de " + cadena2);
        }else if (comp > 0){
            System.out.println("La palabra " + cadena1 + " deberá imprimirse despues de " + cadena2);
        } else {
            System.out.println("Las palabras son iguales");
        }

    }
}
