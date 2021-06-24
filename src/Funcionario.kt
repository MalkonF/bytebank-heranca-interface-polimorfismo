open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    open val bonificacao: Double
        get() = salario * 0.1

    //código mais idiomático
    //open val bonificacao: Double get() = salario * 0.1
    //properties com tipo Double implícito
    //open val bonificacao get() = salario * 0.1
    //função
    //open fun bonificacao(): Double = salario * 0.1


}