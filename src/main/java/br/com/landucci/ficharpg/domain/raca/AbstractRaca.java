package br.com.landucci.ficharpg.domain.raca;

import java.io.Serializable;

public abstract class AbstractRaca implements IRaca, Serializable {

	private static final long serialVersionUID = 8563360468964200838L;

	protected String nome;
	protected Integer idadeMaxima;
	protected Double alturaMinima;
	protected Double alturaMaxima;
	
	public AbstractRaca(String nome, Integer idadeMaxima, Double alturaMinima, Double alturaMaxima) {
		this.nome = nome;
		this.idadeMaxima = idadeMaxima;
		this.alturaMinima = alturaMinima;
		this.alturaMaxima = alturaMaxima;
	}

	@Override
	public String toString() {
		return nome;
	}
	
}