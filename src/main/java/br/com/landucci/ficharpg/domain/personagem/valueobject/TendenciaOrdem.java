package br.com.landucci.ficharpg.domain.personagem.valueobject;

public enum TendenciaOrdem {
	CAOTICO ("Caótico"),
	NEUTRO ("Nêutro"),
	LEAL ("Leal");
	
	private String descricao;

	private TendenciaOrdem(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}