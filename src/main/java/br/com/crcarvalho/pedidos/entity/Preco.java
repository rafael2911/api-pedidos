package br.com.crcarvalho.pedidos.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Preco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
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
