package br.edu.insper.desagil.aula6.myfood;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class EstabelecimentoTest {
	
	private Estabelecimento est;
	private List<Integer> codigos;
	private static final double DELTA = 0.000001;
	
	@BeforeEach
	void setUp() {
		est = new Estabelecimento("Sla");
		codigos = new ArrayList<>();
	}

	@Test
	void doisDeTresComuns() {
		est.cadastra(1, new ItemComum("Socorro", 10));
		est.cadastra(2, new ItemComum("Socorro", 10));
		est.cadastra(3, new ItemComum("Socorro", 10));
		
		codigos.add(2);
		codigos.add(3);
		assertEquals(20, est.processa(codigos), DELTA);
	}
	
	@Test
	void doisComunsUmCombo() {
		List<ItemComum> itens = new ArrayList<>();
		itens.add(new ItemComum("Socorro", 10));
		itens.add(new ItemComum("Socorro", 10));
		itens.add(new ItemComum("Socorro", 10));
		
		est.cadastra(1, new ItemComum("Socorro", 10));
		est.cadastra(2, new ItemComum("Socorro", 10));
		est.cadastra(3, new ItemCombo("aaa", 0.1, itens));
		
		codigos.add(1);
		codigos.add(2);
		codigos.add(3);
		assertEquals(23, est.processa(codigos), DELTA);
	}

}
