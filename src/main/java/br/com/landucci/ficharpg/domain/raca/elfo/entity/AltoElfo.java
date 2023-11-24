package br.com.landucci.ficharpg.domain.raca.elfo.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class AltoElfo extends Elfo implements IRaca {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1018198622630377008L;

	public AltoElfo() {
		super("Alto Elfo");
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		super.inicializarRaca(personagem);
		personagem.aumentarInteligencia(1);

		//TODO: Mais um idioma a escolha
		//TODO: Implementar proficiencias
		//TODO: Implementar truques
	}

}