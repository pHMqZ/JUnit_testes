package com.pms.dio.junit;


//Classe de transferencia de contas
public class Transferencia {
	
	public void transferir(Conta contaUm, Conta contaDois, int valor) {
		if(valor <=0) {
			throw new IllegalArgumentException("Valor deve ser maior que zero");
		} else {
			contaUm.debito(valor);
			contaDois.credito(valor);
		}
	}

}
