import java.util.*

/*Exercício 1

1 - Crie um novo projeto chamado NomeandoVariaveis
2 - Crie variáveis que armazenem o nome do usuário, idade, preferência de emprego, nacionalidade e tipo sanguíneo
3 - Pense como você pode nomear essas variáveis para ficarem fáceis de serem identificadas
4 - Use a idade do usuário para calcular o ano de seu nascimento, usando o ano atual como base (2021)
5 - No fim, print todos os valores no console, com o ano em que o usuário nasceu
*/




fun main(args: Array<String>) {
    var nomeU: String
    var idadeU: Int
    var empPref: String
    var nascion: String
    var sangType: String
    var leitura = Scanner(System.`in`)
    print("Escreva respectivamente seu nome, idade, preferência de emprego, nascionalidade e " +
            "tipo sanguineo.: ")
    nomeU = leitura.next()
    idadeU = leitura.nextInt()
    empPref = leitura.next()
    nascion = leitura.next()
    sangType = leitura.next()

    println("Nome: $nomeU\nIdade: $idadeU\nPreferência de emprego: $empPref\nNascionalidade: $nascion" +
            "\nTipo sanguineo: $sangType\nAna de nascimento: ${2021-idadeU}")

}