package br.edu.insper.desagil.aula3;

import java.util.List;
import java. util. ArrayList;

public class Divisores {

	public List<Integer> extrai(int n) {
		
		List<Integer> divisores = new ArrayList<>();
	    for (int d = 1; d <= n; d++) {
	        if (n % d == 0) {
	            divisores.add(d);
	        }
	    } 
		return divisores;
	}

}
