package br.edu.insper.desagil.aula5.blockbeard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DisciplinaTest {
	
    @Test
    void constroi() {
        Disciplina disciplina = new Disciplina("DESAGIL", "Desenvolvimento Colaborativo Ágil"); // cria objeto para o qual será feita a verificaçao
        
        assertEquals("DESAGIL", disciplina.getCodigo());  // compara o resultado esperado com a chave do objeto construido
        assertEquals("Desenvolvimento Colaborativo Ágil", disciplina.getNome()); // compara o resultado esperado com o valor do objeto construido
    }
}