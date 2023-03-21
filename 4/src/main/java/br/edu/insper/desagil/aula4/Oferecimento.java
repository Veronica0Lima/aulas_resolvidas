package br.edu.insper.desagil.aula4;

import java.time.LocalDate;
import java.util.ArrayList; // tem coisa pra importar aqui 
import java.util.List;

public class Oferecimento {
    private Disciplina disciplina;  // ??? quando declarar variavel assim ou do outro jeito ????
    private LocalDate inicio;
    private LocalDate fim;
    private List<Matricula> matriculas;

    public Oferecimento(Disciplina disciplina, LocalDate inicio, LocalDate fim) {
        this.disciplina = disciplina;
        this.inicio = inicio;
        this.fim = fim;
        this.matriculas = new ArrayList<>(); // mesma coisa que List<Aluno> alunos = new ArrayList<>(), so que separado 
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFim() {
        return fim;
    }
    
    public void fazMatricula(Aluno aluno) {
    	
    	Matricula novaMatricula = new Matricula(aluno);
    	matriculas.add(novaMatricula);
    }
    
    public int numeroDeAlunos() {  // ?? PORQUE PODE SER VAZIO
    	return matriculas.size();
    }
}