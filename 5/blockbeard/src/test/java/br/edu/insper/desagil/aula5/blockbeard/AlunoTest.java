package br.edu.insper.desagil.aula5.blockbeard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {
	
	private Aluno aluno;
	private static final double DELTA = 0.000001;
	
	@BeforeEach
	void Setup() {
		aluno = new Aluno(01, "Valdemir", 9.2);
	}

	@Test
	void constroi() {
		assertEquals(01, aluno.getId());
		assertEquals("Valdemir", aluno.getNome());
		assertEquals(9.2 , aluno.getCr(), DELTA);
	}
	
	@Test
	void mudaCr() {
		aluno.setCr(4.2);
		assertEquals(4.2 , aluno.getCr(), DELTA);
	}

}
