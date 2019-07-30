package com.db1.conta.contaapi.domain.entity;

import org.springframework.util.Assert;

public class Endereco {
	private Long id;
	private String logadouro;
	private String numero;
	private String complemento;
	private Cidade cidade;
	private Cliente cliente;
	private TipoEndereco tipoEndereco;
	
	public Endereco (String logadouro, String numero, String complemento) {
		
	}
}
