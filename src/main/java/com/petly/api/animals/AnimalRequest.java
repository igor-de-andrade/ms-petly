package com.petly.api.animals;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AnimalRequest(

        @NotBlank
        String nome,

        @NotNull
        Especie especie,

        String raca,

        LocalDate dataNascimento,

        String cor,

        Double peso,

        String microchip,

        String observacoes,

        @NotNull
        Long tutorId
) {}
