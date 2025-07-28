package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;

public record CadastroDoPaciente(String nome, String email, String cpf, Endereco endereco) {
}
