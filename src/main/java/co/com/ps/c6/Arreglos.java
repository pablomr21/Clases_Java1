package co.com.ps.c6;

public class Arreglos {
    public static void main(String[] args) {
        int[]miPrimerArreglo=new int[2];
        miPrimerArreglo[0]=10;
        System.out.println(miPrimerArreglo[0]);
        int[]miPrimerArreglo2={1,3,1000};
        String[]nombre=new String[3];
                nombre[0]="Manuela";
                nombre[1]="Pablo";
                nombre[2]="Mariana";
        double[] notas = new double[4];


        notas[0] = 1.3;
        notas[1] = 5.0;
        notas[2] = 4.5;
        notas[4] = 2.5;




        System.out.println("La nota final del estudiante es: "+calcularNota(notas));

/*
        pais(nombres);
*/
    }

    public static double calcularNota(double[] notas){
        double acumulador=0;
        for (double nota:notas) {
            acumulador= acumulador+nota;
        }
        return acumulador/notas.length;
    }
}
