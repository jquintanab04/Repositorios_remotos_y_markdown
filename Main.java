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



    }
}