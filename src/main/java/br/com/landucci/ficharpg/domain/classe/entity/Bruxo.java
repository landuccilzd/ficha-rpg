package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Carisma;
import br.com.landucci.ficharpg.domain.habilidade.entity.Sabedoria;

public class Bruxo extends AbstractClasse {

    public Bruxo() {
        super("Bruxo", "Um portador de magia derivada de barganha com uma entidade planar", "d8", 5);
        this.adicionarHabilidadePrimaria(new Carisma());
        this.adicionarProficienciaResistencia(new Sabedoria());
        this.adicionarProficienciaResistencia(new Carisma());
    }

}