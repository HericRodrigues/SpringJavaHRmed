package rodrysilva.api.pacientes;

import rodrysilva.api.endereco.DadosEndereco;
import rodrysilva.api.medicos.Especialidade;

public record DadosCadastroPacientes(String nome, String email,
                                     DadosEndereco endereco) {
}
