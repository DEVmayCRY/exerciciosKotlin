/*
    Exercício 3

    Um cinema aplica descontos dependendo da idade do cliente.

    1 - Crie um projeto chamado DescontosCinema
    2 - O App pede para um usuário digitar a sua idade e checa se
    ele está apto para o deconto do ingresso. A tabela de descontos é a seguinte

    Idade                            Preço do Ingresso
    Ingresso inteiro           18 Reais
    Abaixo de 5 anos        60% de Desconto
    Acima de 60 anos       55% Discount

    3 - Codifique o app para calcular o preço correto do ingresso
    com base na idade e mostre esse retorno para o usuário.
    4 - Caso o usuário não tenha desconto, crie um sistema para a
    quantidade de ingressos que ele quer e, se ele comprar dois ingressos
    ou mais, terá um desconto de 30% em cada um.
 */

fun main(args: Array<String>) {
    var pre: Double = 18.0

    println("Digite sua idade. ")
    var idad = readLine()!!.toDouble()
    println("Quantos ingressos vai comprar? ")
    var qIngr = readLine()!!.toDouble()

    if(idad >= 5 && idad <= 60){
        if(qIngr > 1){
            pre *= 0.7
            println("Vai ficar R$${pre*qIngr}")
        }else if(qIngr > 0 && qIngr < 2){
            println("Vai ficar R$${pre}")
        }

    }else if(idad > 60){
        pre *= 0.45
        println("Vai ficar R$${pre*qIngr}")
    }else if(idad > 60) {
        pre *= 0.4
        println("Vai ficar R$${pre * qIngr}")
    }else{
        println("Digite números válidos.")
    }
}

