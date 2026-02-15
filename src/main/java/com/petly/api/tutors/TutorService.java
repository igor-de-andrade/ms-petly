package com.petly.api.tutors;

import com.petly.api.tutors.TutorRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

    private final TutorRepository repository;

    public TutorService(TutorRepository repository) {
        this.repository = repository;
    }

    public Tutor create(TutorRequest request) {

        if (repository.existsByCpf(request.cpf())) {
            throw new RuntimeException("CPF já cadastrado");
        }

        Tutor tutor = new Tutor();
        tutor.setNome(request.nome());
        tutor.setCpf(request.cpf());
        tutor.setRg(request.rg());
        tutor.setDataNascimento(request.dataNascimento());
        tutor.setGenero(request.genero());

        return repository.save(tutor);
    }

    public List<Tutor> findAll() {
        return repository.findAll();
    }

    public Tutor findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tutor não encontrado"));
    }

    public Tutor update(Long id, TutorRequest request) {

        Tutor tutor = findById(id);

        if (!tutor.getCpf().equals(request.cpf())
                && repository.existsByCpf(request.cpf())) {
            throw new RuntimeException("CPF já cadastrado");
        }

        tutor.setNome(request.nome());
        tutor.setCpf(request.cpf());
        tutor.setRg(request.rg());
        tutor.setDataNascimento(request.dataNascimento());
        tutor.setGenero(request.genero());

        return repository.save(tutor);
    }

    public void delete(Long id) {
        Tutor tutor = findById(id);
        repository.delete(tutor);
    }
}
