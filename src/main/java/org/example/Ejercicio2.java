package org.example;

import java.util.Scanner;

/*Diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde**/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu numero de DNI");
        int numDNI = sc.nextInt();

        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numDNI%23;
        char letra = caracteres.charAt(resto);

        System.out.println("La letra de tu DNI es " + letra);
    }
}
