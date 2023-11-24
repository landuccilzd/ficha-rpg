package br.com.landucci.ficharpg.domain.personagem.valueobject;

public class Riqueza {

    private Integer pecasCobre = 0;
    private Integer pecasPrata = 0;
    private Integer pecasElectro = 0;
    private Integer pecasOuro = 0;
    private Integer pecasPlatina = 0;

    public void adicionarPecasCobre(Integer quantidade) {
        this.pecasCobre += quantidade;
    }
    public void removerPecasCobre(Integer quantidade) {
        this.pecasCobre -= quantidade;
    }

    public void adicionarPecasPrata(Integer quantidade) {
        this.pecasPrata += quantidade;
    }
    public void removerPecasPrata(Integer quantidade) {
        this.pecasPrata -= quantidade;
    }

    public void adicionarPecasElectro(Integer quantidade) {
        this.pecasElectro += quantidade;
    }
    public void removerPecasElectro(Integer quantidade) {
        this.pecasElectro -= quantidade;
    }

    public void adicionarPecasOuro(Integer quantidade) {
        this.pecasOuro += quantidade;
    }
    public void removerPecasOuro(Integer quantidade) {
        this.pecasOuro -= quantidade;
    }

    public void adicionarPecasPlatina(Integer quantidade) {
        this.pecasPlatina += quantidade;
    }
    public void removerPecasPlatina(Integer quantidade) {
        this.pecasPlatina -= quantidade;
    }

    public Integer getPecasCobre() {
        return pecasCobre;
    }
    public Integer getPecasPrata() {
        return pecasPrata;
    }
    public Integer getPecasElectro() {
        return pecasElectro;
    }
    public Integer getPecasOuro() {
        return pecasOuro;
    }
    public Integer getPecasPlatina() {
        return pecasPlatina;
    }

}