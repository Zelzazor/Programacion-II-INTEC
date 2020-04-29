fun main(args: Array<String>) {
    var Entero: Int = 4 //Kotlin usa Binding de tipos estático, o early binding
    //Esto significa que el compilador es el encargado de asociar el identificador de variable con su tipo de dato
    var Entero2 = 5 //Kotlin, además, y como se mencionó anteriormente, tiene la capacidad de realizar Binding implícito (es decir, el compilador es capaz de determinar el tipo de dato si este no se ha determinado con anterioridad) esto se conoce como inferencia de tipos

    println("$Entero y $Entero2") //Como se puede ver, el programa se ejecuta correctamente utilizando tanto binding implícito como explícito.

}