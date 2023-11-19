package br.com.landucci.ficharpg.domain.armadura.factory;

import br.com.landucci.ficharpg.domain.armadura.entity.Armadura;
import br.com.landucci.ficharpg.domain.armadura.valueobject.TipoArmadura;

public class ArmaduraFactory {

    public static Armadura create(Long id, String nome, Double preco, Integer baseClasseArmadura, Integer forca, 
            boolean diminuiFurtividade, Double peso, TipoArmadura tipoArmadura) {
        var armadura = new Armadura(id, nome, preco, baseClasseArmadura, forca, diminuiFurtividade, peso, tipoArmadura);
        return armadura;
    }

    public static Armadura createWithEscudo(Long id, String nome, Double preco, Integer baseClasseArmadura, Integer forca, 
            boolean diminuiFurtividade, Double peso, TipoArmadura tipoArmadura) {
        var armadura = new Armadura(id, nome, preco, baseClasseArmadura, forca, diminuiFurtividade, peso, tipoArmadura);
        armadura.empunharEscudo();
        return armadura;
    }
}
