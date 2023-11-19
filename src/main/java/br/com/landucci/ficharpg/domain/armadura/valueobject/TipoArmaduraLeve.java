package br.com.landucci.ficharpg.domain.armadura.valueobject;

public class TipoArmaduraLeve extends TipoArmadura {

    public TipoArmaduraLeve(Integer modificadorDestreza) {
        super("Armadura leve", 1, 1, modificadorDestreza);
    }

    @Override
    public Integer calcularModificadorClasseArmadura() {
        return this.modificadorDestreza;
    }
    
}
