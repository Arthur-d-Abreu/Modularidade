import br.com.arthur.app.Calculadora;
import br.com.arthur.app.calculo.CalculadoraImpl;

module app.calculo {
	
	/*
	 * exports br.com.arthur.app.calculo; requires app.logging;
	 */
	
	exports br.com.arthur.app.calculo.interno to app.financeiro;
	
	opens br.com.arthur.app.calculo to app.financeiro;
	
	requires app.api;
	
	provides Calculadora with CalculadoraImpl;
	
}