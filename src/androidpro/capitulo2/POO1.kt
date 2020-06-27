package androidpro.capitulo2

class CarroX(cor: String, ano: Int, modelo: String) {
    var cor: String
    var ano: Int
    var modelo: String


    init{ // recebe o cabecalho da classe e passa para as variaveis internas da classe
        this.cor = cor
        this.ano = ano
        this.modelo = modelo
    }

    fun acelerar(){
        println("Acelerando o $modelo")
    }

}

interface Dirigivel{
    fun decolar(altitude: Long)

}

open class Drone(open var pModelo: String, open var pAno: Int, open var pVersao: Int){

init{
    println("Construindo drone")
}

   open fun voar(){
       println("Drone: $pModelo, $pVersao voando")
   }

}

class Phantom(override var pModelo: String, override var  pAno: Int, override var pVersao: Int): Drone(pModelo, pAno, pVersao){

}

class Matrice(override var pModelo: String, override var  pAno: Int, override var pVersao: Int, var pcameraTermal: String):
        Drone(pModelo, pAno, pVersao),Dirigivel {

    override fun voar(){
        println("Drone: $pModelo, $pVersao voando com camera termal $pcameraTermal")
    }

    override fun decolar(altitude: Long) {
        println("Decolando a $altitude m/s")
    }

}


fun main() {
    val uno = CarroX("Amarelo", 2018,"uno")


    println(uno.ano)
    println(uno.cor)
    println(uno.modelo)

    val mercedes = CarroX("Preta", 2018,"XXX")

    println("Mercedes: " + mercedes.modelo + " " + mercedes.ano + " " + mercedes.cor)

    val Drone1 = Drone("Phantom",2020,1)

    Drone1.voar()

    val phantom = Phantom("XXX",2020,1)

    phantom.voar()

    val matrice = Matrice("RTK",2020,1,"Camera TERMAL")
    matrice.voar()
    matrice.decolar(50)


}