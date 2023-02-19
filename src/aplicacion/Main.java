package aplicacion;
import mates.Mates;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca un número entero:");
        int n = keyboard.nextInt();
        System.out.println("El resultado de la suma de los números del 0 al "+ n + " es: " + Mates.sumN(n));
        System.out.println("El factorial de " + n + " es: " + Mates.factorial(n));
        System.out.println("La potencia de n-esima de " + n + " es: " + Mates.potencia(n, n));
         keyboard.close();
         List<Integer> list1 = Arrays.asList(1, 2, 3);
         List<Integer> list2 = Arrays.asList(4, 5, 6);
         int dotProduct = Mates.calculateDotProduct(list1, list2);
         System.out.println("Dot product: " + dotProduct);
        double quotient = Mates.fibonacciQuotient(13);
        System.out.println("El cociente entre el elemento 13 y 12 de la sucesión de Fibonacci es: "+ quotient);
    }

}
