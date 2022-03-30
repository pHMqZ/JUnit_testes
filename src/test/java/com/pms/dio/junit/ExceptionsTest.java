package com.pms.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

	@Test
	void validarExceptionTransferencia() {
		Conta contaUm = new Conta("1234", 0);
		Conta contaDois = new Conta("4321", 150);
		
		Transferencia transf = new Transferencia();
		
		Assertions.assertDoesNotThrow(() -> transf.transferir(contaUm, contaDois, 10));
	}
}
