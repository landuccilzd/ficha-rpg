package br.com.landucci.ficharpg.domain.personagem.valueobject;

public class Idioma {
	
	private String nome;
	private String alfabeto;

	public Idioma(String nome, String alfabeto) {
		this.nome = nome;
		this.alfabeto = alfabeto;
	}
	
	public String getNome() {
		return nome;
	}

	public String getAlfabeto() {
		return alfabeto;
	}

	@Override
	public String toString() {
		return nome;
	}

}
