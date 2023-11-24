package br.com.landucci.ficharpg.domain.habilidade.entity;

public interface IHabilidade {

    void alterarAtributo(Integer valor);
    void aumentarAtributo(Integer valor);
    Integer getValor();
    Integer getModificador();
    Integer calcularModificador();
}