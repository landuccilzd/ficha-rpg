package br.com.landucci.ficharpg.domain.personagem.factory;

import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;

public class PersonagemFactory {
    
    public static Personagem create(String nomeJogador, String nomePersonagem, Integer idade, Double altura, Double peso, String olhos, String pele, String cabelo) {
        var personagem = new Personagem(nomeJogador, nomePersonagem, idade, altura, peso, olhos, pele, cabelo);
        personagem.alterarForca(10);
        personagem.alterarDestreza(18);
        personagem.alterarConstituicao(13);
        personagem.alterarInteligencia(11);
        personagem.alterarSabedoria(13);
        personagem.alterarCarisma(10);
        return personagem;
    }
}
