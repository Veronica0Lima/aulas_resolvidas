package br.edu.insper.desagil.aula6.rh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach; // precisa disso pro BeforeEach funcionar

class RHTest {


	    private static final double DELTA = 0.000001;

	    private RH rh;

	    @BeforeEach
	    void setUp() {
	        rh = new RH();
	    }

	    @Test
	    void folhaVazia() {
	        assertEquals(0, rh.calculaMedia(), DELTA);
	    }

	    @Test
	    void tresFuncionarios() {
	        rh.contrata(new Funcionario(0, "Maria", 10.00));
	        rh.contrata(new Funcionario(1, "João", 25.25));
	        rh.contrata(new Funcionario(2, "Mariana", 50.50));
	        assertEquals(17.15, rh.calculaMedia(), DELTA);
	    }

	    @Test
	    void tresGerentes() {
	        rh.contrata(new Gerente(0, "Maria", 10.00));
	        rh.contrata(new Gerente(1, "João", 25.25));
	        rh.contrata(new Gerente(2, "Mariana", 50.50));
	        assertEquals(17.15, rh.calculaMedia(), DELTA);
	    }

	    @Test
	    void tresDiretores() {
	        rh.contrata(new DiretorDeMarketing(1, "Maria", 10.00));
	        rh.contrata(new DiretorDeVendas(2, "João", 25.25));
	        DiretorDeVendas diretor = new DiretorDeVendas(3, "Mariana", 50.50);
	        diretor.incrementa(75.00);  // para mexer antes de adicionar, tem que declarar como variável
	        rh.contrata(diretor);
	        assertEquals(36.8, rh.calculaMedia(), DELTA);
	    }

	    @Test
	    void quatroDiferentes() {
	        rh.contrata(new Funcionario(1, "Maria", 10.00));
	        rh.contrata(new Gerente(2, "João", 25.25));
	        rh.contrata(new DiretorDeMarketing(3, "Mariana", 50.50));
	        rh.contrata(new DiretorDeVendas(4, "José", 75.00));
	        assertEquals(42.9375, rh.calculaMedia(), DELTA);
	    }
	

}
