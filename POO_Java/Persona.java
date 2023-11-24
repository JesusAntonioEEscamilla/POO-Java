package POO_Java;

public class Persona{
    // Atributos de la clase
    private String nombre;
    private int edad;

    // Constructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método para establecer la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para imprimir información sobre la persona
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}