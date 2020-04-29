fun main(args: Array<String>) { //Kotlin contiene tipado estático
    //Esto quiere decir que el chequeo de tipos se realiza en tiempos de compilación
    var Esto: Int = 2 //Aquí el compilador sabe que el tipo de esta variable es Integer porque nosotros se lo hemos especificado
    val Aquello = 1 //El compilador de Kotlin es capaz de determinar el tipo de dato en que se inicializó esta constante. Hablaremos de esto más adelante.

    println("$Esto y $Aquello")

    //Como el compilador no permite que dos tipos de datos se crucen, esto sería una sentencia ilegal.
    
    //Esto = 2.2
    //println("$Esto")

    //Una conversión es necesaria para hacer que la variable Esto pueda tener el dato requerido.

    Esto = (3.2).toInt()
    println("$Esto")

    //¿Qué significa esto también? Que el tipo de la variable, una vez declarada, jamás cambiará. El compilador se encarga justamente de revisar si en el código se toma un valor inválido al espectro de valores que puede tomar la variable.

    //Esto significa pues que Kotlin, además, contiene tipado Fuerte.

    
}