package br.com.fiap.model;



import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Setup {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDate dt_nascimento;
	private String cpf;
	private String rg;
	private String dt_rg;
	private LocalDate dt_cadastro;
	private String imagePath;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(LocalDate dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
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

	public String getDt_rg() {
		return dt_rg;
	}

	public void setDt_rg(String dt_rg) {
		this.dt_rg = dt_rg;
	}

	public LocalDate getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(LocalDate dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	
	@Override
	public String toString() {
		return "Setup [name=" + name + ", dt_nascimento=" + dt_nascimento + ", cpf=" + cpf + ", rg=" + rg + ", dt_rg= " + dt_rg + ", dt_cadastro=" + dt_cadastro + "]";
	}
	

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
}
