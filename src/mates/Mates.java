package dominio;

public class Mates {

    // Ejercicio 1: sumar  recursivamente los números de 0 a n
    public static int sumN (int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumN(n - 1);
        }
    }
    // Ejercicio 2: factorial de un número
    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    // Ejercicio 3: la potencia n-esima de un numero natural
    public static int potencia (int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            return n * potencia(n, p - 1);
        }
    }
    // Ejercicio  4: la suma de los elementos de una lista de números
    public static int suma (int[]T) {
        /** array de enteros int[][], int i sera el tamaño o el indice o algo asi
         * el array lo creo en la funcion principal que va a invocar a la funcion y devolver el resultado **/
        if (T.length == 0) {
            return 0
        } ;
        else{
            return T[T.length - 1] + suma(T, T.length - 2)
        } ;
        /**
         * podria ser solo: return sumaMem(T, T.length(), 0);
         * para array el metodo es length() y para arraylist es size() (ver diferencias)**/
    }
    // Ejercicio 5: la media aritmética de una lista de números
    public static int mediaAritmética (int[]T) {
        if (T.length == 0) {
            return 0
        } ;
        else{
            return T[T.length - 1] + suma1(T, T.length - 2)
        } ;

    public static int suma (int[]T, int i) {
        if (i == 0) { return T[0] };
        else {
            return T[i] + suma(T, i-1) };
    }
    /** Tecnica de parametros acumuladores: la ventaja es que esta no se expande, la funcion suma() sí
     * otra forma de resolver el problema, vamos guardando la informacion de la suma de los elementos que llevamos**/
    public static int sumaMem (int[]T, int i, int s) {
        // tengo que sumar todos los elementos hasta i sabiendo que la suma de los que ya llevamos es s
        if (i == -1) {
            // es que ya he sumado todos hasta el 0,y la suma la tengo en s
            return s;
        }
        else {
            sumaMem(T. i-1, S+T[i]);
        }
    }
    // Calcular la desviación típica de una lista de números
    public static

}