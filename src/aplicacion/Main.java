package aplicacion;
import mates.Mates;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Mates mates = new Mates();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        System.out.println("Elija una opción introduciendo un valor del 1 al 13: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                try {
                    System.out.print("Introduzca un numero entero: ");
                    int n = scanner.nextInt();
                    int sol1 = Mates.sumaN(n);
                    System.out.println("La suma de los numeros de 0 a " + n + " es: " + sol1);
                } catch (IllegalArgumentException e) {
                    // se detecta error en la funcion sumaN
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // se detecta error en la entrada de datos
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 2:
                try {
                    System.out.print("Introduzca un numero entero: ");
                    int n = scanner.nextInt();
                    int sol2 = Mates.factorial(n);
                    System.out.println("El factorial de " + n + " es " + sol2);
                } catch (IllegalArgumentException e) {
                    // se detecta error en la funcion factorial
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // se detecta error en la entrada de datos
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 3:
                try {
                    System.out.print("Introduzca un numero entero: ");
                    int n = scanner.nextInt();
                    System.out.print("Introduzca la potencia: ");
                    int p = scanner.nextInt();
                    int sol3 = Mates.potencia(n, p);
                    System.out.println("El resultado de elevar " + n + " a la " + p + " es " + sol3);
                } catch (IllegalArgumentException e) {
                    // se detecta error en la funcion potencia
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // se detecta error en la entrada de datos
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 4:
                try {
                    System.out.print("Introduzca el tamaño que desea para la lista: ");
                    int size = scanner.nextInt();
                    List<Integer> lista = new ArrayList<Integer>(size);

                    System.out.println("Introduzca los numeros que desea introducir en la lista: ");
                    for (int i = 0; i < size; i++) {
                        int num = scanner.nextInt();
                        lista.add(num);
                    }

                    int sol4 = Mates.sumList(lista);
                    System.out.println("La suma de los elementos de la lista es: " + sol4);

                } catch (IllegalArgumentException e) {
                    // se detecta error en la funcion sumList
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // se detecta error en la entrada de datos
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 5:
                try {
                    System.out.print("Introduzca el tamaño que desea para la lista: ");
                    int size = scanner.nextInt();
                    List<Integer> lista = new ArrayList<Integer>(size);

                    System.out.println("Introduzca los numeros que desea introducir en la lista: ");
                    for (int i = 0; i < size; i++) {
                        int num = scanner.nextInt();
                        lista.add(num);
                    }

                    int sol5 = Mates.calcularMedia(lista);
                    System.out.println("La media de los elementos de la lista es: " + sol5);

                } catch (IllegalArgumentException e) {
                    // se detecta error en la funcion sumList
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // se detecta error en la entrada de datos
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 6:
                try {
                    System.out.print("Introduzca el tamaño que desea para la lista: ");
                    int size = scanner.nextInt();
                    List<Integer> lista = new ArrayList<Integer>(size);

                    System.out.println("Introduzca los numeros que desea introducir en la lista: ");
                    for (int i = 0; i < size; i++) {
                        int num = scanner.nextInt();
                        lista.add(num);
                    }

                    double sol6 = Mates.calcularDesviacionEstandar(lista);
                    System.out.println("La desviación estándar de los elementos de la lista es: " + sol6);

                } catch (IllegalArgumentException e) {
                    // se detecta error en la funcion sumList
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // se detecta error en la entrada de datos
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 7:
                try {
                    System.out.print("Introduzca un numero entero: ");
                    int n = scanner.nextInt();
                    int sol7 = Mates.sumEven(n);
                    System.out.println("La suma de los numeros pares de 0 a " + n + " es: " + sol7);
                } catch (IllegalArgumentException e) {
                    // se detecta error en la funcion sumaN
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // se detecta error en la entrada de datos
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 8:
                try {
                    System.out.print("Introduzca el tamaño que desea para la lista: ");
                    int size = scanner.nextInt();
                    List<Integer> lista = new ArrayList<Integer>(size);

                    System.out.println("Introduzca los numeros que desea introducir en la lista: ");
                    for (int i = 0; i < size; i++) {
                        int num = scanner.nextInt();
                        lista.add(num);
                    }

                    int sol8 = Mates.recursiveEvenSumList(lista);
                    System.out.println("La suma de los elementos pares de la lista es: " + sol8);

                } catch (IllegalArgumentException e) {
                    // se detecta error en la funcion sumList
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // se detecta error en la entrada de datos
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 9:
                try {
                    System.out.print("Introduzca el tamaño que desea para la lista: ");
                    int size = scanner.nextInt();
                    List<Integer> lista = new ArrayList<Integer>(size);

                    System.out.println("Introduzca los numeros que desea introducir en la lista: ");
                    for (int i = 0; i < size; i++) {
                        int num = scanner.nextInt();
                        lista.add(num);
                    }

                    List<Integer> sol9 = Mates.getEvenNumbers(lista);

                } catch (IllegalArgumentException e) {
                    // se detecta error en la funcion sumList
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // se detecta error en la entrada de datos
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 10:
                try {
                    System.out.println("Introduzca un número entero: ");
                    int n = scanner.nextInt();

                    List<Integer> sol10 = Mates.evenNumbers(n);
                    System.out.println("La lista de numeros pares de 0 a " + n + " es: " + sol10);
                }

                catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 11:
                try{
                    System.out.print("Introduzca el tamaño que desea para las listas: ");
                    int size = scanner.nextInt();
                    List<Integer> lista1 = new ArrayList<Integer>(size);

                    System.out.println("Introduzca los numeros que desea introducir en la primera lista: ");
                    for (int i = 0; i < size; i++) {
                        int num = scanner.nextInt();
                        lista1.add(num);
                    }

                    List<Integer> lista2 = new ArrayList<Integer>(size);
                    System.out.println("Introduzca los numeros que desea introducir en la segunda lista: ");
                    for (int i = 0; i < size; i++) {
                        int num = scanner.nextInt();
                        lista2.add(num);
                    }

                    int sol11 = Mates.calculateDotProduct(lista1, lista2);
                    System.out.println("El producto escalar de las dos listas es: " + sol11);

                } catch (IllegalArgumentException e) {
                    // se detecta error en la funcion sumList
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // se detecta error en la entrada de datos
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 12:
                try{
                    System.out.println("Introduzca un número entero: ");
                    int n = scanner.nextInt();

                    double sol12 = Mates.fibonacci(n);
                    System.out.println("El elemento " + n + " de la sucesion de Fibonacci es: " + sol12);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

            case 13:
                try{
                    System.out.println("Introduzca un número entero: ");
                    int n = scanner.nextInt();

                    double sol13 = Mates.fibonacciQuotient(n);
                    System.out.println("El cociente entre el elemento " + n + " y el elemento " + (n-1) +
                            " de la sucesion de Fibonacci es: " + sol13);
                }
                catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Error: Input invalido. Por favor introduzca un numero entero.");
                }
                break;

        }
    }
}

