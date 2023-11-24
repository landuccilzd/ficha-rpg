package br.com.landucci.ficharpg.domain.raca.anao.entity;

import java.io.Serial;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.IIncrementoNivel;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class AnaoColina extends Anao implements IRaca, IIncrementoNivel {

	@Serial
	private static final long serialVersionUID = -8191964592175743016L;

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