package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Constituicao;
import br.com.landucci.ficharpg.domain.habilidade.entity.Forca;
import br.com.landucci.ficharpg.domain.habilidade.entity.IHabilidade;

public class Guerreiro extends AbstractClasse {

    public Guerreiro(IHabilidade habilidadePrimaria) {
        super("Guerreiro", "Um mestre do combate, perito em uma vasta gama de armas e armaduras", "d10", 6);
        this.adicionarHabilidadePrimaria(habilidadePrimaria);
        this.adicionarProficienciaResistencia(new Constituicao());
        this.adicionarProficienciaResistencia(new Forca());
    }
}
