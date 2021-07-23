package one.digitalinnovation.diobank

class Pessoa {
    var nome: String = "Meyson"
    var cpf: String = "23324421241"
}

fun main(){

    var meyson = Pessoa()
    println(meyson.nome)
    println(meyson.cpf)
}