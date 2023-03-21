package br.edu.insper.desagil.aula5.blockbeard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MatriculaTest {
	
	private Matricula matricula;
	
	@BeforeEach
	void Setup() {
		Aluno aluno = new Aluno(01, "Valdemir", 9.2);
		matricula = new Matricula(aluno);
	}

	@Test
	void constroi() {
		assertNotNull(matricula.getAluno());
		assertFalse(matricula.isTrancada());

	}
	
	@Test
	void mudaTrancada() {
		matricula.setTrancada(true);
		assertTrue(matricula.isTrancada());
	}

}
