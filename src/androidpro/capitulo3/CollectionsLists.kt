package androidpro.capitulo3


fun main() {

    var arraylist = arrayListOf("Joao","Maria","Fernando")

    arraylist.add("Graziele")

    arraylist.remove("Maria")


    println(arraylist)
    println(arraylist.size)
    println(arraylist.isEmpty())
    println(arraylist.contains("Fernando"))


    for (nome in arraylist){
        println(nome)
    }



}