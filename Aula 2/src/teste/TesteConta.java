package teste;

import Modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {
		 Conta conta1 = new Conta();
		 conta1.numeroConta=1234;
		 conta1.titular = "Creuza";
		 conta1.saldo =1000;
		 //Deposito
		 conta1.deposito(500);
		 // saque
		 if (conta1.saque(2000)) {
			 System.out.println("Saque efetuado");	 
		 }
		 else {
			 System.out.println("Saque negado!"); 
		 }
		 //imprimir Saldo
		 System.out.println("Saldo"+ conta1.saldo);
		 

	}

}
