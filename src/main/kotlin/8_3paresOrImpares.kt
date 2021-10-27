/*
    2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.
*/

fun main(args: Array<String>) {
    var imp = 0
    var par = 0
    var tempN = 0

    println("Escreva 10 números consecutivamente: ")

    for (i in 1..10){
        tempN = readLine()!!.toInt()
        if (tempN%2 == 0){
            par++
        }else{
            imp++
        }
    }
    println("Você digitou $par pares e $imp impares.")
}

