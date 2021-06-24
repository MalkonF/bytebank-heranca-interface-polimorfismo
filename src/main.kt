fun main() {
    println("Bem vindo ao Bytebank")
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita((1000.0))

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(150.0, contaPoupanca)
    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo conta corrente após transferencia: ${contaCorrente.saldo}")
    println("Saldo conta poupança após transferencia: ${contaPoupanca.saldo}")
}






