fun main(args: Array<String>) {
    println("Introduzca el primer valor:")
    var valor1 = readLine()!!.toDouble()
    println("Introduzca el segundo valor:")
    var valor2 = readLine()!!.toDouble()

    println("La suma de ${if(valor1 % 1 == 0.0) valor1.toInt() else valor1} y ${if(valor2 % 1 == 0.0) valor2.toInt() else valor2} es: ${if((valor1+valor2) % 1 == 0.0) valor1.toInt() + valor2.toInt() else valor1 + valor2}")
    println("La resta de ${if(valor1 % 1 == 0.0) valor1.toInt() else valor1} y ${if(valor2 % 1 == 0.0) valor2.toInt() else valor2} es: ${if((valor1-valor2) % 1 == 0.0) valor1.toInt() - valor2.toInt() else valor1 - valor2}")
    println("La multiplicación de ${if(valor1 % 1 == 0.0) valor1.toInt() else valor1} y ${if(valor2 % 1 == 0.0) valor2.toInt() else valor2} es: ${if((valor1*valor2) % 1 == 0.0) valor1.toInt() * valor2.toInt() else valor1 * valor2}")
    println("La división de ${if(valor1 % 1 == 0.0) valor1.toInt() else valor1} y ${if(valor2 % 1 == 0.0) valor2.toInt() else valor2} es: ${if((valor1/valor2) % 1 == 0.0) valor1.toInt() / valor2.toInt() else valor1 / valor2}")
}



