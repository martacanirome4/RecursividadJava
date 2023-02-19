package aplicacion;
import mates.Mates;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        System.out.println("El resultado de la suma de los números del 0 al "+ n + " es: " + Mates.sumN(n));

        System.out.println("El factorial de " + n + " es: " + Mates.factorial(n));

        System.out.println("La potencia de n-esima de " + n + " es: " + Mates.potencia(n, n));

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);

        //System.out.println("La suma de los elementos de la lista " + list1 + " es: " + Mates.calculateSumRecursive(arr));

        System.out.println("La media aritmética de la lista " + list1 + " es: " + Mates.recursiveAverage(list1));

        System.out.println("La desviación típica de la lista " + list1 + " es: "
                                                        + Mates.recursiveStandardDeviation(list1));

        System.out.println("La suma de los números pares de 0 a "+ n + " es: " + Mates.sumEven(n));

        System.out.println("La suma de los números pares de la lista "+ list1 + " es: "
                                                        + Mates.recursiveEvenSumList(list1));

        //System.out.println("Los números pares de la lista "+ list1 + " son: " + Mates.getEvenNumbers(list1));

        System.out.println("La lista que contiene los números pares de 0 a "+ n +" es: "
                                                        + Mates.recursiveEvenListN(n));

        List<Integer> list2 = Arrays.asList(4, 5, 6, 7);

        int dotProduct = Mates.calculateDotProduct(list1, list2);
        System.out.println("El producto escalar de las listas "+ list1 + " y " + list2 + " es: "
                                                        + Mates.calculateDotProduct(list1, list2));

        double quotient = Mates.fibonacciQuotient(13);
        System.out.println("El cociente entre el elemento 13 y 12 de la sucesión de Fibonacci es: "+ quotient);

    }

}
