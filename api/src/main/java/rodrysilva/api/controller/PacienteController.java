package rodrysilva.api.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rodrysilva.api.pacientes.DadosCadastroPacientes;

@RestController
@RequestMapping("IdPacientes")
    public class PacienteController {


    @PostMapping
    @Transactional
    public void cadastrarPacientes(@RequestBody DadosCadastroPacientes dados){
        System.out.println("Dados Recebidos: " +dados);
    }
}
