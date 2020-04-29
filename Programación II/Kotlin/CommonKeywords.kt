fun main(args: Array<String>) {
    var myVar:Boolean //Una palabra clave común es var, que indica que la sentencia consistirá en la declaración (y posible inicialización) de una variable
    val PI = 3.14 //También tenemos val, que indica la declaración de una variable inmutable o constante
    println(PI)
    myVar = true //También tenemos true, que es un valor booleano que nos indica "verdadero"
    println(myVar)
    myVar = false //No podía faltar su contraparte, el false, que nos indica "falso"
    if(!myVar){ //El if, una estructura de control que ejecuta un bloque de código en caso de que la condición estipulada de como resultado "true"
        println("Correcto!")
    }
    while(true){ //El while ejecutará un bloque de código múltiples veces (hasta que la condición evaluada de como resultado "false")
        println("Esto aparecera una sola vez")
        break //Break provoca que cualquier ejecución de código dentro de un bloque termine al llegar a esa sentencia
    }
    var num = 1
    when(num){ //When, es el equivalente del switch en Kotlin, asocia el valor que se toma como parámetro y lo compara con los valores que tenga dentro. Se ejecutará el bloque que corresponda con el valor.
        0 -> println("Es el cero.")
        1 -> println("Es el uno.")
        else -> println("Es cualquier otro número.")
    }

}

fun divide(num1: Double, num2: Double):Double{ // fun es utilizada para declarar funciones.
    return num1/num2 //return, otorga el valor resultante de la ejecución de la función.
}