package br.com.landucci.ficharpg.domain.raca.halfling.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.raca.AbstractRaca;

public class Halfling extends AbstractRaca {
	
	public Halfling() {
		this("Halfling");
	}
	
	public Halfling(String nome) {
		super(nome, 150, 0.70, 1.10);
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		personagem.aumentarDestreza(2);
		personagem.alterarDeslocamento(7.5);
		
		var idioma = new Idioma("Halfling", "Comum");
		var idiomaComum = new Idioma("Comum", "Comum");
		personagem.adicionarIdioma(idioma);
		personagem.adicionarIdioma(idiomaComum);
		
		//TODO: Implementar caracteristicas

	}

}
