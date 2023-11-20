package br.com.landucci.ficharpg.domain.raca.anao.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.raca.AbstractRaca;

public class Anao extends AbstractRaca {

	public Anao() {
		this("Anão");
	}
	
	public Anao(String nome) {
		super(nome, 350, 1.20, 1.50);
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		personagem.aumentarConstituicao(2);
		personagem.alterarDeslocamento(7.5);
		
		var idiomaAnao = new Idioma("Anão", "Anão");
		var idiomaComum = new Idioma("Comum", "Comum");
		personagem.adicionarIdioma(idiomaAnao);
		personagem.adicionarIdioma(idiomaComum);
		
		//TODO: Implementar características
		//TODO: Implementar habilidades
		//TODO: Implementar características
		//TODO: Implementar proficiencias
		//TODO: Implementar equipamentos
		//TODO: Implementar ataques
		//TODO: Implementar magias
	}

}