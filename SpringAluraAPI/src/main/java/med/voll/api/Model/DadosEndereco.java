package med.voll.api.Model;

public record DadosEndereco(
        String logradouro,
        String bairro,
        String cep,
        String cidade,
        String UF,
        String complemento,
        String numero) {

}