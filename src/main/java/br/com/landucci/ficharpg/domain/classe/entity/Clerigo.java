package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Carisma;
import br.com.landucci.ficharpg.domain.habilidade.entity.Sabedoria;

public class Clerigo extends AbstractClasse {

    public Clerigo() {
        super("Clérigo", "Um campeão sacerdotal que empunha magia divina a serviço de um poder maior", "d8", 5);
        this.adicionarHabilidadePrimaria(new Sabedoria());
        this.adicionarProficienciaResistencia(new Sabedoria());
        this.adicionarProficienciaResistencia(new Carisma());
    }

}
