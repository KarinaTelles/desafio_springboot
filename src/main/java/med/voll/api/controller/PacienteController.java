package med.voll.api.controller;

import med.voll.api.paciente.CadastroPacienteRecord;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    CadastroPacienteRecord cadastroPacienteRecord;
    @PostMapping
    public void cadastrar(@RequestBody CadastroPacienteRecord json){
        cadastroPacienteRecord = json;
        System.out.println(cadastroPacienteRecord);
    }
    @GetMapping
    public String imprimir(){return cadastroPacienteRecord.toString();}
}
