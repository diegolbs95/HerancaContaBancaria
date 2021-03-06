package Entidades;



public class ContaEmpresarial extends Conta {
	
	private Double LimiteDeEmpretimo ;

	public ContaEmpresarial() {
		super();//PARA EXECUTAR A LOGICA DO CONSTRUTOR DA CLASSE (CONTA)
	}

	public ContaEmpresarial(Integer numero, String titular, double saldo, Double limiteDeEmpretimo) {
		super(numero, titular, saldo);
		LimiteDeEmpretimo = limiteDeEmpretimo;
	}

	public Double getLimiteDeEmpretimo() {
		return LimiteDeEmpretimo;
	}

	public void setLimiteDeEmpretimo(Double limiteDeEmpretimo) {
		LimiteDeEmpretimo = limiteDeEmpretimo;
	}
	public void Empretimo (double quantidade) {
		if (quantidade <= LimiteDeEmpretimo) {
				saldo += quantidade - 10.0;
		}
	}
	@Override
	public void retirada(double quantidade) { 
		super.retirada(quantidade);//REUTILIZANDO O CODIGO DA SUPERCLASSE E ACRESCENTANDO UMA TAXA DE 2.0
		saldo -= 2.0;
	}
	
}
		
	
	

