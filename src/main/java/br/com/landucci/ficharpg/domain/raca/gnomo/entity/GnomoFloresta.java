package br.com.landucci.ficharpg.domain.raca.gnomo.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class GnomoFloresta extends Gnomo implements IRaca {

	public GnomoFloresta() {
		super("Gnomo da Floresta");
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		super.inicializarRaca(personagem);
		personagem.aumentarDestreza(1);
		
		//TODO: Implementar caracteristicas
		//TODO: Implementar truque		
	}

}