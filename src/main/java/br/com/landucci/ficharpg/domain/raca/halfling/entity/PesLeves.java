package br.com.landucci.ficharpg.domain.raca.halfling.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class PesLeves extends Halfling implements IRaca {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1587804286284821200L;

	public PesLeves() {
		super("Pés Leves");
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		super.inicializarRaca(personagem);
		personagem.aumentarCarisma(1);
		//TODO: Implementar caracteristicas
	}

}