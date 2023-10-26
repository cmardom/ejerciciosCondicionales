package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

/*Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Responde a las siguientes preguntas del cuestionario");
        System.out.println("Introduce 1 para contestar afirmativamente, o 0 para contestar negativamente");

        System.out.println("¿Un algoritmo es una secuencia de pasos que resuelve un problema?");
        int entrada1 = sc.nextInt();
        System.out.println("¿La memoria RAM es una forma de almacenamiento permanente?");
        int entrada2 = sc.nextInt();
        System.out.println("¿El lenguaje de programación Python es ampliamente utilizado en desarrollo web?");
        int entrada3 = sc.nextInt();
        System.out.println("¿El lenguaje de máquina es directamente comprensible por los humanos?");
        int entrada4 = sc.nextInt();
        System.out.println("¿Los bucles (loops) son utilizados para repetir un conjunto de instrucciones?");
        int entrada5 = sc.nextInt();
        System.out.println("¿Los sistemas operativos son software que gestionan los recursos de una computadora?");
        int entrada6 = sc.nextInt();
        System.out.println("¿La programación orientada a objetos es un paradigma de programación?");
        int entrada7 = sc.nextInt();
        System.out.println("¿Los compiladores traducen código fuente a código máquina?");
        int entrada8 = sc.nextInt();
        System.out.println("¿La dirección IP 127.0.0.1 siempre se refiere a la propia computadora (localhost)?");
        int entrada9 = sc.nextInt();
        System.out.println("¿Un firewall es una medida de seguridad que protege una red de intrusiones no autorizadas?");
        int entrada10 = sc.nextInt();


        //soluciones
        int recuento = 0;
        if (entrada1 == 1){
            recuento+=1;
        }
        if (entrada2 == 0){
            recuento+=1;

        }
        if (entrada3 == 1){
            recuento+=1;

        }
        if (entrada4 == 0){
            recuento+=1;

        }
        if (entrada5 == 1){
            recuento+=1;

        }
        if (entrada6 == 1){
            recuento+=1;

        }
        if (entrada7 == 1){
            recuento+=1;

        }
        if (entrada8 == 1){
            recuento+=1;

        }
        if (entrada9 == 1){
            recuento+=1;

        }
        if (entrada10 == 1){
            recuento+=1;

        }

        System.out.println("Tu puntuación ha sido: " + recuento);

    }
}
