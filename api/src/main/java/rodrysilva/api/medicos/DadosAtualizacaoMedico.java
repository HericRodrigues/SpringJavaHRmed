package rodrysilva.api.medicos;

import jakarta.validation.constraints.NotNull;
import rodrysilva.api.endereco.DadosEndereco;

        public record DadosAtualizacaoMedico(
                @NotNull
                Long id,
                String nome,
                String telefone,
                DadosEndereco endereco){
}
