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

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 1234
    )

    println("Nome: ${fran.nome}")
    println("Cpf: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao()}")

    if (fran.autentica(1234)) {
        println("Autententicou com sucesso")
    } else {
        println("Autenticação falhou")
    }
}
}



