package br.edu.insper.desagil.aula3;

import java.util.Map;
import java.util.*;

public class Frequencia {
	public Map<Character, Integer> conta(String string) {
		
	    Map<Character, Integer> frequencia = new HashMap<>(); // declara variavel de saida 
	    
	    for (int i = 0; i < string.length(); i++) {
	        char c = string.charAt(i); // metodo para pegar letra na string 
	        
	        if (!frequencia.containsKey(c)) {
	            frequencia.put(c, 0);
	        }
	        frequencia.put(c, frequencia.get(c) + 1);
	    }
	    return frequencia;

}
}