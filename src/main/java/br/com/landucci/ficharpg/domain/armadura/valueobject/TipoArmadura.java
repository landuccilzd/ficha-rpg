package br.com.landucci.ficharpg.domain.armadura.valueobject;

public abstract class TipoArmadura {

    protected String nome;
    protected Integer tempoVestir;
    protected Integer tempoRemover;
    protected Integer modificadorDestreza;

    public TipoArmadura(String nome, Integer tempoVestir, Integer tempoRemover, Integer modificadorDestreza) {
        this.nome = nome;
        this.tempoVestir = tempoVestir;
        this.tempoRemover = tempoRemover;
        this.modificadorDestreza = modificadorDestreza;
    }

    public abstract Integer calcularModificadorClasseArmadura();

    public String getNome() {
        return nome;
    }

    public Integer getTempoVestir() {
        return tempoVestir;
    }

    public Integer getTempoRemover() {
        return tempoRemover;
    }

    public Integer getModificadorDestreza() {
        return modificadorDestreza;
    }
}