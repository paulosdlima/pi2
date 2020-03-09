package com.unitins.projetointegrador2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Aluno extends Pessoa implements Serializable {

	/**
	 * 
	 * @author Gemido
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Turma turma;

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Aluno() {
	}

	public Aluno(String nome, String matricula, String cpf, String senha, String roles) {
		setNome(nome);
		setMatricula(matricula);
		setCpf(cpf);
		setSenha(senha);
		setRoles(roles);
		setEmail("hygor-araujo2@hotmail.com");
	}

}
