/*
    3 - Crie um programa para ler 4 notas e mostrar a média delas.
*/

fun main(args: Array<String>) {
    var nota = 1
    var total = 0
    var li = 0

    println("Digite suas 4 notas consecultivamente: ")

    while (li != 4){
        nota = readLine()!!.toInt()
        total += nota
        li++
    }
    println("Sua nota é ${total/4}.")
}