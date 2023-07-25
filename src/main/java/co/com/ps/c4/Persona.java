package co.com.ps.c4;

class Persona {

    private String nombre;
    private int edad;
    private String cedula;

    public Persona(){
    }




    public Persona(String cedula){
        this.cedula = cedula;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}