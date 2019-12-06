package br.com.crcarvalho.pedidos.entity;

import java.io.Serializable;
import java.util.List;

public class FornecedorDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cnpj;
	private List<PrecoDTO> precos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<PrecoDTO> getPrecos() {
		return precos;
	}

	public void setPrecos(List<PrecoDTO> precos) {
		this.precos = precos;
	}

	@Override
	public String toString() {
		return "FornecedorDTO [nome=" + nome + ", cnpj=" + cnpj + ", precos=" + precos + "]";
	}

}
