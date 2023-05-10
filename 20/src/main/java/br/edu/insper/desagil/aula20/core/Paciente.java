package br.edu.insper.desagil.aula20.core;
import br.pro.hashi.sdx.dao.Dao;
import br.pro.hashi.sdx.dao.annotation.Key;

public class Paciente {
	
	private @Key int id;
	private String nome;
	
	public Paciente(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	Dao<Paciente> dao = Dao.of(Paciente.class);

	Paciente paciente = new Paciente(1, "paciente");

	dao.create(paciente);
	 
	Paciente() {
	    }

}
