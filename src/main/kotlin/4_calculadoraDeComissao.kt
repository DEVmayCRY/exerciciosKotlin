/*
Exercício 2

1 - Crie um projeto chamado Calculadora de Comissão
2 - O App deve calcular a comissão dos representantes de vendas com base neste gráfico usado pela loja de varejo:

Faixa de Vendas        Comissão
acima de R$10000    30%
R$5001 - R$9999        20%
R$1001 - R$4999        10%
abaixo de R$1000     N / D
 */

fun main(args: Array<String>) {
    println("Digite o quanto vendeu, para calcularmos a sua comissão: ")
    var comi = readLine()!!.toDouble()
    if(comi <= 1000.0.toDouble()){
        println("Você não teve comissão.")
    }else if(comi <= 4999.0 && comi >= 1001.0){
        println("Você obteve 10% de comissão.")
    }else if(comi <= 9999.0 && comi >= 5000.0){
        println("Você obteve 20% de comissão.")
    }else if(comi > 10_000.0){
        println("Você obteve 30% de comissão.")

    }

}
