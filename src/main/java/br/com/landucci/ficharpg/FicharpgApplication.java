package br.com.landucci.ficharpg;

import java.util.Random;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.landucci.ficharpg.domain.armadura.factory.ArmaduraFactory;
import br.com.landucci.ficharpg.domain.armadura.valueobject.TipoArmaduraLeve;
import br.com.landucci.ficharpg.domain.personagem.factory.AbstractPersonagemFactory;
import br.com.landucci.ficharpg.domain.personagem.factory.PersonagemAnaoFactory;
import br.com.landucci.ficharpg.domain.personagem.factory.PersonagemElfoFactory;
import br.com.landucci.ficharpg.domain.personagem.factory.PersonagemHalflingFactory;

@SpringBootApplication
public class FicharpgApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FicharpgApplication.class, args);

//		var mellianTallan = PersonagemFactory.create(
//			"Cris", "Mellian Tallan", 237, 1.67, 63.0, "Azuis", "Branca", "Prateados");
		
		for (int i = 0; i < 20; i++) {
			AbstractPersonagemFactory factory = getFactory();
			var personagem = factory.randomize();		
			var tipoArmadura = new TipoArmaduraLeve(personagem.getDestreza().getModificador());
			var armadura = ArmaduraFactory.create("Armadura de Couro", 1000D, 11, 0, false, 5D, tipoArmadura);
			personagem.vestirArmadura(armadura);
			System.out.println(personagem.toJSON());
		}
	}

	private static AbstractPersonagemFactory getFactory() {
		var raca = new Random().nextInt(1, 4);		
		AbstractPersonagemFactory factory = null;
		switch (raca) {
			case 1: {
				factory = new PersonagemAnaoFactory();
				break;
			} case 2: {
				factory = new PersonagemElfoFactory();
				break;
			} case 3: {
				factory = new PersonagemHalflingFactory();
				break;				
			}
		}
		
		return factory;
	}
	
}