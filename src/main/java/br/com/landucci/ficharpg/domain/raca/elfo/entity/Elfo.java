package br.com.landucci.ficharpg.domain.raca.elfo.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.raca.AbstractRaca;

public class Elfo extends AbstractRaca {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3995361400315677060L;

	public Elfo() {
		this("Elfo");
	}
	
	public Elfo(String nome) {
		super(nome, 750, 1.50, 1.80);
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		personagem.aumentarDestreza(2);
		personagem.alterarDeslocamento(9D);
		
		var idiomaElfico = new Idioma("Élfico", "Élfico");
		var idiomaComum = new Idioma("Comum", "Comum");
		personagem.adicionarIdioma(idiomaElfico);
		personagem.adicionarIdioma(idiomaComum);
		
		//TODO: Implementar características
		//TODO: Implementar habilidades
		//TODO: Implementar características
		//TODO: Implementar proficiencias
		//TODO: Implementar equipamentos
		//TODO: Implementar ataques
		//TODO: Implementar magias
	}

}