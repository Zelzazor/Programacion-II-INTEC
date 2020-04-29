fun main(args: Array<String>) { 
    var person = Persona //Invoco a la única instacia object para 2 variables
    var person2 = Persona
    person.nombre = "Javier" //Modifico el atributo nombre de la instacia llamada persona.
    println(person.nombre) // Se han de modificar ambas instancias creadas, pues ambas beben de la misma.
    println(person2.nombre) 
    var person3 = Persona2() //Creo dos instancias de la clase Persona2 
    var person4 = person3
    person3.nombre = "Esteban" //Modifico una de estas instancias
    println(person3.nombre) //Solo la instancia modificada tiene un valor distinto
    println(person4.nombre)
    
}

object Persona {//La forma más cercana que tengo para hablarles de Aliasing en Kotlin es explicando el object.
    //El object es, esencialmente, lo que se conoce como Singleton, un patrón de diseño que crea una instancia única de clase cada ves que se asocia una variable al object
    var nombre = "Felipe"
    var apellido = "Ramirez"
    //El object tiene diseñada internamente una única referencia que utilizan todas las variables que tengan su valor
    //Así todos los valores que sean modificados en una instancia del object, así se modificará en todas las instancias del mismo.
}

class Persona2 { //Si utilizamos una clase común y corriente esto no sucede
    //Si cambiamos una instancia de clase las demás no se modificarán. 
    var nombre = "Felipe"
    var apellido = "Ramirez"
}