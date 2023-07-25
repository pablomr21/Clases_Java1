package co.com.ps.c12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioEnClase {
    public enum Respuesta {
        ARREGLO_ORGANIZADO("Arreglo organizado"),
        SUMA("Suma de los números");

        private final String mensaje;

        Respuesta(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getMensaje() {
            return mensaje;
        }
    }

    public static void main(String[] args) {
        // Crear un arreglo de 10 números aleatorios
        List<Integer> numeros = Arrays.asList(5, 2, 9, 1, 7, 3, 8, 4, 10, 6);

        // Organizar el arreglo en orden ascendente utilizando streams
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .toList();

        // Calcular la suma de los números utilizando streams
        int suma = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // Imprimir el arreglo organizado y la suma de los números utilizando el enum
        System.out.println(Respuesta.ARREGLO_ORGANIZADO.getMensaje() + ": " + numerosOrdenados);
        System.out.println(Respuesta.SUMA.getMensaje() + ": " + suma);
    }
}
