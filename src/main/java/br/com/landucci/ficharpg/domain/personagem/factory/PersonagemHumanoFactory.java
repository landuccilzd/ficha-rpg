package br.com.landucci.ficharpg.domain.personagem.factory;

import br.com.landucci.ficharpg.domain.raca.IRaca;
import br.com.landucci.ficharpg.domain.raca.humano.entity.Humano;

public class PersonagemHumanoFactory extends AbstractPersonagemFactory {

	private final IRaca[] RACAS = new IRaca[] { new Humano() };

	private final String[] NOMES_MASCULINOS = new String[] {};

	private final String[] NOMES_FEMININOS = new String[] {};

	private final String[] SOBRENOMES = new String[] {};

	public IRaca gerarRaca() {
		var indice = random.nextInt(RACAS.length);
		return RACAS[indice];
	}

	public String gerarNomeFeminino() {
		var indice = random.nextInt(NOMES_FEMININOS.length);
		return NOMES_FEMININOS[indice];
	}

	public String gerarNomeMasculino() {
		var indice = random.nextInt(NOMES_MASCULINOS.length);
		return NOMES_MASCULINOS[indice];
	}

	public String gerarSobrenome() {
		var indice = random.nextInt(SOBRENOMES.length);
		return SOBRENOMES[indice];
	}

}
