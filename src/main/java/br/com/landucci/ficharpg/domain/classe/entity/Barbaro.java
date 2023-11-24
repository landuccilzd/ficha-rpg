package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Constituicao;
import br.com.landucci.ficharpg.domain.habilidade.entity.Forca;
import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;

public class Barbaro extends AbstractClasse {

	public Barbaro() {
        super("Bárbaro", "Um feroz guerreiro de origem primitiva que pode entrar em fúria durante uma batalha", "d12", 7);
        this.adicionarHabilidadePrimaria(new Forca());
        this.adicionarProficienciaResistencia(new Forca());
        this.adicionarProficienciaResistencia(new Constituicao());
    }

	@Override
	public void inicializarClasse(Personagem personagem) {
		personagem.alterarPvTotal(12 + personagem.getConstituicao().getModificador());
	}

}