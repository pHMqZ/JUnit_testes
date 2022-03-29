package com.pms.dio.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class AssertionsTest {
	
	@Test
	void validarOperacoes() {
		//Soma
		int result = 20;
		assertEquals(result, (10+10));
		
		
		//Igualdade de valores
		double var = 2.0;
		double var2 = 2.0;
		assertEquals(var, var2);
	}

	@Test
	void igualdadeArray() {
		//Comparando um a um
		int[] arrayUm = {10,20,30,40};
		int[] arrayDois = {10,20,30,40};
		assertArrayEquals(arrayUm, arrayDois);
		
		//Comparando arrays diferentes - Boolean
		boolean[] flags = {true,false,true};
		assertArrayEquals(flags, new boolean[] {true,false,true});
		
		//Comparando arrays diferentes - Double
		double[] valores = {5.0,3.0,2.0};
		assertArrayEquals(valores, new double[] {5.0,3.0,2.0});
	}
	
	@Test
    void validarObjNulo() {

        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Banguela", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {

        double valor = 5.0;
        double valorDois = 5.0;

        assertEquals(valor, valorDois);
    }

    @Test
    void validarVAloresDiferentes(){

        int x = 5;
        int y = 6;

        assertNotEquals(5, 6);
    }

    @Test
    void validarCondicaoFalsa() {

        boolean condicao = 5 + 6 == 12;

        assertFalse(condicao);
    }

    @Test
    void validarCondicacaoVerdadeira() {

        var condicao = 6 + 6 == 12;

        assertTrue(condicao);
    }

}
