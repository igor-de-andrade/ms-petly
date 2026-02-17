package com.petly.api.users.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequestDTO {

	@NotBlank(message = "O nome é obrigatório")
	@Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
	private String nome;

	@NotBlank(message = "O e-mail é obrigatório")
	@Email(message = "E-mail inválido")
	@Size(max = 150, message = "O e-mail deve ter no máximo 150 caracteres")
	private String email;

	@Size(max = 20, message = "O CRMV deve ter no máximo 20 caracteres")
	private String crmv;

	@NotBlank(message = "A senha é obrigatória")
	@Size(
	    min = 6,
	    max = 255,
	    message = "A senha precisa ter entre 6 e 255 caracteres"
	)
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
