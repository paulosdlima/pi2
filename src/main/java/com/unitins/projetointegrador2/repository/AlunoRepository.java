package com.unitins.projetointegrador2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.unitins.projetointegrador2.model.Aluno;

@Repository
@Transactional
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
