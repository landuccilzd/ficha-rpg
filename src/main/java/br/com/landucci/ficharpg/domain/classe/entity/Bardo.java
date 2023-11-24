package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Carisma;
import br.com.landucci.ficharpg.domain.habilidade.entity.Destreza;

public class Bardo extends AbstractClasse {

    public Bardo() {
        super("Bardo", "Um místico inspirador que possui poderes que ecoam a música da criação", "d8", 5);
        this.adicionarHabilidadePrimaria(new Carisma());
        this.adicionarProficienciaResistencia(new Destreza());
        this.adicionarProficienciaResistencia(new Carisma());
    }

}