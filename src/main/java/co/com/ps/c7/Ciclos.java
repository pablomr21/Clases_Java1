package co.com.ps.c7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Ciclos {

    public static void main(String[] args) {
        //PARA

        List<String> miLista = new ArrayList<>();

        miLista.add("Mauricio"); //0
        miLista.add("Alan");//1
        miLista.add("");//1
        miLista.add("David");//2
        miLista.add("Carlos");//3
        miLista.add("Juan");

        double[] notas = new double[4];


        notas[0] = 1.3;
        notas[1] = 5.0;
        notas[2] = 4.5;
        notas[3] = 2.5;
        for (double nota :notas) {
            System.out.println(nota);
        }




        for (String nombre :miLista) {
            System.out.println(nombre);
        }
        System.out.println("_________________________________________");





        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(i));
        }




        for (int i = 1; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

    }
}