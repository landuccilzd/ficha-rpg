package br.com.landucci.ficharpg.domain.personagem.factory;

import br.com.landucci.ficharpg.domain.raca.IRaca;
import br.com.landucci.ficharpg.domain.raca.elfo.entity.AltoElfo;
import br.com.landucci.ficharpg.domain.raca.elfo.entity.Elfo;
import br.com.landucci.ficharpg.domain.raca.elfo.entity.ElfoFloresta;
import br.com.landucci.ficharpg.domain.raca.elfo.entity.ElfoNegro;

public class PersonagemElfoFactory extends AbstractPersonagemFactory {

	private final IRaca[] RACAS = new IRaca[] { new Elfo(), new AltoElfo(), new ElfoFloresta(), new ElfoNegro() };

	private final String[] NOMES_MASCULINOS = new String[] { "Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro",
			"Berrian", "Carric", "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral",
			"Ivellios", "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon", "Rolen", "Soveliss",
			"Thamior", "Tharivol", "Theren", "Varis" };

	private final String[] NOMES_FEMININOS = new String[] { "Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua",
			"Bethrynna", "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth",
			"Leshanna", "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava",
			"Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia" };

	private final String[] SOBRENOMES = new String[] { "Amakiir", "Amastacia", "Galanodel", "Holimion", "Ilphelkiir",
			"Liadon", "Meliamne", "Nailo", "Siannodel", "Xiloscient" };

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
