package med.voll.api.controller;

import med.voll.api.medico.CadastroDoMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    CadastroDoMedico cadastroDoMedico;
    @PostMapping
    public void cadastrar(@RequestBody CadastroDoMedico json){
      cadastroDoMedico = json;
      System.out.println(cadastroDoMedico);
    }
    @GetMapping
    public String imprimir(){
        return cadastroDoMedico.toString();
    }
}
