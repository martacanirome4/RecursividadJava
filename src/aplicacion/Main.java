package aplicacion;
import mates.Mates;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mates mates = new Mates();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduzca un numero entero: ");
            int n = scanner.nextInt();
            int suma = Mates.sumaN(n);
        } catch (IllegalArgumentException e) {
            // se detecta error en la funcion sumaN
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // se detecta error en la entrada de datos
            System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
        }
        scanner.close();
    }
}

