package br.com.landucci.ficharpg.domain.raca.anao.entity;

import java.io.Serial;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class AnaoMontanha extends Anao implements IRaca {

	@Serial
	private static final long serialVersionUID = 3440592542899502015L;

	public AnaoMontanha() {
		super("Anão da Montanha");
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		super.inicializarRaca(personagem);
		personagem.aumentarForca(2);
		//TODO: Implementar proficiencias
	}

}
