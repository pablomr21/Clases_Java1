package co.com.ps.c9;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.cazar();



        System.out.println("Por aca paso el codigo 1");
        int[] datos = {4,2,6,2,3,5};
        System.out.println("Por aca paso el codigo 2");

        try {
            System.out.println(datos[3]);
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Por aca paso el codigo 3");
        }finally {
            System.out.println("Esto siempre se va a ejecutar");
        }



        System.out.println("Por aca paso el codigo 5");
    }
}