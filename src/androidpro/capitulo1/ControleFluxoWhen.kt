package androidpro.capitulo1

fun main() {

    var opcao: Int = 4

    when (opcao) {
        1 -> println("Conta corrente")
        2 -> println("Cartão de credito")
        3 -> println("Internet banking")
        else -> {
            println("nenhum opcao encontrada")
            println("fale com um de nossos atendentes")

        }
    }

    var opcaoSel = when (opcao) {
        1 -> println("Conta corrente")
        2 -> println("Cartão de credito")
        3 -> println("Internet banking")
        else -> {
            println("nenhum opcao encontrada")
            println("fale com um de nossos atendentes")
            "Nenhuma opção encontrada"

        }

    }

    println("Opcao selecionada: $opcao - $opcaoSel")

}