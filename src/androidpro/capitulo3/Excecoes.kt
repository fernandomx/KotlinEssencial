package androidpro.capitulo3

fun main() {



    try{

        print("Digite um numero: ")
        val numero: Int = readLine()!!.toInt()
        val divisao: Int = 100/numero
        println("A divisao é $divisao")


    }catch (e: Exception) {
        println("Erro: ${e.message}")
    }finally {
        println("Programa finalizado")
    }


}