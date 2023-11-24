package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Carisma;
import br.com.landucci.ficharpg.domain.habilidade.entity.Forca;
import br.com.landucci.ficharpg.domain.habilidade.entity.Sabedoria;

public class Paladino extends AbstractClasse {

    public Paladino() {
        super("Paladino", "Um guerreiro divino vinculado a um juramento sagrado", "d10", 6);
        this.adicionarHabilidadePrimaria(new Forca());
        this.adicionarHabilidadePrimaria(new Carisma());
        this.adicionarProficienciaResistencia(new Sabedoria());
        this.adicionarProficienciaResistencia(new Carisma());
    }
}
