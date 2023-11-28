package POO_Java;

public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;
    public double altura;

    // Constructor de la clase
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Metodos de Persona
    public void bailar(String musica) {
        if (musica == "") {
            System.out.println("Estoy tieso");
        } else {
            System.out.println("Estoy bailando");
        }
    }

    public void comer(String hambre) {
        if (hambre == "Hambre") {
            System.out.println("Voy a comer");
        } else {
            System.out.println("Voy a hacer la mimision");
        }
    }

    public void caminar(Boolean cansado) {
        if (cansado == true) {
            System.out.println("Me siento");
        } else {
            System.out.println("Me voy a ......");
        }
    }

    // Método para imprimir información sobre la persona
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " m");
    }
}