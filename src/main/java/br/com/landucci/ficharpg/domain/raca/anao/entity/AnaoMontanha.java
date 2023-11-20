package br.com.landucci.ficharpg.domain.raca.anao.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class AnaoMontanha extends Anao implements IRaca {

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
