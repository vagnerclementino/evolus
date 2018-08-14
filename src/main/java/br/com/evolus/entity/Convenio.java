package br.com.evolus.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="convenio")
public class Convenio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_convenio")
    private Long Id;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	@Column(name="cnpj", nullable=false, length=14)
	private String cnpj;
	
	@Column(name="nome", nullable=false, length=200)
	private String nome;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "convenio")
    @JsonBackReference
	private List<Paciente> pacientes = new ArrayList<Paciente>();
	
}
