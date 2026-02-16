import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner numero = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        //Ejercicio 1.

        int [] array = new int [5];
        int suma = 0;

        System.out.println("Introduce 5 números: ");
        for (int i = 0; i < array.length; i++) {
            array [i] = numero.nextInt();
        }

        System.out.println("Estos son los números del array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array [i]);
        }


        for (int i = 0; i < array.length; i++) {
            suma += array [i];
        }
        System.out.println("La suma de los cinco números es: " + suma);
        double media = (double) suma / array.length;
        System.out.println("La media entre los cinco números es: " + media);


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


        int rango0_17 = 0;
        int rango18_30 = 0;
        int rango31_50 = 0;
        int rango51 = 0;

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 0 && edades[i] < 18) {
                rango0_17++;
            } else if (edades[i] >= 18 && edades[i] < 31) {
                rango18_30++;
            } else if (edades[i] >= 31 && edades[i] < 51) {
                rango31_50++;
            } else {
                rango51++;
            }
        }


        System.out.println("La edad mínima es " + edadMin + " años.");
        System.out.println("La edad máxima es " + edadMax + " años.");
        System.out.println("Hay " + menorEdad + " personas menores de edad.");
        System.out.println("Hay " + mayorEdad + " personas mayores de edad.");
        System.out.println("Hay " + rango0_17 + " persona(s) en el rango 0-17, " + rango18_30 + " en el rango 18-30, " + rango31_50 +
                " en el rango 31-50 y " + rango51 + " en el rango +51.");

        if (menorEdad == 0) {
            System.out.println("Todas las personas son mayores de edad.");
        } else {
            System.out.println("NO todas las personas son mayores de edad.");
        }


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