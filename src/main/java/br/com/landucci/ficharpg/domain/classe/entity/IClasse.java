package br.com.landucci.ficharpg.domain.classe.entity;

import java.util.List;

import br.com.landucci.ficharpg.domain.habilidade.entity.IHabilidade;
import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;

public interface IClasse {
	
    String getNome();
    String getDescricao();
    String getDadoVida();
    List<IHabilidade> getHabilidadesPrimarias();
    List<IHabilidade> getProficienciasResistencia();
    void adicionarHabilidadePrimaria(IHabilidade habilidade);
    void adicionarProficienciaResistencia(IHabilidade habilidade);
    void incrementarNivel(Personagem personagem);
    void incrementarNivel(Personagem personagem, Integer qtdePvAumentar);
    void inicializarClasse(Personagem personagem);
}