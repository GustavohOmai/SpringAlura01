package med.voll.api.Model.Medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.Model.DadosEndereco;

public record DadosAtualizaMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}
