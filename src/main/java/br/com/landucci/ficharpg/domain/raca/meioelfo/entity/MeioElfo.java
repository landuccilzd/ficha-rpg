package br.com.landucci.ficharpg.domain.raca.meioelfo.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.raca.AbstractRaca;

public class MeioElfo extends AbstractRaca {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3980840276971181029L;

	public MeioElfo() {
		this("Meio Elfo");
	}
	
	public MeioElfo(String nome) {
		super(nome, 180, 1.50, 1.80);
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		personagem.aumentarCarisma(2);
		personagem.alterarDeslocamento(9D);
		
		var idioma = new Idioma("Élfico", "Élfico");
		var idiomaComum = new Idioma("Comum", "Comum");
		personagem.adicionarIdioma(idioma);
		personagem.adicionarIdioma(idiomaComum);
		//TODO: Mais um idioma a escolha
		
		//TODO: Aumentar mais dois atributos à escolha
		//TODO: Implementar caracteristicas
		//TODO: Implementar habilidades
		//TODO: Implementar proficiencias
	}

}
