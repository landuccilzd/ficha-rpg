package br.com.landucci.ficharpg.domain.armadura.valueobject;

public class TipoArmaduraPesada extends TipoArmadura {

    public TipoArmaduraPesada(Integer modificadorDestreza) {
        super("Armadura Pesada", 10, 5, modificadorDestreza);
    }

    @Override
    public Integer calcularModificadorClasseArmadura() {
        return Integer.valueOf(0);
    }
    
}
