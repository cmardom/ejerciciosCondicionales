package org.example;

import java.util.Scanner;

/*Utiliza el operador ternario o el condicional para calcular el valor absoluto de un número que se solicita al usuario por teclado.
Si el valor es positivo mostrará el número tal cual y si es negativo que muestre el valor absoluto.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe un numero:");
        int numero = sc.nextInt();
        int absoluto = numero < 0 ? -numero : numero;

        System.out.println("El valor absoluto de " + numero + " es " + absoluto);



    }
}
