# Definición de una clase llamada 'Persona'
class Persona:
    # Método constructor, se llama automáticamente al crear un nuevo objeto de la clase
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    # Método para obtener información de la persona
    def obtener_informacion(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}"

# Crear objetos (instancias) de la clase Persona
persona1 = Persona("Juan", 25)
persona2 = Persona("María", 30)

# Acceder a los atributos de los objetos
print(persona1.nombre)
print(persona2.edad)

# Llamar a un método de la clase
info_persona1 = persona1.obtener_informacion()
print(info_persona1)