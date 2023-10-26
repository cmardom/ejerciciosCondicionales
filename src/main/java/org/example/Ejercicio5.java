package org.example;
import java.util.Scanner;
/*Escribe una aplicación que solicite por consola dos números reales que corresponden a la base y la altura de un triángulo. Deberá mostrarse su área,
comprobando que los números introducidos por el usuario no son negativos, algo que no tendría sentido.*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean bucle = true;


        System.out.println("Introduce la base del triangulo");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura del triangulo");
        double altura = sc.nextDouble();

        if (base < 0){
           System.out.println("La base es negativa, introduce otra:");
           base = sc.nextDouble();
        }

        if (altura < 0){
           System.out.println("La altura es negativa, introduce otra:");
           altura = sc.nextDouble();
        }

        double resultado = (base * altura) / 2;
        System.out.println("El area del triangulo es " + resultado);

    }
}
