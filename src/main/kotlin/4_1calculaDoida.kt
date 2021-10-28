import kotlin.math.pow

/*
    Exercício 1

    1 - Criem um novo projeto que se chama Calculadora
    2 - Implemente uma função para cada operação aritmética

    - Adição
    - Subtração
    - Multiplicação
    - Divisão

    3 - Na função Main, chame todas as funções com valores diferentes (pelo menos uma vez)
    4 - Se desafiem, adicionando, ainda, uma função para calcular a potência de um número, com qualquer expoente.
*/
fun main(args: Array<String>) {
        println("Calculadora, digite:\n1 - Para somar\n2 - Para subtrair\n3 - Para multiplicar" +
                    "\n4 - Para dividir\n5 - Para potência")
            when (readLine()!!.toInt()) {
                1 -> {
                    print("Para somar digite o primeiro número: ")
                    val num1 = readLine()!!.toInt()
                    print("Agora o segundo número: ")
                    val num2 = readLine()!!.toInt()
                    println("Resultado = ${soma(num1, num2)}")
                }
                2 -> {
                    print("Para subtrair digite o primeiro número: ")
                    val num1 = readLine()!!.toInt()
                    print("Agora o segundo número: ")
                    val num2 = readLine()!!.toInt()
                    println("Resultado = ${subt(num1, num2)}")
                }
                3 -> {
                    print("Para multiplicar digite o primeiro número: ")
                    val num1 = readLine()!!.toInt()
                    print("Agora o segundo número: ")
                    val num2 = readLine()!!.toInt()
                    println("Resultado = ${mult(num1, num2)}")
                }
                4 -> {
                    print("Para dividir digite o primeiro número: ")
                    val num1 = readLine()!!.toInt()
                    print("Agora o segundo número: ")
                    val num2 = readLine()!!.toInt()
                    println("Resultado = ${divi(num1, num2)}")
                }
                5 -> {
                    print("Para fazer a potenciação digite o número base: ")
                    val num1 = readLine()!!.toDouble()
                    print("Agora o segundo número, que será a potência: ")
                    val num2 = readLine()!!.toInt()
                    println("Resultado = ${pote(num1, num2)}")
                }
                else -> {
                    println("Digite uma opção válida.")
                }
            }

}

fun soma(num1: Int, num2: Int) = num1 + num2
fun subt(num1: Int, num2: Int) = num1 - num2
fun divi(num1: Int, num2: Int) = num1 / num2
fun mult(num1: Int, num2: Int) = num1 * num2
fun pote(num1: Double, num2: Int): Double {
    return num1.pow(num2.toDouble())
}