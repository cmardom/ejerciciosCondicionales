package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;
//En una granja se compra diariamente una cantidad (comidantaria) de comida para los animales.
// El número de animales que alimentar (todos de la misma especie) es numanimales,y sabemos que cada animal come una medía
//  de kilosporAnimal.
//  Diseña un programa que solicite al usuario los valores anteriores y
//  determine si disponemos de alimento suficiente para cada animal.
//  En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
// Nota: Evitar que la aplicación realice divisiones por cero.

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cantidad de comida que se ha comprado");
        double comidantaria = sc.nextInt();

        System.out.println("Introduce cuántos animales quieres alimentar");
        int numanimales = sc.nextInt();

        System.out.println("Introduce cuántos kilos come cada animal");
        double kilosporanimal = sc.nextInt();

        if (kilosporanimal * numanimales > comidantaria){
            System.out.println("No hay comida suficiente");
            System.out.println("Necesitas comprar " + (kilosporanimal * numanimales) + " kilos. Te faltan " + (kilosporanimal * numanimales - comidantaria) + " kilos");
        } else {
            System.out.println("Hay alimento para todos. Cada animal comerá " + (comidantaria / kilosporanimal) + "kilos");
        }
    }

}
