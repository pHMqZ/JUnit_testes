package com.pms.dio.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrdemTest {

	@Test
	@DisplayName("Teste de valida fluxo")
	void fluxoA() {
		assertTrue(true);
	}
	
	@Test
	@DisplayName("B")
	void fluxoB() {
		assertTrue(true);
	}
}
