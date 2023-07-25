package co.com.ps.c7;

import java.util.Arrays;

public class EjercicioClase {
    public static void main(String[] args) {
        int[] arreglo = {4, 2, 6, 2, 3, 5};

        // Ordenar el arreglo utilizando el algoritmo de ordenamiento de burbuja
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }
}
