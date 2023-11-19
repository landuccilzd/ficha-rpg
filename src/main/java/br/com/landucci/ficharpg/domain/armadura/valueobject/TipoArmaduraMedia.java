package br.com.landucci.ficharpg.domain.armadura.valueobject;

public class TipoArmaduraMedia extends TipoArmadura {

    public TipoArmaduraMedia(Integer modificadorDestreza) {
        super("Armadura média", 5, 1, modificadorDestreza);
    }

    @Override
    public Integer calcularModificadorClasseArmadura() {
        if (this.modificadorDestreza > 2) {
            return Integer.valueOf(2);
        }
        return this.modificadorDestreza;
    }
    
}
