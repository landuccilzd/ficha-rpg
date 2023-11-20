package br.com.landucci.ficharpg.domain.armadura.entity;

import br.com.landucci.ficharpg.domain.armadura.valueobject.TipoArmadura;

public class Armadura {

    private String nome;
    private Integer classeArmadura;
    private Double preco;
    private Integer forca;
    private boolean diminuiFurtividade;
    private Double peso;
    private TipoArmadura tipoArmadura;
    private boolean escudo = false;
    private Integer modificadorDestreza;
    private Integer baseClasseArmadura;

    public Armadura(String nome, Double preco, Integer baseClasseArmadura, Integer forca, boolean diminuiFurtividade, 
            Double peso, TipoArmadura tipoArmadura) {
        this.nome = nome;
        this.preco = preco;
        this.baseClasseArmadura = baseClasseArmadura;
        this.forca = forca;
        this.diminuiFurtividade = diminuiFurtividade;
        this.peso = peso;
        this.tipoArmadura = tipoArmadura;
        calcularClasseArmadura();
    }

    public void calcularClasseArmadura() {
        this.classeArmadura = this.baseClasseArmadura;
        this.classeArmadura += this.tipoArmadura.calcularModificadorClasseArmadura();
        if (this.escudo) {
            this.classeArmadura += Integer.valueOf(2);
        }
    }

    public void empunharEscudo() {
        this.escudo = true;
        calcularClasseArmadura();
    }

    public void removerEscudo() {
        this.escudo = false;
        calcularClasseArmadura();
    }

    public String getNome() {
        return nome;
    }

    public Integer getClasseArmadura() {
        return classeArmadura;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getForca() {
        return forca;
    }

    public boolean isDiminuiFurtividade() {
        return diminuiFurtividade;
    }

    public Double getPeso() {
        return peso;
    }

    public TipoArmadura getTipoArmadura() {
        return tipoArmadura;
    }

    public Boolean getEscudo() {
        return escudo;
    }

    public Integer getModificadorDestreza() {
        return modificadorDestreza;
    }

    public Integer getBaseClasseArmadura() {
        return baseClasseArmadura;
    }

    @Override
    public String toString() {
        return nome + " [CA: " + classeArmadura + "] " + (escudo ? "" : "Não ") + "Portando escudo";
    }

}
