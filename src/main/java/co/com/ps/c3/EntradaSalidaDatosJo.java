package co.com.ps.c3;
import javax.swing.*;

public class EntradaSalidaDatosJo {
    public static void main(String[] args) {
        // Mostrar un mesanje de Dialogo//
        JOptionPane.showMessageDialog(null,"¡Hola,bienvenido!");

        // Obtner una entrada de texto del usuario //
        String nombre= JOptionPane.showInputDialog(" Por favor , ingresa tu nombre:");

        // Mostrar un mensaje de diálogo con el nombre ingresado
        JOptionPane.showMessageDialog(null, "Hola , " + nombre+"!");

        // Obtener una entrada numérica del usuario//
        String edadStr= JOptionPane.showInputDialog("Ingresa tu edad:");
        int edad = Integer.parseInt(edadStr);

        // Realizar una verificación utilizando el valor ingresado
        if (edad>=18){
            JOptionPane.showMessageDialog(null, "Eres mayor de edad");
            }else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad");
            }
        }

    }

