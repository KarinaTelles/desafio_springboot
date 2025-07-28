package med.voll.api.controller;

import med.voll.api.medico.CadastroMedicoRecord;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    CadastroMedicoRecord cadastroMedicoRecord;
    @PostMapping
    public void cadastrar(@RequestBody CadastroMedicoRecord json){
      cadastroMedicoRecord = json;
      System.out.println(cadastroMedicoRecord);
    }
    @GetMapping
    public String imprimir(){
        return cadastroMedicoRecord.toString();
    }
}
