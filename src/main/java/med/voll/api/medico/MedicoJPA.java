package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.EnderecoJPA;
@Table(name="medicos")
@Entity(name="Medicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class MedicoJPA {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private EnderecoJPA enderecoJPA;

    public MedicoJPA(CadastroMedicoRecord json) {
        this.nome = json.nome();
        this.email = json.email();
        this.crm = json.crm();
        this.especialidade = json.especialidade();
        this.enderecoJPA = new EnderecoJPA(
                json.enderecoRecord().logradouro(),
                json.enderecoRecord().bairro(),
                json.enderecoRecord().cep(),
                json.enderecoRecord().cidade(),
                json.enderecoRecord().complemento(),
                json.enderecoRecord().numero(),
                json.enderecoRecord().uf());
    }
}
