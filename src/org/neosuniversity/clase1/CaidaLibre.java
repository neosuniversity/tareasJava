package org.neosuniversity.clase1;

/**
 *  Desde lo alto de un edificio se deja caer una pelota, dicha pelota
 *  tarda en caer 3 seg en caer al suelo ¿ Cual es la velocidad en que topa el piso?
 *  ¿Que altura tiene el edificio?*/
public class CaidaLibre {

    public static void main(String[] args) {

        double vfinal;
        double vinicial= 0;
        int tiempo= 3;
        double gravedad = 9.81;//
        double altura;

        vfinal = vinicial + gravedad*tiempo;
        altura = vinicial*tiempo + 0.5*gravedad*Math.pow(tiempo,2);

        System.out.println("La velocidad final es: " + vfinal);
        System.out.println("La altura del edificio es: " + altura);
    }

}
