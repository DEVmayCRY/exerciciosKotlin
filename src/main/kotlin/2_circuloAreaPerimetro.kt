import java.util.*

/*Exercício 2

1 - Crie um projeto no IntelliJ com o nome CirculoAreaPerimetro
2 - Crie um código que pede para o usuário digitar o diâmetro de um círculo (que será uma variável do tipo Int) e calcule a área e o perímetro (que serão Doubles).
4 - Faça uma conversão de tipos (de Int para Double) quando for calcular os resultados

 */

fun main(args: Array<String>) {

    var diameter: Int = 0
    var pi: Double = 3.14
    print("Digite o diâmetro do circulo: ")
    diameter = readLine()!!.toInt()

    println("o Perimetro do circulo é ${(diameter*diameter)*pi}")

}