package co.com.ps.c6;

    public class EjercicioClaseArreglos {
        public static void main(String[] args) {
            int[] numeros = {5, 3, 9, 1, 7, 2, 6, 8, 4, 10}; //  arreglo con 10 números

            int menor = numeros[0]; // Asignar el primer número como el menor al principio

            // Iterar a través del arreglo para encontrar el número menor
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            System.out.println("El número más pequeño es: " + menor);
        }
    }
