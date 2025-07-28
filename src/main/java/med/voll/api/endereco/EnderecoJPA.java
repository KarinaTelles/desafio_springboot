package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoJPA {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String complemento;
    private String numero;
    private String uf;

    public EnderecoJPA(EnderecoRecord enderecoRecord) {
        this.logradouro = enderecoRecord.logradouro();
        this.bairro = enderecoRecord.bairro();
        this.cep = enderecoRecord.cep();
        this.cidade = enderecoRecord.cidade();
        this.complemento = enderecoRecord.complemento();
        this.numero = enderecoRecord.numero();
        this.uf = enderecoRecord.uf();
    }
}
