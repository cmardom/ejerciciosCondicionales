package org.example;

import java.util.Scanner;

/**Escribe un programa que solicite al usuario un número comprendido entre 1 y 99. El programa debe mostrarlo con letras, por ejemplo, para 56, se verá: «Cincuenta y seis».*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 1 y 99");
        int num = sc.nextInt();
        int decenaInt = num / 10;
        int unidadInt = (num % 10) / 1;

        String unidadString = "";
        String decenaString = "";

        if (unidadInt == 1){
            unidadString = "uno";
        } else if (unidadInt == 2){
            unidadString = "dos";
        } else if (unidadInt == 3){
            unidadString = "tres";
        } else if (unidadInt == 4){
            unidadString = "cuatro";
        } else if (unidadInt == 5){
            unidadString = "cinco";
        } else if (unidadInt == 6){
            unidadString = "seis";
        } else if (unidadInt == 7){
            unidadString = "siete";
        } else if (unidadInt == 8){
            unidadString = "ocho";
        } else if (unidadInt == 9){
            unidadString = "nueve";
        }

        String diezA19 = "";
        if (decenaInt == 1 && unidadInt == 0){
            diezA19 = "diez";
        } else if (decenaInt == 1 && unidadInt == 1){
            diezA19 = "once";
        } else if (decenaInt == 1 && unidadInt == 2){
            diezA19 = "doce";
        } else if (decenaInt == 1 && unidadInt == 3){
            diezA19 = "trece";
        } else if (decenaInt == 1 && unidadInt == 4){
            diezA19 = "catorce";
        } else if (decenaInt == 1 && unidadInt == 5){
            diezA19 = "quince";
        } else if (decenaInt == 1 && unidadInt == 6){
            diezA19 = "dieciséis";
        } else if (decenaInt == 1 && unidadInt == 7){
            diezA19 = "diecisiete";
        } else if (decenaInt == 1 && unidadInt == 8){
            diezA19 = "dieciocho";
        } else if (decenaInt == 1 && unidadInt == 9){
            diezA19 = "diecinueve";
        }

        if (decenaInt == 2){
            decenaString = "veinte";
        } else if (decenaInt == 3){
            decenaString = "treinta";
        } else if (decenaInt == 4){
            decenaString = "cuarenta";
        } else if (decenaInt == 5){
            decenaString = "cincuenta";
        } else if (decenaInt == 6){
            decenaString = "sesenta";
        } else if (decenaInt == 7){
            decenaString = "setenta";
        } else if (decenaInt == 8){
            decenaString = "ochenta";
        } else if (decenaInt == 9){
            decenaString = "noventa";
        }

        if (num < 10){
            System.out.println("El numero es " + unidadString);
        } else if (num < 20) {
            System.out.println("El numero es " + diezA19);
        } else if (num < 100) {
            if (num % 10 == 0){
                System.out.println("El numero es " + decenaString);

            } else {
                System.out.println("El numero es " + decenaString + unidadString);
            }
        } else if (num < 99) {
            System.out.println("Debes introducir un numero menor de 99");
        }

    }
}
