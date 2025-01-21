import br.com.arthur.app.Calculadora;

module app.financeiro {
	
	requires java.base;
	
	requires app.api;
	uses Calculadora;
}