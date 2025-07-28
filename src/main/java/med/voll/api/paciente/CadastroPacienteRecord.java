package med.voll.api.paciente;

import med.voll.api.endereco.DadosCadastroEndereco;

public record CadastroPacienteRecord(String nome, String email, String cpf, DadosCadastroEndereco dadosCadastroEndereco) {
}
