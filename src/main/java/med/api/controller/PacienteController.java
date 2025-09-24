package med.api.controller;

import med.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    DadosCadastroPaciente dadosCadastroPaciente;
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dadosCadastroPaciente){
        this.dadosCadastroPaciente = dadosCadastroPaciente;
        System.out.println(this.dadosCadastroPaciente);
    }
    @GetMapping
    public String imprimir(){return dadosCadastroPaciente.toString();}
}
