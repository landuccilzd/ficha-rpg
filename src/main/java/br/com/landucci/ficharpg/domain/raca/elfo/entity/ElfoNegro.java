package br.com.landucci.ficharpg.domain.raca.elfo.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class ElfoNegro extends Elfo implements IRaca {

	public ElfoNegro() {
		super("Elfo Negro (Drow)");
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		super.inicializarRaca(personagem);
		personagem.aumentarCarisma(1);
		personagem.alterarDeslocamento(10.5);
		
		//TODO: Implementar caracteristiacs
		//TODO: Implementar Magias
		//TODO: Implementar Proficiencias		
	}

}