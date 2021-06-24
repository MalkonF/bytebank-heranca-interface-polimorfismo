fun main() {
    println("Bem vindo ao Bytebank")
    val alex = Funcionario(
        nome = "Malkon",
        cpf = "111.111.111-11",
        salario = 1000.00
    )

    println("Nome: ${alex.nome}")
    println("Cpf: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao()}")
}



