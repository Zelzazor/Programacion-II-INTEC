fun main(args: Array<String>){
    //Los nombres de cualquier identificador empiezan con letras o con el guión bajo (_)
    //A partir del primer caracter, se pueden poner indistintamente caracteres y números.
    val invocarClase = NombreDeClase() // Las constantes siguen las mismas reglas (Convenciones aparte)
    var _Holamundo123_: String = invocarClase.decirHolaMundo()
    println(_Holamundo123_)
    //No se puede introducir de ningún modo caracteres especiales como los operadores +, -, *, /, %, !, &&,||, $, {}, [], <, >, =, ;, :, entre otros
}

class NombreDeClase{ //Las clases no son excepción.
    fun decirHolaMundo (): String{ //Las funciones tampoco.
        return "Hola mundo"
    }
}

//En general, cualquier identificador (nuevamente, convenciones aparte) de variables, constantes, funciones y clases tienen las mismas reglas de nombrado en Kotlin.