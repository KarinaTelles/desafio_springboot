package med.voll.api.medico;

import med.voll.api.endereco.EnderecoRecord;

public record CadastroMedicoRecord(String nome, String email, String crm, Especialidade especialidade, EnderecoRecord enderecoRecord) {
}
