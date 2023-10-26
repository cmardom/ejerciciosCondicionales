package org.example;

import java.util.Scanner;

/**Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int num = 0;
        int cifra = 0;
        int aux = 0;
        int alReves = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        num = sc.nextInt();
        aux = num;

        while (aux != 0){
            cifra = aux % 10;
            alReves = alReves * 10 + cifra;
            aux = aux / 10;
        }

        if (num == alReves){
            System.out.println("Es capicua");
        } else {
            System.out.println(("No es capicua"));
        }
    }
}