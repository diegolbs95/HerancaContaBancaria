package Entidades;

public class ContaPoupanca extends Conta {
	
	private  Double TaxaDeJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, double saldo, Double taxaDeJuros) {
		super(numero, titular, saldo);
		TaxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return TaxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		TaxaDeJuros = taxaDeJuros;
	}
	
	public void SaldoAtualizado() {
		saldo += saldo * TaxaDeJuros;
	}
	@Override  //Override=> PARA INDICAR AO COMPILADOR QUE É UMA SOBRE POSIÇAO DE METODO / PARA PEGAR METODOS DA SUPERCLASSE
	public void retirada(double quantidade) {
		saldo -= quantidade;
	}
	

}
