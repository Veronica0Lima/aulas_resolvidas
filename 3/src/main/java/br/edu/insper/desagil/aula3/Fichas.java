package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

public class Fichas {

	public List<Map<String, String>> reformata(List<Map<String, String>> originais) {
		List <Map <String, String> > modificados = new ArrayList<>();
		 
		for (Map <String, String> original : originais) { //percorre a lista de dicionarios com a key "original"
			Map <String, String>  modificado = new HashMap<>();
			
			String prefixo;
			
			if (original.containsKey("curso")) { //verfica se tem essa key 
				prefixo = "al.";
				
			} else {
				prefixo = "";
			}
			
			modificado.put("email", original.get("login") + "@" + prefixo+ "insper.edu.br"); // para ir adicionando, basta colocara chave e o que ela contém 
			modificado.put("nome", original.get("nome") + " " + original.get("sobrenome"));
			
			modificados.add(modificado);
		}
		return modificados;
	}

}
