package med.voll.api.medico;

import med.voll.api.endereco.DadosCadastroEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosCadastroEndereco dadosCadastroEndereco) {
}
