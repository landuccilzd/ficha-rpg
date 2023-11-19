package br.com.landucci.ficharpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FicharpgApplication {

	public static void main(String[] args) {
		SpringApplication.run(FicharpgApplication.class, args);

		/*
		var mellianTallan = PersonagemFactory.create(
			"Cris", "Mellian Tallan", 237, 1.67, 63.0, "Azuis", "Branca", "Prateados");
			var tipoArmadura = new TipoArmaduraLeve(mellianTallan.getDestreza().getModificador());
		var armadura = ArmaduraFactory.create(Long.valueOf(1), "Armadura de Couro", 1000D, 11, 0, false, 5D, 
				tipoArmadura);
		mellianTallan.vestirArmadura(armadura);
		System.out.println(mellianTallan);
		System.out.println(mellianTallan.getArmaduraVestida());
		*/
	}

}
