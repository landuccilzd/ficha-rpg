package br.com.landucci.ficharpg.domain.classe.entity;

import br.com.landucci.ficharpg.domain.habilidade.entity.Inteligencia;
import br.com.landucci.ficharpg.domain.habilidade.entity.Sabedoria;

public class Druida extends AbstractClasse {

    public Druida() {
        super("Druida", "Um sacerdote da Crença Antiga, detentor dos poderes da natureza – luz da lua e crescimento das plantas, fogo e relâmpagos – e capaz de adotar formas animais", "d8", 5);
        this.adicionarHabilidadePrimaria(new Sabedoria());
        this.adicionarProficienciaResistencia(new Sabedoria());
        this.adicionarProficienciaResistencia(new Inteligencia());
    }
    
}
