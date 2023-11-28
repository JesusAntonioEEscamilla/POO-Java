package POO_Java;

public class Main {
    // Método principal (main) para probar la clase Persona
    public static void main(String[] args) {
        // Crear una instancia de la clase Persona
        Persona persona = new Persona("Jesus Antonio", 25, 1.81);

        // Imprimir información utilizando el método de la clase
        persona.imprimirInformacion();

        // Usando los Metodos
        persona.bailar("Bachata");

        persona.comer("No tengo hambre");

        persona.caminar(false);
    }
}
