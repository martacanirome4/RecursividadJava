package aplicacion;
import mates.Mates;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            // Obtener los resultados de los ejercicios 1-3, 6, 9, 11
            System.out.println("Introduce un número entero: ");
            int n = sc.nextInt();
            sol1 = Mates.sumN(n);
            sol2 = Mates.factorial(n);
            sol3 = Mates.potencia(n, n);
            sol6 = Mates.primos(n);
            sol9 = Mates.recursiveEvenListN(n);
            return sol1, sol2, sol3, sol6, sol9;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}
