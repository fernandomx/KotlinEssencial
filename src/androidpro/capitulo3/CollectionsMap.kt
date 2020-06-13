package androidpro.capitulo3

fun main() {

    var map = hashMapOf("Chave1" to 1, "Chave2" to 2, "Chave3" to 3) // tambem tem mapoff (nao mutavel)

    map.put("Chave4", 4)

    map.remove("Chave3")

    for (chave in map.keys){

        println("$chave: ${map.get(chave)}")
    }


}