package med.voll.api.controller;

import med.voll.api.paciente.CadastroDoPaciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    CadastroDoPaciente cadastroDoPaciente;
    @PostMapping
    public void cadastrar(@RequestBody CadastroDoPaciente json){
        cadastroDoPaciente = json;
        System.out.println(cadastroDoPaciente);
    }
    @GetMapping
    public String imprimir(){return cadastroDoPaciente.toString();}
}
