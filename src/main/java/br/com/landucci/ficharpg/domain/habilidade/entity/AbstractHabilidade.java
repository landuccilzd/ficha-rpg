package br.com.landucci.ficharpg.domain.habilidade.entity;

public class AbstractHabilidade implements IHabilidade {

    protected final String nome;
    protected Integer valor = 0;
    protected Integer modificador = 0;

    public AbstractHabilidade(String nome) {
        this.nome = nome;
    }

    @Override
    public void alterarAtributo(Integer valor) {
        this.valor = valor;
        this.modificador = calcularModificador();
    }

    @Override
    public void aumentarAtributo(Integer valor) {
        this.valor += valor;
        this.modificador = calcularModificador();
    }

    @Override
    public Integer getValor() {
        return this.valor;
    }

    @Override
    public Integer getModificador() {
        return modificador;
    }

    public Integer calcularModificador() {
        switch (this.valor) {
            case 1: {
                return Integer.valueOf(-5);
            } case 2, 3: {
                return Integer.valueOf(-4);
            } case 4, 5: {
                return Integer.valueOf(-3);
            } case 6, 7: {
                return Integer.valueOf(-2);
            } case 8, 9: {
                return Integer.valueOf(-1);
            } case 12, 13: {
                return Integer.valueOf(1);
            } case 14, 15: {
                return Integer.valueOf(2);
            } case 16, 17: {
                return Integer.valueOf(3);
            } case 18, 19: {
                return Integer.valueOf(4);
            } case 20, 21: {
                return Integer.valueOf(5);
            } case 22, 23: {
                return Integer.valueOf(6);
            } case 24, 25: {
                return Integer.valueOf(7);
            } case 26, 27: {
                return Integer.valueOf(8);
            } case 28, 29: {
                return Integer.valueOf(9);
            } case 30: {
                return Integer.valueOf(10);
            } default:
                return Integer.valueOf(0);
        }
    }

    @Override
    public String toString() {
        return nome + " - " + valor + " [" + modificador + "]";
    }
}
