package br.com.arthur.app.calculo;

import br.com.arthur.app.Calculadora;
import br.com.arthur.app.calculo.interno.OperacoesAritmeticas;

public class CalculadoraImpl implements Calculadora {
	
	private String id = "abc";
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return opAritmeticas.soma(nums);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
