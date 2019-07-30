package com.db1.conta.contaapi.domain.entity;

import org.springframework.util.Assert;

public class Agencia {
	private Long id;
	private String numero;
	private String digito;
	private Cidade cidade;
	private Historico historico;
	
	public Agencia (String numero, String digito, Cidade cidade) {
		Assert.hasText(numero, "Numero da agência obrigatório!");
		Assert.hasText(digito, "Digito é obrigatório!");
		Assert.notNull(cidade, "Cidade é obrigatório!");
		this.numero = numero;
		this.digito = digito;
		this.cidade = cidade;
	}
	
	public String getNumero() {
		return numero;
	}

	public String getDigito() {
		return digito;
	}

	public Long getId() {
		return id;
	}
	
	public Cidade getCidade() {
		return cidade;
	}

}