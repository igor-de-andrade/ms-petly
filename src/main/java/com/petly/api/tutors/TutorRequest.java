package com.petly.api.tutors;
import com.petly.api.tutors.Gender;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record TutorRequest(
        @NotBlank(message = "Nome completo é obrigatório")
        String nome,

        @NotBlank(message = "CPF é obrigatório")
        String cpf,

        String rg,

        LocalDate dataNascimento,

        @NotNull(message = "Gênero é obrigatório")
        Gender genero
) {}


