class CalculadoraBonificacao {

    var total: Double = 0.0
        private set //não disponibiliza set para qualquer um modificar. A modificação so pode ser feita pelo registra

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

    fun registra(diretor: Diretor) {
        this.total += diretor.bonificacao
     }

    fun registra(gerente: Gerente) {
        this.total += gerente.bonificacao
    }

}