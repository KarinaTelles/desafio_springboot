package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    DadosCadastroMedico dadosCadastroMedico;
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico json){
      dadosCadastroMedico = json;
    }
    @GetMapping
    public String imprimir(){
        return dadosCadastroMedico.toString();
    }
}
