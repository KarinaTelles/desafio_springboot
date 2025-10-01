package med.api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.api.endereco.Endereco;
import org.hibernate.validator.constraints.br.CPF;

@Table(name="paciente")
@Entity(name="Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Email
    private String email;
    private String telefone;
    @CPF
    private String cpf;
    @Embedded
    private Endereco endereco;
}
