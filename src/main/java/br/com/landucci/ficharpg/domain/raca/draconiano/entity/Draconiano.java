package br.com.landucci.ficharpg.domain.raca.draconiano.entity;

import java.io.Serial;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.raca.AbstractRaca;

public class Draconiano extends AbstractRaca {

	@Serial
	private static final long serialVersionUID = -1269752880810299595L;

	public Draconiano() {
		this("Draconiano");
	}
	
	public Draconiano(String nome) {
		super(nome, 80, 1.80, 2.00);
	}

	@Override
	public void inicializarRaca(Personagem personagem) {
		personagem.aumentarForca(2);
		personagem.aumentarCarisma(1);
		personagem.alterarDeslocamento(9D);
		
		var idioma = new Idioma("Draconiano", "Draconiano");
		var idiomaComum = new Idioma("Comum", "Comum");
		personagem.adicionarIdioma(idioma);
		personagem.adicionarIdioma(idiomaComum);
				
		//TODO: Implementar Armas
		//TODO: Implementar caracteristicas
	}

}