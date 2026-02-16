import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner numero = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        //Ejercicio 1.

        System.out.print("¿Cuántos números quieres introducir?: ");
        int tamanio = numero.nextInt();

        int [] array = new int [tamanio];
        int suma = 0;

        System.out.println("Introduce " + tamanio + " números: ");
        for (int i = 0; i < array.length; i++) {
            array [i] = numero.nextInt();
        }

        System.out.println("Estos son los números del array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array [i]);
        }


        Arrays.sort(array);
        System.out.println("Ordenados de menor a mayor.");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        for (int i = 0; i < array.length; i++) {
            suma += array [i];
        }
        System.out.println("La suma de los " + tamanio + " números es: " + suma);
        double media = (double) suma / array.length;
        System.out.println("La media entre los " + tamanio + " números es: " + media);


        int numeroMenor = 999;
        int numeroMayor = 0;
        int negativos = 0;
        int positivos = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < numeroMenor) {
                numeroMenor = array[i];
            }

            if (array[i] > numeroMayor) {
                numeroMayor = array[i];
            }

            if (array[i] < 0) {
                negativos++;
            } else {
                positivos++;
            }
        }
        System.out.println("El número menor es: " + numeroMenor);
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("Hay " + negativos + " números negativos.");
        System.out.println("Hay " + positivos + " números positivos.");

         */




        //Ejercicio 2.

        int [] edades = new int [5];
        int edadMin = 999;
        int edadMax = 0;
        int menorEdad = 0;
        int mayorEdad = 0;

        System.out.println("Introduce 5 edades (enteros): ");
        for (int i = 0; i < edades.length; i++) {
            edades [i] = numero.nextInt();

            if (edades[i] < edadMin) {
                edadMin = edades[i];
            }

            if (edades[i] > edadMax) {
                edadMax = edades[i];
            }

            if (edades[i] < 18) {
                menorEdad++;
            } else {
                mayorEdad++;
            }

        }

        System.out.println("Estas son las edades introducidas");
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }


        double edadMedia;
        int acumulador = 0;
        for (int i = 0; i < edades.length; i++) {
            acumulador += edades[i];
        }
        edadMedia = (double) acumulador / edades.length;


        Arrays.sort(edades);
        System.out.println("Ordenadas de menor a mayor.");
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }

        System.out.println("La edad mínima es " + edadMin + " años.");
        System.out.println("La edad máxima es " + edadMax + " años.");
        System.out.println("Hay " + menorEdad + " personas menores de edad.");
        System.out.println("Hay " + mayorEdad + " personas mayores de edad.");
        System.out.println("La media de edad es " + edadMedia + " años.");



        /*
        //Ejercicio 3.

        Random aleatorio = new Random();
        int [] numAleatorios = new int[10];

        for (int i = 0; i < numAleatorios.length; i++) {
            numAleatorios[i] = aleatorio.nextInt(1, 100);
        }


        System.out.println("Los diez números aleatorios son: ");
        for (int i = 0; i < numAleatorios.length; i++) {
            System.out.println((i + 1) + ". " + numAleatorios[i]);
        }


        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios.length - 1; j++) {
                if (numAleatorios[j] < numAleatorios[j + 1]) { // Si el de la izquierda es menor, los intercambio
                    int aux = numAleatorios[j];
                    numAleatorios[j] = numAleatorios[j + 1];
                    numAleatorios[j + 1] = aux;
                }
            }
        }
        System.out.println();
        System.out.println("Ordenado de mayor a menor: ");
        for (int i = 0; i < numAleatorios.length; i++) {
            System.out.println((i + 1) + ". " + numAleatorios[i]);
        }


        System.out.println();
        System.out.println("Mostrando solo los números pares: ");
        for (int i = 0; i < numAleatorios.length; i++) {
            if (numAleatorios[i] % 2 == 0) {
                System.out.println((i + 1) + ". " + numAleatorios[i]);
            }
        }
         */

    }
}