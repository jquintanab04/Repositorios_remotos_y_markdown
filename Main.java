import java.sql.Array;
import java.util.Scanner;

public class Main {

    public static Scanner numero = new Scanner(System.in);

    public static void main(String[] args) {

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

    }
}