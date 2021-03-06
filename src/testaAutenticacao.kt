fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.00,
        senha = 10000
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 20000.00,
        senha = 20000,
        plr = 2000.00
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "222.222.222-22",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 10000)
    sistema.entra(diretor, 20000)
    sistema.entra(cliente, 1234)
}