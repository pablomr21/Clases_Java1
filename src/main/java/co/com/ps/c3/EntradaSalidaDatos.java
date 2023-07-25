package co.com.ps.c3;

import co.com.ps.c2.HolaMundoV2;

import javax.swing.*;
import java.util.Scanner;// esto se coloca para pedirle datos al usuario //

public class EntradaSalidaDatos {
    public static void main(String[] args) {
        //crear un objeto scanner para leer la entrada del usuario//
        Scanner scanner= new Scanner(System.in);

        // Leer un número entero desde el teclado//
        System.out.print("Ingresa un número entero");//Escribir//
        int numero= scanner.nextInt();//Leer//

        //leer una cadena de caracteres desde el teclado//
        System.out.println("Ingresa tu nombre");
        String nombre= scanner.next();

        // Mostrar la salida en la consola//
        System.out.println("el numero ingresado es," + numero);
        System.out.println("Hola, "+nombre+"!");

    }
}
