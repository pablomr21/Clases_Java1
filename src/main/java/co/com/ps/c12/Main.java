package co.com.ps.C12;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(fecha);

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNueva=  fechaActual.plusDays(20);
        System.out.println("Fecha: " + fechaNueva);



        Calendar calendar = Calendar.getInstance();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++" );
        // Obtener detalles de la fecha y hora
        int año = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1; // Los meses en Calendar están indexados desde 0
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minutos = calendar.get(Calendar.MINUTE);
        int segundos = calendar.get(Calendar.SECOND);

        // Imprimir la fecha y hora actual
        System.out.println("Fecha: " + (dia+5) + "/" + mes + "/" + año);
        System.out.println("Hora: " + hora + ":" + minutos + ":" + segundos);


    }
}