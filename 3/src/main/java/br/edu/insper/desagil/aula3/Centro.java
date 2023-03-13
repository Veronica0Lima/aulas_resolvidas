package br.edu.insper.desagil.aula3;

import java.util.Map;

public class Centro {

	public double calcula(Map<String, Double> notas) {
		double min = Double.POSITIVE_INFINITY;//pega um número positivo infinito
		double max = Double.NEGATIVE_INFINITY;

		for (double nota : notas.values()) {
			if (min > nota) {
				min = nota;
			} else if (max < nota) {
				max = nota;
			}
		}

		return (min + max) / 2;
	}

}
