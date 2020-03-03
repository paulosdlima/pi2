package com.unitins.projetointegrador2.repository;

import com.unitins.guideDocs.models.PerguntasFrequentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerguntasFrequentesRepository extends JpaRepository<PerguntasFrequentes, String> {
	// REVER
}