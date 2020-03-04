package com.unitins.projetointegrador2.service;

import java.util.List;

import com.unitins.projetointegrador2.model.Aluno;

public interface AlunoService {
	List<Aluno> findAll();
	
	Aluno findById(Long id);
	Aluno save(Aluno aluno);

}
