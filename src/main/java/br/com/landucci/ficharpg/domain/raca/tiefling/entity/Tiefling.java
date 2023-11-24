package br.com.landucci.ficharpg.domain.raca.tiefling.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.raca.AbstractRaca;

public class Tiefling extends AbstractRaca {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6666641739208563000L;

	public Tiefling() {
		this("Tiefling");
	}
	
	public Tiefling(String nome) {
		super(nome, 200, 1.50, 1.80);
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		personagem.aumentarInteligencia(1);
		personagem.aumentarCarisma(2);
		personagem.alterarDeslocamento(9D);
		
		var idioma = new Idioma("Infernal", "Infernal");
		var idiomaComum = new Idioma("Comum", "Comum");
		personagem.adicionarIdioma(idioma);
		personagem.adicionarIdioma(idiomaComum);
		
		//TODO: Implementar habilidades
		//TODO: Implementar truques		
		//TODO: Implementar idiomas		
	}

}
