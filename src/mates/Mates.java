package mates;
import java.util.Arrays;
import java.util.List;
import static java.lang.Math.*;

public class Mates {

    /**
     *
     * @param n - número entero
     * @return - la suma de los números de 0 a n
     */
    public static int sumN (int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumN(n - 1);
        }
    }


    /**
     * Calcula el factorial de un número entero
     * @param n - número entero
     * @return - el factorial de n
     */
    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    /**
     * Calcula la potencia de un número entero
     * @param n - número entero
     * @param p - potencia
     * @return - el resultado de elevar n a la p, le pasaremos como valor también n
     */
    public static int potencia (int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            return n * potencia(n, p - 1);
        }
    }


    /**
     * Calcula la suma de los elementos de un array de enteros
     * @param T - array de enteros
     * @return - la suma de los elementos del array
     */
    public static int suma (int[]T) {
        if (T.length == 0) {
            return 0;
        }
        else{
            return T[T.length - 1] + suma(T, T.length - 2);
        }
    }
    public static int suma (int[]T, int i) {
        if (i == 0) {
            return T[0];
        }
        else {
            return T[i] + suma(T, i-1) ;
        }
    }


    /**
     * Calcula la media de los elementos de una lista de enteros
     * @param numbers - lista de enteros
     * @return - la media de los elementos de la lista
     */
    public static double recursiveAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.size() == 1) {
            return numbers.get(0);
        } else {
            int sum = numbers.stream().mapToInt(Integer::intValue).sum();
            return sum / (double) numbers.size();
        }
    }


    /**
     * Calcula la desviación típica de una lista de enteros
     * @param numbers - lista de enteros
     * @return - la desviación típica de la lista
     */
    public static double recursiveStandardDeviation(List<Integer> numbers) {
        double average = recursiveAverage(numbers);

        if (numbers.size() <= 1) {
            return 0;
        } else {
            double variance = numbers.stream()
                    .mapToDouble(num -> Math.pow(num - average, 2))
                    .sum() / (double) (numbers.size() - 1);

            return Math.sqrt(variance);
        }
    }


    /**
     * Calcula la suma de los números pares de 0 a n
     * @param n - número entero mayor o igual que 2
     * @return - la suma de los números pares de 0 a n
     */
    public static int recursiveEvenSum(int n) {
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 2;
        } else {
            int sum = recursiveEvenSum(n - 2);
            return n % 2 == 0 ? sum + n : sum;
        }
    }


    /**
     * Calcula la suma de los números pares de una lista de enteros
     * @param numbers - lista de enteros
     * @return - la suma de los números pares de la lista
     */
    public static int recursiveEvenSum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            int lastNumber = numbers.get(numbers.size() - 1);
            List<Integer> remainingNumbers = numbers.subList(0, numbers.size() - 1);
            int sum = recursiveEvenSum(remainingNumbers);
            return lastNumber % 2 == 0 ? sum + lastNumber : sum;
        }
    }


    /**
     * Obtiene la lista de los números pares de una lista de enteros
     * @param numbers - lista de enteros
     * @return - la lista de los números pares de la lista
     */
    public static List<Integer> recursiveEvenList(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return new ArrayList<Integer>();
        } else {
            int lastNumber = numbers.get(numbers.size() - 1);
            List<Integer> remainingNumbers = numbers.subList(0, numbers.size() - 1);
            List<Integer> evenList = recursiveEvenList(remainingNumbers);
            if (lastNumber % 2 == 0) {
                evenList.add(lastNumber);
            }
            return evenList;
        }
    }


    /**
     * Obtiene la lista de los números pares de 0 a n
     * @param n - número entero mayor o igual que 2
     * @return - la lista de los números pares de 0 a n
     */
    public static List<Integer> recursiveEvenList(int n) {
        if (n < 2) {
            return new ArrayList<Integer>();
        } else {
            List<Integer> evenList = recursiveEvenList(n - 2);
            if (n % 2 == 0) {
                evenList.add(n);
            }
            return evenList;
        }
    }


    /**
     * Calcula el producto escalar de dos vectores
     * @param list1 - lista de enteros
     * @param list2 - lista de enteros
     * @return - el producto escalar de los dos vectores
     */
    public static int calculateDotProduct(List<Integer> list1, List<Integer> list2) {
        return calculateDotProductRecursive(list1, list2, 0, 0, 0);
    }
    public static int calculateDotProductRecursive(List<Integer> list1, List<Integer> list2, int index, int product, int sum) {
        if (index == list1.size()) {
            return sum;
        }
        product = list1.get(index) * list2.get(index);
        sum += product;
        return calculateDotProductRecursive(list1, list2, index + 1, 0, sum);
    }


    /**
     * Calcula el cociente entre el elemento n y el elemento n-1 de la sucesión de Fibonacci
     * @param n - número entero
     * @return - el cociente entre el elemento n y el elemento n-1 de la sucesión de Fibonacci
     */
    public static double fibonacciQuotient(int n) {
        if (n <= 1) {
            return n;
        } else {
            return (fibonacciQuotient(n - 1) + fibonacciQuotient(n - 2)) / fibonacciQuotient(n - 3);
        }
    }

    /**
     * La proporción áurea es una constante matemática que es aproximadamente igual a 1.61803398875, el valor obtenido
     * de la división de 1+(raiz cuadrada de)5 / 2.
     * La proporción áurea está estrechamente relacionada con la secuencia de Fibonacci y, de hecho,
     * se define como el límite de la proporción entre números de Fibonacci consecutivos a medida que la secuencia
     * tiende al infinito.
     *
     * Para comparar el resultado obtenido de la función recursiva del cociente de los números de Fibonacci 13 y 12
     * con el valor de la proporción áurea, podemos calcular los números de Fibonacci 13 y 12 y dividirlos para obtener
     * el valor real de la proporción. Entonces podemos comparar este valor con el valor de la proporción áurea.
     */


}