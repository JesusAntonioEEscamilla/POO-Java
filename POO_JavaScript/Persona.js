// Definición de una clase llamada "Persona"
class Persona {
    // Constructor para inicializar la clase con datos iniciales
    constructor(nombre, edad) {
      this.nombre = nombre;
      this.edad = edad;
    }
  
    // Método para obtener la información de la persona
    obtenerInformacion() {
      return `Nombre: ${this.nombre}, Edad: ${this.edad} años`;
    }
  
    // Método para saludar
    saludar() {
      console.log(`¡Hola! Mi nombre es ${this.nombre}`);
    }
  }
  
  // Crear una instancia de la clase Persona
  const persona1 = new Persona('Juan', 25);
  
  // Acceder a los métodos y propiedades de la instancia
  console.log(persona1.obtenerInformacion());
  persona1.saludar();