/**
 * POO_Java
 */
public class POO_Java {
    
        // Estos son los Atributos de la Clase PErsona
        public double altura;
        private int edad;
        public String nombre;

        // Construtor PAra poder llamar a la clase Persona
        public POO_Java(String nombre, int edad, double altura){
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

        // Estos son los Metodos
        public void bailar(String musica){
            if (musica == "") {
                System.out.println("Estoy tieso");
            }else{
                System.out.println("Estoy bailando");
            }
        }
        public void comer(String hambre){
            if (hambre == "Hambre") {
                System.out.println("Voy a comer");
            }else{
                System.out.println("Me voy a mimir");
            }
        }
        public void caminar(Boolean cansado){
            if (cansado == true) {
                System.out.println("Me siento");
            }else{
                System.out.println("Me voy a ......");
            }
        }
        public void InformacionG(){
            System.out.println("Mi nombre es "+ nombre + ". Mi edad es "+ edad);
            System.out.println("Mi altura es "+ altura);
        }

    public static void main(String[] args) {
        POO_Java persona = new POO_Java("Jesus",23, 1.70);
        persona.InformacionG();
        persona.bailar("Bachata");
        persona.comer("Hambre");
        persona.caminar(false);
    }
}