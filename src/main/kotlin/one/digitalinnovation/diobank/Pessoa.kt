package one.digitalinnovation.diobank

class Pessoa {
    var nome: String = "Meyson"
    var cpf: String = "321.435.355-02"
    private set

}

fun main(){

    var meyson = Pessoa()

    println(meyson.nome)
    println(meyson.cpf)

}