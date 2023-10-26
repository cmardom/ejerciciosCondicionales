package org.example;

import java.util.Scanner;

/*Modifica la Actividad 7 para que, además de los dos números aleatorios,
también aparezca la operación que debe realizar el jugador: suma, resta o multiplicación.
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random1 = (int)(Math.random() *100+1);
        int random2 = (int)(Math.random() *100+1);

        System.out.println("Elige qué operación quieres realizar con estos dos números,a ver si aciertas: " + random1 + " + " + random2);
        System.out.println("Suma = +");
        System.out.println("Resta = -");
        System.out.println("Multiplicacion = *");
        System.out.println("División = /");
        String operacion = sc.nextLine();

        int resultado = 0;
        if (operacion.equals("+")){
            resultado = random1 + random2;
        } else if (operacion.equals("-")){
            resultado = random1 - random2;
        } else if (operacion.equals("*")){
            resultado = random1 * random2;
        } else if (operacion.equals("/")){
            resultado = random1/random2;
        }

        int entrada = sc.nextInt();

        String salida = entrada == resultado ? "Has acertado" : "No has acertado";
    }
}
