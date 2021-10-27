/*
    5 - Crie um programa que leia um número do teclado até
    que encontre um número igual a zero. No final, mostre:
    - A soma dos números digitados.
    - A média deles
    - O menor número digitado
    - O maior número digitado
*/


fun main() {
    var num: Int
    var total = 0
    var maNum = 0
    var meNum = 0
    var cont = 0
    println("Digite os números, lembrando que o programa para quando digitar \"0\".")
    do {
        num = readLine()!!.toInt()
        total += num
        if(num > maNum){
            maNum = num
        }else if (num < meNum){
            meNum = num
        }
        cont++
    }while (num != 0)
    println("A soma de todos os números é $total.\n A média deles é ${total/(cont-1)}." +
            "\nO maior número é $maNum.\nO menor número é $meNum.")
}

