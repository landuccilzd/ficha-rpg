package br.com.landucci.ficharpg.domain.raca.gnomo.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class GnomoRocha extends Gnomo implements IRaca {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6147482881626927654L;

	public GnomoRocha() {
		super("Gnomo das Rochas");
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		super.inicializarRaca(personagem);
		personagem.aumentarConstituicao(1);

		//TODO: Implementar proficiencias
		//TODO: Implementar caracteristicas
		//TODO: Implementar equipamentos
	}

}