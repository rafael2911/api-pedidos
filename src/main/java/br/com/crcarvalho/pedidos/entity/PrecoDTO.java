package br.com.crcarvalho.pedidos.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrecoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private BigDecimal preco;

	@JsonProperty("quantidade_minima")
	private Integer quantidadeMinima;

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public void setQuantidadeMinima(Integer quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}

	@Override
	public String toString() {
		return "PrecoDTO [preco=" + preco + ", quantidadeMinima=" + quantidadeMinima + "]";
	}

}
