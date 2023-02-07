package aplicacion;

public class Mates {
    public static int suma (int[]T, int i) {
        /** array de enteros int[][], int i sera el tamaño o el indice o algo asi
         * el array lo creo en la funcion principal que va a invocar a la funcion y devolver el resultado **/
        if (i == 0) { return T[0] };
        else {
            return T[i] + suma(T, i-1) };
        /**
         * podria ser solo: return sumaMem(T, T.length(), 0);
         * para array el metodo es length() y para arraylist es size() (ver diferencias)**/

    // cierro suma
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

    // cierro sumaMem
    }

// cierro Mates
}