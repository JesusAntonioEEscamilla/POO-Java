// Definición de una clase llamada "Persona"
class Persona {
    // Constructor para inicializar la clase con datos iniciales
    constructor(nombre, edad, altura) {
      this.nombre = nombre;
      this.edad = edad;
      this.altura = altura;
    }
  
    // Método para obtener la información de la persona
    obtenerInformacion() {
      return `Nombre: ${this.nombre}, Edad: ${this.edad} años, Altura :${this.altura} m`;
    }
  
    // Método para saludar
    saludar() {
      console.log(`¡Hola! Mi nombre es ${this.nombre}`);
    }
    // Metodos de Persona
    bailar() {
      console.log(`${this.nombre} esta bailando`);
    }

    comer() {
      console.log(`${this.nombre} estoy comiendo`);
    }

    caminar() {
      console.log(`${this.nombre} voy caminando`)
    }
  }
  
  // Crear una instancia de la clase Persona
  const persona = new Persona('Jesus Antonio', 25, 1.82);
  
  // Acceder a los métodos y propiedades de la instancia
  console.log(persona.obtenerInformacion());
  persona.saludar();
  persona.bailar();
  persona.comer();
  persona.caminar()