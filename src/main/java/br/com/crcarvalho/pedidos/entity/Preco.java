package br.com.crcarvalho.pedidos.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Preco {
	
	@EmbeddedId
	private PrecoId precoId;
	private double preco;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public PrecoId getPrecoId() {
		return precoId;
	}

	public void setPrecoId(PrecoId precoId) {
		this.precoId = precoId;
	}

}
