/*
    1 - Faça um programa que leia um valor e imprima sua tabuada
    (aceite apenas números entre 1 e 10). Imprima, logo em seguida,
    a tabuada ao contrário
*/



fun main(args: Array<String>) {
    print("Digite o número da tabuada: ")
    val num = readLine()!!.toInt()
    for(i in 1..10){
        println("$num X $i = ${num * i}")
    }
    println()
    for(i in 10 downTo 1){
        println("$num X $i = ${num * i}")
    }

}
