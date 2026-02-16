package com.petly.api.animals;

import com.petly.api.tutors.Tutor;
import com.petly.api.tutors.TutorRepository;
import com.petly.api.users.exception.BusinessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository repository;
    private final TutorRepository tutorRepository;

    public AnimalService(AnimalRepository repository,
                         TutorRepository tutorRepository) {
        this.repository = repository;
        this.tutorRepository = tutorRepository;
    }

    public Animal create(AnimalRequest request) {

        Tutor tutor = tutorRepository.findById(request.tutorId())
                .orElseThrow(() -> new BusinessException("Tutor não encontrado"));

        Animal animal = new Animal();
        animal.setNome(request.nome());
        animal.setEspecie(request.especie());
        animal.setRaca(request.raca());
        animal.setDataNascimento(request.dataNascimento());
        animal.setCor(request.cor());
        animal.setPeso(request.peso());
        animal.setMicrochip(request.microchip());
        animal.setObservacoes(request.observacoes());
        animal.setTutor(tutor);

        return repository.save(animal);
    }

    public List<Animal> findAll() {
        return repository.findAll();
    }

    public Animal findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BusinessException("Animal não encontrado"));
    }

    public Animal update(Long id, AnimalRequest request) {

        Animal animal = findById(id);

        Tutor tutor = tutorRepository.findById(request.tutorId())
                .orElseThrow(() -> new BusinessException("Tutor não encontrado"));

        animal.setNome(request.nome());
        animal.setEspecie(request.especie());
        animal.setRaca(request.raca());
        animal.setDataNascimento(request.dataNascimento());
        animal.setCor(request.cor());
        animal.setPeso(request.peso());
        animal.setMicrochip(request.microchip());
        animal.setObservacoes(request.observacoes());
        animal.setTutor(tutor);

        return repository.save(animal);
    }

    public void delete(Long id) {

        Animal animal = findById(id);
        repository.delete(animal);
    }
}
