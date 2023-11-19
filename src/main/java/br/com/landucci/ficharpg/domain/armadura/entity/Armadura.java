package br.com.landucci.ficharpg.domain.armadura.entity;

import br.com.landucci.ficharpg.domain.armadura.valueobject.TipoArmadura;

public class Armadura {

    private Long id;
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

    public Armadura(Long id, String nome, Double preco, Integer baseClasseArmadura, Integer forca, boolean diminuiFurtividade, 
            Double peso, TipoArmadura tipoArmadura) {
        this.id = id;
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

    public Long getId() {
        return this.id;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Armadura other = (Armadura) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nome + " [CA: " + classeArmadura + "] " + (escudo ? "" : "Não ") + "Portando escudo";
    }

}
