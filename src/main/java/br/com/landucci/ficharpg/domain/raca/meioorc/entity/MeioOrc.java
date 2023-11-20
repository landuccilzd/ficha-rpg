package br.com.landucci.ficharpg.domain.raca.meioorc.entity;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.raca.AbstractRaca;

public class MeioOrc extends AbstractRaca {
	
	public MeioOrc() {
		this("Meio Orc");
	}
	
	public MeioOrc(String nome) {
		super(nome, 75, 1.80, 2.10);
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		personagem.aumentarForca(2);
		personagem.aumentarConstituicao(1);
		personagem.alterarDeslocamento(9D);
		
		var idioma = new Idioma("Orc", "Anão");
		var idiomaComum = new Idioma("Comum", "Comum");
		personagem.adicionarIdioma(idioma);
		personagem.adicionarIdioma(idiomaComum);
		
		//TODO: Implementar habilidades
		//TODO: Implementar proficiencias
		//TODO: Implementar ataques
	}

}
