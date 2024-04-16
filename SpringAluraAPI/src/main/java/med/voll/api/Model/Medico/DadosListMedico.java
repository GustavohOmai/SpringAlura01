package med.voll.api.Model.Medico;

public record DadosListMedico(Long id, String nome, String email, String crm, Especialidade especialidade){
    public DadosListMedico (Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
