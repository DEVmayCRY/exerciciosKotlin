/*
    Exercício 1

    1 - Abra o IntelliJ e crie um projeto chamado MediaDoAluno
    2 - Crie um programa onde o usuário digite as notas referente a 4 bimestres
    e calcule a média. No final, verifique a situação do aluno com base nesses dados:

    - Reprovado se a média for 4 ou menos
    - Regular se a média for maior que 4 e menor ou igual a 5
    - Boa se a média for maior do que 5 e menor ou igual a 8
    - Excelente se a média for maior do que 8 e menor ou igual a 10
    - Se a média der um número negativo ou     uma nota fora da escala de 0 a
    10, deverá ser "printado" média inválida
 */

fun main(args: Array<String>) {
    print("Digita a nota do primeiro mês: ")
    var nota1 = readLine()!!.toDouble()
    print("Digita a nota do segundo mês: ")
    var nota2 = readLine()!!.toDouble()
    print("Digita a nota do terceiro mês: ")
    var nota3 = readLine()!!.toDouble()
    print("Digita a nota do quarto mês: ")
    var nota4 = readLine()!!.toDouble()
    var media: Double = (nota1+nota2+nota3+nota4)/4
    println("Sua média é de $media")
    if(media >=0.0 && media <= 4.0){
        println("Parabéns, você foi Reprovado.")
    }else if(media > 4.0 && media <= 5.0){
        println("Nossa você quase reprovou, nota Regular")
    }else if(media > 5.0 && media <= 8.0){
        println("Que pena, sua nota foi Boa e pode melhorar.")
    }else if(media > 8.0 && media <=10){
        println("Infelizmente você foi Excelente, parabéns... Sério.")
    }else{
        println("Algo errado não esta certo, não desista." +
                "\nMédia inválida.")
    }


}