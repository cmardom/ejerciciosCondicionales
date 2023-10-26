package org.example;
import java.util.Scanner;

/*Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre el equivalente en radianes.
Si el ángulo introducido por el usuario no se encuentra en el rango de 0º a 360º, hay que transformarlo a dicho rango.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce grados del ángulo: ");
        double grados = sc.nextDouble();

        if (grados > 360){
            System.out.println("No se puede calcular");
        } else {
            double angRadianes = Math.toRadians(grados);
            System.out.println("De Grados a Radianes: " + grados + "º = " + angRadianes + " rad");
        }
    }
}
