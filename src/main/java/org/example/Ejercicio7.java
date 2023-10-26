package org.example;

import java.util.Scanner;
/*Realiza el «Juego de la suma», que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99)
que el usuario tiene que sumar. La aplicación debe indicar si
el resultado de la operación es correcto o incorrecto.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random1 = (int)(Math.random() *100+1);
        int random2 = (int)(Math.random() *100+1);

        System.out.println("Suma estos dos números,a ver si aciertas: " + random1 + " + " + random2);
        int entrada = sc.nextInt();

        String resultado = entrada == random1 + random2 ? "Has acertado" : "No has acertado";
        System.out.println(resultado);
    }
}
