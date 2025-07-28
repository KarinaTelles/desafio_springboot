package med.voll.api.controller;

import med.voll.api.medico.CadastroMedicoRecord;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody CadastroMedicoRecord json){
        repository.save(new Medico(json));
    }
}
