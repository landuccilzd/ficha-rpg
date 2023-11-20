package br.com.landucci.ficharpg.domain.raca.humano.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.raca.AbstractRaca;

public class Humano extends AbstractRaca {
	
	public Humano() {
		this("Humano");
	}
	
	public Humano(String nome) {
		super(nome, 100, 1.50, 1.80);
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		personagem.aumentarForca(1);
		personagem.aumentarDestreza(1);
		personagem.aumentarConstituicao(1);
		personagem.aumentarInteligencia(1);
		personagem.aumentarSabedoria(1);
		personagem.aumentarCarisma(1);
		personagem.alterarDeslocamento(9D);
		
		
		var idiomaComum = new Idioma("Comum", "Comum");
		personagem.adicionarIdioma(idiomaComum);
		//TODO: mais um idioma a escolha
				
	}

}
