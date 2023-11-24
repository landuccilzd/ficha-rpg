package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Destreza;
import br.com.landucci.ficharpg.domain.habilidade.entity.Inteligencia;

public class Ladino extends AbstractClasse {

    public Ladino() {
        super("Ladino", "Um trapaceiro que utiliza de furtividade e astúcia para sobrepujar os obstáculos e inimigos", "d8", 5);
        this.adicionarHabilidadePrimaria(new Destreza());
        this.adicionarProficienciaResistencia(new Destreza());
        this.adicionarProficienciaResistencia(new Inteligencia());
    }
}
