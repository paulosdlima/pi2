package com.unitins.projetointegrador2.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class PerguntasFrequentes {

	public PerguntasFrequentes(Integer id, String pergunta, String resposta) {
		super();
		this.id = id;
		this.pergunta = pergunta;
		this.resposta = resposta;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty(message = "Pergunta nao pode ser vazia.")
	@Column(name = "pergunta")
	private String pergunta;

	@NotEmpty(message = "Resposta nao pode ser vazia.")
	@Column(name = "resposta")
	private String resposta;

	public PerguntasFrequentes() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
