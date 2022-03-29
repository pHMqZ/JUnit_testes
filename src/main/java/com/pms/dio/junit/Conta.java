package com.pms.dio.junit;

public class Conta {
	
	private String numero;
	private int saldo;
	
	public Conta(String numero, int saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public void credito(int valor) {
		this.saldo += valor;
	}
	
	public void debito(int valor) {
		this.saldo -= valor;
	}
	

}
