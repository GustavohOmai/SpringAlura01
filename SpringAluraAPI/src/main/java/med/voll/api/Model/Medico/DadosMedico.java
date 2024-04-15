package med.voll.api.Model.Medico;

import med.voll.api.Model.DadosEndereco;

public record DadosMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEndereco endereco
) {

}
