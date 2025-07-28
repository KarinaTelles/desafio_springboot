package med.voll.api.medico;

import jakarta.persistence.*;
import med.voll.api.endereco.EnderecoJPA;
@Table(name="medicos")
@Entity(name="Medicos")
public class MedicoJPA {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private EnderecoJPA enderecoRecord;

}
