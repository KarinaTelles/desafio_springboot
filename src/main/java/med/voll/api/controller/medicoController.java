package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class medicoController {
    DadosCadastroMedico ohyeah;
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico json){
      System.out.println(json);
      ohyeah = json;
    }
    @GetMapping
    public void imprimeEssaParadaNaTela(){
        
    }
}
