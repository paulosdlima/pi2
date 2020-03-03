package com.unitins.projetointegrador2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PerguntasFrequentesController {

	@RequestMapping("/cadastrarPerguntasFrequentes")
	public String cadastrarPerguntasFrequentes() {
		return "/admin/cadastrarPerguntasFrequentes";
	}

	@RequestMapping("/editarPerguntasFrequentes")
	public String editarPerguntasFrequentes() {
		return "/admin/editarPerguntasFrequentes";
	}

	@RequestMapping("/excluirPerguntasFrequentes")
	public String excluirPerguntasFrequentes() {
		return "/admin/excluirPerguntasFrequentes";
	}

	@RequestMapping("/listarPerguntasFrequentes")
	public String listarPerguntasFrequentes() {
		return "/admin/listarPerguntasFrequentes";
	}


}