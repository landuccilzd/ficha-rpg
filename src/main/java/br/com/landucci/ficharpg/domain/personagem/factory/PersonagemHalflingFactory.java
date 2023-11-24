package br.com.landucci.ficharpg.domain.personagem.factory;

import br.com.landucci.ficharpg.domain.raca.IRaca;
import br.com.landucci.ficharpg.domain.raca.halfling.entity.Halfling;
import br.com.landucci.ficharpg.domain.raca.halfling.entity.PesLeves;
import br.com.landucci.ficharpg.domain.raca.halfling.entity.Robusto;

public class PersonagemHalflingFactory extends AbstractPersonagemFactory {

	private final IRaca[] RACAS = new IRaca[] { new Halfling(), new PesLeves(), new Robusto() };

	private final String[] NOMES_MASCULINOS = new String[] { "Alton", "Ander", "Cade", "Corrin", "Eldon", "Errich",
			"Finnan", "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn", "Perrin", "Reed", "Roscoe", "Wellby" };

	private final String[] NOMES_FEMININOS = new String[] { "Andry", "Bree", "Callie", "Cora", "Euphemia", "Jillian",
			"Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela", "Portia", "Seraphina", "Shaena", "Trym", "Vani",
			"Verna" };

	private final String[] SOBRENOMES = new String[] { "Cata-Escovas", "Bom-Barril", "Garrafa Verde", "Alta Colina",
			"Baixa Colina", "Prato Cheio", "Folha de Chá", "Espinhudo", "Cinto Frouxo", "Galho Caído" };

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
