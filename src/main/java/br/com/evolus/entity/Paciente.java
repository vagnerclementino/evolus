/**
 * 
 */
package br.com.evolus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author vagner
 *
 */

@Entity
@Table(name="paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name="id_paciente")
	private Long Id;
	
    @Column(name="nome_paciente", nullable=false)
    private String Nome;
    
    @ManyToOne
    @JoinColumn(name = "id_convenio")
    @JsonManagedReference
    private Convenio convenio;

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
    
    

}
