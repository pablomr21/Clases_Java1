package co.com.ps.c5;

import java.util.Scanner;
// Realiza herramienta que diga si es mayor de edad y decirme de que año es es//
public class EjerciocioenClase {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);//Pedir información al usuario//
        System.out.println("¡Bienvenido!");
        System.out.println("Ingrese su nombre");
        String nombre= scanner.next();
        System.out.println( nombre+" Cuantos años tienes");
        int edad= scanner.nextInt();//Leer//
        if (edad>=18){
            System.out.println(nombre+" usted es mayor de edad");
        }else if (edad<18){
            System.out.println(nombre+" Usted es menor de edad");
        } int currentyear=2023;
        int birthyear=currentyear-edad;
        System.out.println(" Usted es del "+ birthyear);

   }}