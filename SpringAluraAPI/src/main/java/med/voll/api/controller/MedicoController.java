package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.Model.Medico.DadosListMedico;
import med.voll.api.Model.Medico.DadosMedico;
import med.voll.api.Model.Medico.Medico;
import med.voll.api.Model.Medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public List<DadosListMedico> listar(){
        return repository.findAll().stream().map(DadosListMedico::new).toList();
    }

}