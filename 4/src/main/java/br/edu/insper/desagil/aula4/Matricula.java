package br.edu.insper.desagil.aula4;


public class Matricula {
	
	// private Boolean trancado = false;  -- outra opção de declaração 
    private Aluno aluno;
    private Boolean trancado;
    
	public Matricula(Aluno aluno) {
		this.aluno = aluno;
		this.trancado = false;
	}

	public Boolean isTrancado() {  // costuma usar is em vez de get quando o atributo é booleano
		return trancado;
	}

	public void setTrancado(Boolean trancado) {
		this.trancado = trancado;
	}

	public Aluno getAluno() {
		return aluno;
	}

}
