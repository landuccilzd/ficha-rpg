package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Destreza;
import br.com.landucci.ficharpg.domain.habilidade.entity.Forca;
import br.com.landucci.ficharpg.domain.habilidade.entity.Sabedoria;

public class Monge extends AbstractClasse {

    public Monge() {
        super("Monge", "Um mestre das artes marciais, utilizando o poder corporal para atingir a perfeição física e espiritual", "d8", 5);
        this.adicionarHabilidadePrimaria(new Destreza());
        this.adicionarHabilidadePrimaria(new Sabedoria());
        this.adicionarProficienciaResistencia(new Forca());
        this.adicionarProficienciaResistencia(new Destreza());
    }
}
