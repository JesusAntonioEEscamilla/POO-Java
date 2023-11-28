# Definición de una clase llamada 'Persona'
class Persona:
    # Método constructor, se llama automáticamente al crear un nuevo objeto de la clase
    def __init__(self, nombre, edad, altura):
        self.nombre = nombre
        self.edad = edad
        self.altura = altura

    # Metodo de persona
    def bailar(self):
        return f"{self.nombre} esta bailando"
    
    def comer(self):
        return f"{self.nombre} estoy comiendo"
    
    def caminar(self):
        return f"{self.nombre} voy a caminar"
    
    # Método para obtener información de la persona
    def obtener_informacion(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}, Altura: {self.altura}"

# Crear objetos (instancias) de la clase Persona
persona = Persona("Jesus Antonio", 25, 1.83)
persona2 = Persona("María", 30, 1.70)

# Acceder a los atributos de los objetos
print(persona.nombre)
print(persona2.nombre, persona2.edad)

# Llamar a un método de la clase
info_persona = persona.obtener_informacion()
print(info_persona)

# Llamer metodos de persona
bailar_persona = persona.bailar()
print(bailar_persona)

comer_perosna = persona.comer()
print(comer_perosna)

caminar_persona = persona.caminar()
print(caminar_persona)