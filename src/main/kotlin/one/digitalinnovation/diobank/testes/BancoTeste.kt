package one.digitalinnovation.diobank.testes

import one.digitalinnovation.diobank.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.info())

    val banco2 = digiOneBank.copy(nome="Mayson Bank")
    println(banco2.info())
}
