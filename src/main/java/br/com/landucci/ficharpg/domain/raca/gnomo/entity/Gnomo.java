package br.com.landucci.ficharpg.domain.raca.gnomo.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.raca.AbstractRaca;

public class Gnomo extends AbstractRaca {
	
	public Gnomo() {
		this("Gnomo");
	}
	
	public Gnomo(String nome) {
		super(nome, 500, 0.90, 1.20);
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		personagem.aumentarInteligencia(2);
		personagem.alterarDeslocamento(7.5);
		
		var idioma = new Idioma("Gnômico", "Comum");
		var idiomaComum = new Idioma("Comum", "Comum");
		personagem.adicionarIdioma(idioma);
		personagem.adicionarIdioma(idiomaComum);		
		//TODO: Implementar caracteristicas
		//TODO: Implementar habilidades
	}

}
