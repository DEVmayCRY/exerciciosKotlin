/*
    4 - Crie um programa que leia 10 valores e identifique a quantidade de números pares e ímpares
*/

fun main(args: Array<String>) {
    var num = 1
    var tempN = 0
    var li = 0
    var par = 0
    var imp = 0

    println("Escreva 10 números consecutivamente: ")

    while (li < 10){
        tempN = readLine()!!.toInt()
        if (tempN%2 == 0){
            par++
        }else{
            imp++
        }
        li++
    }
    println("Você digitou $par pares e $imp impares.")
}