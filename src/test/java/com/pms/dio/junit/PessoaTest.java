package com.pms.dio.junit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
	
	@Test
	void validarCalculoDaIdade() {
		Pessoa pessoinha = new Pessoa("Alceu", LocalDateTime.of(2019, 12, 28,0,0));
		Assertions.assertEquals(2, pessoinha.getIdade());
	}
	
	@Test
	void retornarSeEhMaoirDeIdade() {
		Pessoa alceu = new Pessoa("Alceu", LocalDateTime.of(2019, 12, 28, 0, 0));
		Assertions.assertFalse(alceu.maiorDeIdade());
		
		
		Pessoa elis = new Pessoa("Elis", LocalDateTime.of(2000, 9, 18, 0, 0));
		Assertions.assertTrue(elis.maiorDeIdade());
	}

}
