abstract class Funcionario(//abstract open é redundante
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    abstract val bonificacao: Double

}