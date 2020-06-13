package androidpro.capitulo2

class Livro(val titulo: String, val autor: String, val ano: Int){

    override  fun toString(): String{
        return "LivroTitulo $titulo"
    }
}

//ja esta implementado metodo tostring, equals, hashcode implicito
//carregar dados de forma simples
data class DataLivro(val titulo: String, val autor: String, val ano: Int)


fun main() {

    val livro = Livro("Android", "Fernando", 2020)
    val livro2 = Livro("Android", "Fernando", 2020)

    val dataLivro = DataLivro("Android","Fernando", 2020)
    val dataLivro2 = DataLivro("Android","Fernando", 2020)


    println(livro)
    println(dataLivro)

    println("Livro igual? " + livro.equals(livro2))
    println("Data Livro igual? " + dataLivro.equals(dataLivro2))



}





