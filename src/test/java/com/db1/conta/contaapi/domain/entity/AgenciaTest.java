package com.db1.conta.contaapi.domain.entity;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AgenciaTest {

	@Test 
	public void deveRetornarNumeroAgenciaObrigatorio() {
		String mensagem = null;
		try {		
			Cidade cidade = Mockito.mock(Cidade.class);
			Agencia agencia = new Agencia (null, "123", cidade);
		}catch (Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Numero da agência obrigatório!", mensagem);
	}
	
	@Test
	public void deveRetornarDigitoObrigatorio() {
		String mensagem = null;
		try {		
			Cidade cidade = Mockito.mock(Cidade.class);
			Agencia agencia = new Agencia ("123", null, cidade);
		}catch (Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Digito é obrigatório!", mensagem);
	}
	
	@Test
	public void deveRetornarCidadeObrigatorio() {
		String mensagem = null;
		try {		
			Cidade cidade = Mockito.mock(Cidade.class);
			Agencia agencia = new Agencia ("123", "123", null);
		}catch (Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Cidade é obrigatório!", mensagem);
	}
	
	@Test
	public void deveCriarUmaInstanciaDeCidade() {
		Cidade cidade = Mockito.mock(Cidade.class);
		Agencia agencia = new Agencia ("123", "123", cidade);
		Assert.assertEquals("123", agencia.getNumero());
		Assert.assertEquals("123", agencia.getDigito());
		Assert.assertEquals(cidade, agencia.getCidade());
	}
}
