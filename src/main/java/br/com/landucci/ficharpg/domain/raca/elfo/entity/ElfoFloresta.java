package br.com.landucci.ficharpg.domain.raca.elfo.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class ElfoFloresta extends Elfo implements IRaca {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3273969388567825463L;

	public ElfoFloresta() {
		super("Elfo da Floresta");
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		super.inicializarRaca(personagem);
		personagem.aumentarSabedoria(1);
		personagem.alterarDeslocamento(10.5);
		//TODO: Implementar proficiencias
	}

}