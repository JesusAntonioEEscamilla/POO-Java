package POO_Java;

public class Main {
    // Método principal (main) para probar la clase Persona
    public static void main(String[] args) {
        // Crear una instancia de la clase Persona
        Persona persona1 = new Persona("Juan", 25);

        // Imprimir información utilizando el método de la clase
        persona1.imprimirInformacion();

        // Modificar la edad utilizando el método de la clase
        persona1.setEdad(26);

        // Imprimir la información actualizada
        persona1.imprimirInformacion();
    }
}
