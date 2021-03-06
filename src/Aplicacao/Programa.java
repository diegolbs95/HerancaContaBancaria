package Aplicacao;

import Entidades.Conta;
import Entidades.ContaEmpresarial;
import Entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
	
		Conta Conta = new Conta(1001, "Diego", 0.0 );
		ContaEmpresarial EmpConta = new ContaEmpresarial(1002, "Monaliza", 0.0 , 500.0);
		
		//UPCASTING => DA SUBCLASSE PARA SUPERCLASSE
		
		Conta Conta1 = EmpConta ; // SUBCLASSE PARA SUPERCLASSE
		Conta Conta2 = new ContaEmpresarial(1003, "Theo", 0.0, 200.0);// SUBCLASSE PARA SUPERCLASSE
		Conta Conta3 = new ContaPoupanca(1004,"Pietro", 0.0, 0.01);// SUBCLASSE PARA SUPERCLASSE
		
		//DOWNCASTING => DA SUPERCLASSE PARA SUBCLASSE
		
		ContaEmpresarial Conta4 = (ContaEmpresarial) Conta2 ;// PARA TRANSFERIR DE SUPERCLASSE PARA SUBCLASSE TEM COLOCAR ENTRE PARENTE QUAL SUBCLASSE
		Conta4.Empretimo(100.0);
		
		//@Override
		
		Conta Conta6 = new Conta(1006, "Sandra", 1000.0);
		Conta6.retirada(200.0);
		System.out.println(Conta6.getSaldo());
		
		Conta Conta7 = new ContaPoupanca(1007, "Danielle", 1000.0, 0.01);
		Conta7.retirada(200.0);
		System.out.println(Conta7.getSaldo());
		
		//INSANCEOF => ESTANCIA DE OUTRA CLASSE
		 if (Conta3 instanceof ContaEmpresarial) {
			 ContaEmpresarial Conta5 = (ContaEmpresarial) Conta3;
			 Conta5.Empretimo(200.0);
			 System.out.println("Emprestimo realizado!");
		 }
		 if(Conta3 instanceof ContaPoupanca) {
			 ContaPoupanca Conta5 = (ContaPoupanca) Conta3;
			 Conta5.SaldoAtualizado();
			 System.out.println("Saldo atualizado!");
		 }
		//REUTILIZANDO O CODIGO DA SUPERCLASSE E ACRESCENTANDO UMA TAXA DE 2.0
		 Conta Conta8 = new ContaEmpresarial(1008, "Di", 1000.0, 500.0);
		 Conta8.retirada(200.0);//VAI SER DESCONTADO OS 200 OS 5 DA LOGICA DA CONTA E MAIS 3 DA CONTAEMPRESARIAL
		 System.out.println(Conta8.getSaldo());
	}

}
