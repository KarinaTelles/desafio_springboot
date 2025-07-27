package med.voll.api.controller;

import med.voll.api.medico.CadastroDoMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    CadastroDoMedico dadosCadastroMedico;
    @PostMapping
    public void cadastrar(@RequestBody CadastroDoMedico json){
      dadosCadastroMedico = json;
    }
    @GetMapping
    public String imprimir(){
        return dadosCadastroMedico.toString();
    }
}
