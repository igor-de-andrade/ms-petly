package com.petly.api.users.dto;

public class UserResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private String crmv;

    public UserResponseDTO(Long id, String nome, String email, String crmv) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.crmv = crmv;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCrmv() {
        return crmv;
    }
}
