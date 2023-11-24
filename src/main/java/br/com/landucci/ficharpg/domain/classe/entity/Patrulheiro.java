package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Destreza;
import br.com.landucci.ficharpg.domain.habilidade.entity.Forca;
import br.com.landucci.ficharpg.domain.habilidade.entity.Sabedoria;

public class Patrulheiro extends AbstractClasse {

    public Patrulheiro() {
        super("Patrulheiro", "Um guerreiro que utiliza de poderio marcial e magia natural para combater ameaças nos limites da civilização", "d10", 6);
        this.adicionarHabilidadePrimaria(new Destreza());
        this.adicionarHabilidadePrimaria(new Sabedoria());
        this.adicionarProficienciaResistencia(new Forca());
        this.adicionarProficienciaResistencia(new Destreza());
    }
}
