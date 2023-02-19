package aplicacion;
import mates.Mates;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca un número entero:");
        int n = keyboard.nextInt();
        System.out.println("El resultado de la suma de los números del 0 al "+ n + " es: " + Mates.sumN(n));

        keyboard.close();


    }
}
