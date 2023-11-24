package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Inteligencia;
import br.com.landucci.ficharpg.domain.habilidade.entity.Sabedoria;

public class Mago extends AbstractClasse {

    public Mago() {
        super("Mago", "Um usuário de magia escolado, capaz de manipular as estruturas da realidade", "d6", 4);
        this.adicionarHabilidadePrimaria(new Inteligencia());
        this.adicionarProficienciaResistencia(new Inteligencia());
        this.adicionarProficienciaResistencia(new Sabedoria());
    }
}
