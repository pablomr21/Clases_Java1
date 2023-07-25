package co.com.ps.c8;


public class Calculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = Calculadora.sumar(3, 5);
        System.out.println("El resultado es: " + resultado);
    }
}