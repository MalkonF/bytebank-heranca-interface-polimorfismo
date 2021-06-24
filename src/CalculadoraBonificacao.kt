class CalculadoraBonificacao {

    var total: Double = 0.0
        private set //não disponibiliza set para qualquer um modificar. A modificação so pode ser feita pelo registra

    fun registra(funcionario: Funcionario) {
        println("Nome: ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

}