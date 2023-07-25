package co.com.ps.c7;

import java.util.Scanner;

public class WhileDoWhile {
    public static void main(String[] args) {

        int num1= 0;


        while (num1>0){
            System.out.println(num1);
            num1--;
        }
////////////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("¿Quieres continuar? (s/n)");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));//Continuar sin importar si se escribe con mayuscula o minuscula//

        System.out.println("Fin del programa.");
    }
}