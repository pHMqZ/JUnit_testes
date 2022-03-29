package com.pms.dio.junit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Pessoa {
	
	private String nome;
	private LocalDateTime nascimento;
	
	public Pessoa(String nome, LocalDateTime nascimento) {
		
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
	}
	
	
	public boolean maiorDeIdade() {
		return getIdade() >= 18;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		} else if(o ==null || getClass() != o.getClass()) {
			return false;
		} else {
			Pessoa p = (Pessoa) o;
			return nome.equals(p.nome) && Objects.equals(nascimento, p.nascimento);
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, nascimento);
	}
	

}
