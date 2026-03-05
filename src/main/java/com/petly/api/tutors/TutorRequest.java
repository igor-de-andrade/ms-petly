package com.petly.api.tutors;
import com.petly.api.tutors.Gender;

import jakarta.validation.constraints.Email;
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
        Gender genero,

        String celular,
        @Email(message = "Email inválido")
        String email,

        String cep,
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String uf



) {}


