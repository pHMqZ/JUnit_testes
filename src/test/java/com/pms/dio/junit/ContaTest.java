package com.pms.dio.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContaTest {
	
	@Test
	void validarSaldo() {
		Conta continha = new Conta("1234", 250);
		assertNotNull(continha);
		
		
		continha.credito(50);
		assertEquals(300, continha.getSaldo());
		
		continha.debito(100);
		assertEquals(200, continha.getSaldo());
		
		
	}

}
