/*
        Exercício

    1. Crie um projeto chamado cadastroDeConvidados
    2. Crie um loop (pode ser usado o while) e coloque um when dentro da estrutura,
    para simular um menu de escolhas:
    - O Loop precisa ficar ativo enquanto uma variável simNao estiver como "Sim",
    a partir do momento que o usuário digitar "Não" ou qualquer outra coisa, o programa precisa
     ser finalizado.
    - Se o usuário escolher 1, abre as instruções para adicionar um novo convidado
    - Se o usuário escolher 2, abre as instruções para remover um convidado
    - Se o usuário escolher 3, lista os convidados
    3. Use a List para cadastrar cada convidado
    4. Teste para ver se tudo funciona
*/

fun main(){
    var convidados = mutableListOf("")
    var continua = "Sim"

    do {
        println("Digite: \n1 - Para adicionar um novo convidado, 2 - Para remover, 3 - Para listar: ")
        var escolha = readLine()!!.toString()
        if(escolha == "1" || escolha == "2" || escolha == "3"){
            when (escolha) {
                "1" -> {
                    println("Digite o nome do candidato a ser adicionado: ")
                    val nome = readLine()
                    convidados.add(nome.toString())
                }
                "2" -> {
                    println("Digite o nome do candidato a ser removido: ")
                    val nome = readLine()
                    convidados.remove(nome.toString())
                }
                "3" -> {
                    println("\n$convidados")
                }
            }
        }else{
            println("Digite uma opção válida.")
        }
        println("Deseja continuar? digite Sim ou Não: ")
        continua = readLine().toString()
    }while (continua == "Sim")
}