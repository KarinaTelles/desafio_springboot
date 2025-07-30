package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record CadastroPacienteRecord(String nome, String email, String cpf, DadosEndereco dadosEndereco) {
}
