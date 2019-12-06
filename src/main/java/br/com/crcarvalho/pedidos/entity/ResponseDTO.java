package br.com.crcarvalho.pedidos.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponseDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<FornecedorDTO> fornecedores = new ArrayList<>();

	public List<FornecedorDTO> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<FornecedorDTO> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
}
