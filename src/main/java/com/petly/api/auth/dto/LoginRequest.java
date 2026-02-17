package com.petly.api.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(
      @NotBlank(message = "O e-mail é obrigatório")
      @Email(message = "E-mail inválido")
      String email,

     @NotBlank(message = "A senha não pode ser vazia")
      @jakarta.validation.constraints.Size(
      	    min = 6,
      	    max = 255,
      	    message = "A senha precisa ter entre 6 e 255 caracteres")
     String senha
) {}