package med.api.repository;

import med.api.entity.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Pacientes,Long> {
}
