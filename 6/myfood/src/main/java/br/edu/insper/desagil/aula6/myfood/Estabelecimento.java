package br.edu.insper.desagil.aula6.myfood;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estabelecimento {
	private String nome;
	Map<Integer, Item> itens;

	public Estabelecimento(String nome) {
		this.nome = nome;
		this.itens = new HashMap<>();
	}
	
	public void cadastra(int codigo, Item item) {
		itens.put(codigo, item);
	}
	
	public double processa(List<Integer> codigos) {
		double total = 0;
        for (int codigo : codigos) {
            total += itens.get(codigo).calculaPreco();
        }
        return total;
	}

}
