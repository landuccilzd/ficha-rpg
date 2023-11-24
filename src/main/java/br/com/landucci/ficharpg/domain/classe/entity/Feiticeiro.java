package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Carisma;
import br.com.landucci.ficharpg.domain.habilidade.entity.Constituicao;

public class Feiticeiro extends AbstractClasse {

    public Feiticeiro() {
        super("Feiticeiro", "Um conjurador que possui magia latente advinda de um dom ou linhagem", "d6", 4);
        this.adicionarHabilidadePrimaria(new Carisma());
        this.adicionarProficienciaResistencia(new Constituicao());
        this.adicionarProficienciaResistencia(new Carisma());
    }
}
