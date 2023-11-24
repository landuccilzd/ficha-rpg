package br.com.landucci.ficharpg.domain.personagem.factory;

import br.com.landucci.ficharpg.domain.raca.IRaca;
import br.com.landucci.ficharpg.domain.raca.anao.entity.Anao;
import br.com.landucci.ficharpg.domain.raca.anao.entity.AnaoColina;
import br.com.landucci.ficharpg.domain.raca.anao.entity.AnaoMontanha;

public class PersonagemAnaoFactory extends AbstractPersonagemFactory {

	private final IRaca[] RACAS = new IRaca[] { new Anao(), new AnaoColina(), new AnaoMontanha() };

	private final String[] NOMES_MASCULINOS = new String[] { "Adrik", "Alberich", "Baern", "Barendd", "Brottor",
			"Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Gardain", "Harbek", "Kildrak",
			"Morgran", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek", "Traubon",
			"Travok", "Ulfgar", "Veit", "Vondal" };

	private final String[] NOMES_FEMININOS = new String[] { "Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa",
			"Eldeth", "Falkrunn", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa",
			"Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra" };

	private final String[] SOBRENOMES = new String[] { "Balderk", "Battlehammer", "Brawnanvil", "Dankil", "Fireforge",
			"Frostbeard", "Gorunn", "Holderhek", "Ironfist", "Loderr", "Lutgehr", "Rumnaheim", "Strakeln", "Torunn",
			"Ungart" };

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
