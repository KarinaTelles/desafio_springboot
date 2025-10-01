package med.api.dtos;

import jakarta.validation.constraints.NotNull;
import med.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico
        (
            @NotNull
            Long id,
            String nome,
            String email,
            String telefone,
            DadosEndereco dadosEndereco
        )
{
}
