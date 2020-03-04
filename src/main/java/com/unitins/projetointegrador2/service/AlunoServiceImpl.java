package com.unitins.projetointegrador2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.unitins.projetointegrador2.model.Aluno;
import com.unitins.projetointegrador2.repository.AlunoRepository;

public class AlunoServiceImpl implements AlunoService{

	@Autowired
	AlunoRepository alunoRepository;
	
	@Override
	public List<Aluno> findAll() {
		// TODO Auto-generated method stub
		return alunoRepository.findAll();
	}

	@Override
	public Aluno findById(Long id) {
		// TODO Auto-generated method stub
		return alunoRepository.findById(id).get();
	}

	@Override
	public Aluno save(Aluno aluno) {
		// TODO Auto-generated method stub
		return alunoRepository.save(aluno);
	}
	

}
