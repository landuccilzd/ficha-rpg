package br.com.landucci.ficharpg.domain.raca.anao.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.IIncrementoNivel;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class AnaoColina extends Anao implements IRaca, IIncrementoNivel {

	public AnaoColina() {
		super("Anão da Colina");
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		super.inicializarRaca(personagem);
		personagem.aumentarSabedoria(1);
		personagem.aumentarPvTotal(1);
	}

	@Override
	public void incrementarNivel(Personagem personagem) {
		personagem.aumentarPvTotal(1);
	}

}