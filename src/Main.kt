// 🔥 Desafio: Sistema Modular
// - Função menu() sem argumentos que mostra opções (somar, subtrair, sair etc)
// - Função operar(num1: Int, num2: Int, op: (Int, Int) -> Int)
// - Variáveis armazenando funções como ::somar, ::subtrair
// - Use when ou if para decidir qual função chamar
// - Use laço para repetir até o usuário pedir para sair

fun lerNumeros(): Pair<Int, Int> {
    println("Digite o primeiro numero: ")
    val num1 = readln().toIntOrNull() ?: 0

    println("Digite o segundo numero: ")
    val num2 = readln().toIntOrNull() ?: 0
    return Pair(num1, num2)
}
fun main() {
    var opcao: String

    do {
        menu()
        opcao = readln()

        when (opcao) {
            "1" -> {
                val (x, y) = lerNumeros()
                val resultado = operar(x, y, ::soma)
                println("Resultado: $resultado")
            }
            "2" -> {
                val (x, y) = lerNumeros()
                val resultado = operar(x, y, ::subtrair)
                println("Resultado: $resultado")
            }
            "0" -> println("Saindo do sistema...")
            else -> println("Opção inválida.")
        }

        println("--------------")

    } while (opcao != "0")
}




}
fun menu(){
    println("Digite 1 para SOMAR, 2 para SUBTRAIR e 0 para SAIR")

}

fun soma(a:Int, b:Int):Int{
    return  a+b
}
fun subtrair(a:Int, b:Int):Int{
    return  a-b
}





fun operar(num1: Int, num2: Int, op: (Int, Int) -> Int):Int{
    return op(num1,num2)
}
