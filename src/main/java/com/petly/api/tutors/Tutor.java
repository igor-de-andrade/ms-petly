package com.petly.api.tutors;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tutors")
public class Tutor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 150)
	private String nome;

	@Column(nullable = false, unique = true, length = 14)
	private String cpf;

	@Column(length = 20)
	private String rg;

	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;

	@Enumerated(EnumType.STRING)
	@Column(name = "genero", nullable = false, length = 20)
	private Gender genero;

	public Tutor() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Gender getGenero() {
		return genero;
	}

	public void setGenero(Gender genero) {
		this.genero = genero;
	}
}
