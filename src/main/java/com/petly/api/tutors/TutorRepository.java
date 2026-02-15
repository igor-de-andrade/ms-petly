package com.petly.api.tutors;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

    Optional<Tutor> findByCpf(String cpf);

    boolean existsByCpf(String cpf);
}

