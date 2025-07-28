package med.voll.api.paciente;

import med.voll.api.endereco.EnderecoRecord;

public record CadastroPacienteRecord(String nome, String email, String cpf, EnderecoRecord enderecoRecord) {
}
