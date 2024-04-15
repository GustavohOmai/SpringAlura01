package med.voll.api.Model.Medico;

public record DadosListMedico(String nome, String email, String crm, Especialidade especialidade){

    public DadosListMedico (Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}