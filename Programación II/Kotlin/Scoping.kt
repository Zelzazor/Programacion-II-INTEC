fun main(args: Array<String>) {
    var num = 5
    var num2 = 0
    if(num == 5){
        var num2 = 3
        println(num2)
    }
    println(num2)
    
    
    println(checkNum(num))
}

fun checkNum(num: Int): Boolean{
    var num2 = num
    var num3 = 2
    num2-=num3
    return num2==3
}