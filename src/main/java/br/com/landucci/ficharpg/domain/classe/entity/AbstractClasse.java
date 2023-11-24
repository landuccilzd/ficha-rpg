package br.com.landucci.ficharpg.domain.classe.entity;

import java.util.ArrayList;
import java.util.List;

import br.com.landucci.ficharpg.domain.habilidade.entity.IHabilidade;
import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;

public abstract class AbstractClasse implements IClasse {

    protected final String nome;
    protected final String descricao;
    protected final String dadoVida;
    protected final Integer valorDefaultIncrementoPV;
    protected final List<IHabilidade> habilidadesPrimarias = new ArrayList<>();
    protected final List<IHabilidade> proficienciasResistencia = new ArrayList<>();
//    protected final List<TipoArmadura> proficienciasArmaduras = new ArrayList<>();
//    List<Arma> proficienciasHabiliade = new ArrayList<Arma>();

    public AbstractClasse(String nome, String descricao, String dadoVida, Integer valorDefaultIncrementoPV) {
        this.nome = nome;
        this.descricao = descricao;
        this.dadoVida = dadoVida;
        this.valorDefaultIncrementoPV = valorDefaultIncrementoPV;
    }
    
    @Override
    public void adicionarHabilidadePrimaria(IHabilidade habilidade) {
        if (this.habilidadesPrimarias.contains(habilidade)) {
            throw new RuntimeException("Essa classe já tem essa habilidade primária");
        }
        this.habilidadesPrimarias.add(habilidade);
    }

    @Override
    public void adicionarProficienciaResistencia(IHabilidade habilidade) {
        if (this.proficienciasResistencia.contains(habilidade)) {
            throw new RuntimeException("Essa classe já é proficiente em resistência nessa habilidade");
        }
        this.proficienciasResistencia.add(habilidade);
    }

	@Override
	public void inicializarClasse(Personagem personagem) {
		Integer fator = Integer.valueOf(this.dadoVida.substring(1));
		personagem.alterarPvTotal(fator + personagem.getConstituicao().getModificador());
	}

	@Override
	public void incrementarNivel(Personagem personagem) {
		personagem.aumentarPvTotal(this.valorDefaultIncrementoPV + personagem.getConstituicao().getModificador());
	}
	
	@Override
	public void incrementarNivel(Personagem personagem, Integer qtdePvAumentar) {
		personagem.aumentarPvTotal(qtdePvAumentar + personagem.getConstituicao().getModificador());
	}    
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getDadoVida() {
        return dadoVida;
    }
    
	@Override
    public List<IHabilidade> getHabilidadesPrimarias() {
        return habilidadesPrimarias;
    }

    @Override
    public List<IHabilidade> getProficienciasResistencia() { return proficienciasResistencia; }

    @Override
    public String toString() {
        return nome;
    }

}
