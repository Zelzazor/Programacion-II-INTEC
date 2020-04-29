fun main(args: Array<String>) {
    var persona1 = Persona("Felipe", "Ramírez", 19)
    //println(persona1.edad)
    var persona2 = persona1
    //println(persona2.edad)
    persona2.edad = 20
    println(persona1.edad)
}

data class Persona(var nombre: String, var apellido: String, var edad: Int)