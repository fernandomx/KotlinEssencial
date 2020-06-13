package androidpro.capitulo2

interface dirigivel{

    fun acelerar(velocidade: Long)
}

interface carregavel{

    fun carregar(quantidade: Long)
}


open class Veiculo(open var cor: String, open var ano: Int, open var  modelo: String) {


    init {
        println("construindo um carro...")
    }

}



class Carro(override var cor: String,  override var ano: Int, override var modelo: String):
    Veiculo(cor, ano, modelo), dirigivel {
    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade k/h")
    }


}

class Caminhao(override var cor: String, override var ano: Int, override var modelo: String, var capacidade: Long ):
    Veiculo(cor, ano, modelo), dirigivel, carregavel {
    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade k/h")
    }

    override fun carregar(quantidade: Long) {
        println("Carregando o $modelo com $quantidade kg")
    }


}


fun main() {

    val uno: dirigivel = Carro("Amarelo",2018, "Uno")

    //println("Uno: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")

    uno.acelerar(100)


    val scania = Caminhao("branco",2015,"X78",1000)

    println("Scania: Cor ${scania.cor}, Ano ${scania.ano}, Modelo ${scania.modelo}, Capacidade ${scania.capacidade}")

    scania.acelerar(100)
    scania.carregar(50)


}