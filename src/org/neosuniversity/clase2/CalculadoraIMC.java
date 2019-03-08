package org.neosuniversity.clase2;


/**En un hospital se necesita una calculadora de Índice de masa corporal (IMC),
 * la calculadora deberá tener como variables los siguientes valores:
 * el peso expresado en Kg y la estatura expresada en mts.
 * La calculadora imprimirá en pantalla el IMC y
 * una frase de motivación para el paciente.*/
public class CalculadoraIMC {

    public static void main(String[] args) {
        double peso = 70;
        double estatura = 1.62;

        double imc= peso/(estatura*estatura);

        System.out.println("SU IMC ES: "+imc);

        if (imc<18.5) {
            System.out.println("Usted se encuentra con bajo peso, coma mucha Proteina");
        } else if (imc>=18.5 && imc<=24.9) {
            System.out.println("Usted se encuentra con Peso Normal, no olvide que es importante" +
                    " continuar con sus hábitos saludables ");
        } else if (imc>=25 && imc<=29.9) {
            System.out.println("Usted se encuentra en Sobrepeso recuerde que debe realizar ejercicio por lo menos 3 veces por semana");
        } else {
            System.out.println("Usted se encuentra con Obesidad, es necesario que un profesional de la salud controle" +
                    " su peso, comience con una dieta saludable y equilibrada.");
        }
    }
}
