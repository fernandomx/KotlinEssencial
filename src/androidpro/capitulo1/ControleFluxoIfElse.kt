package androidpro.capitulo1

fun main() {
    var idade: Int = 26

    if(idade < 18) {
        println("não pode beber e nem tirar carta")
    } else if (idade < 21){
        println("não pode beber mas pode  tirar carta")
    } else if (idade <25 ) {
        println("pode beber e pode tirar carta")
    } else {
        println("Está liberado!")
    }

    var str:String = if (idade<18) {
        println("idade verificada")
        "Menor idade"

    }else {
        println("idade verificada")
        "maior idade"
    }

    println(str)

}
