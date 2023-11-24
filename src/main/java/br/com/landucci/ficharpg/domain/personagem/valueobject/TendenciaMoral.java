package br.com.landucci.ficharpg.domain.personagem.valueobject;

public enum TendenciaMoral {
	BOM ("Bom"),
	NEUTRO ("Nêutro"),
	MAU ("Mau");
	
	private String descricao;

	private TendenciaMoral(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
