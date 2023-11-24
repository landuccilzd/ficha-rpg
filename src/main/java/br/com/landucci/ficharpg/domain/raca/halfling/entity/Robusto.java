package br.com.landucci.ficharpg.domain.raca.halfling.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class Robusto extends Halfling implements IRaca {

	/**
	 * 
	 */
	private static final long serialVersionUID = -300687411647644935L;

	public Robusto() {
		super("Robusto");
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		super.inicializarRaca(personagem);
		personagem.aumentarConstituicao(1);
		//TODO: Implementar caracteristicas
	}

}