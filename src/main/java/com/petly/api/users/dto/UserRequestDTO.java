package com.petly.api.users.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequestDTO {

    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    @Email
    @Size(max = 150)
    private String email;

    @Size(max = 20)
    private String crmv;

    @NotBlank
    @Size(min = 6, max = 255)
    private String senha;

    /* Getters e Setters */

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCrmv() {
        return crmv;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
