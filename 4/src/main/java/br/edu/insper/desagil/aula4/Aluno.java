package br.edu.insper.desagil.aula4;

public class Aluno {
	
	private int identificador;
    private String nome;
    private double CR;
    
	public Aluno(int identificador, String nome, double CR) {
		this.identificador = identificador;
		this.nome = nome;
		this.CR = CR;
	}

	public double getCR() {
		return CR;
	}

	public void setCR(double cR) {
		CR = cR;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getNome() {
		return nome;
	}
		

}
