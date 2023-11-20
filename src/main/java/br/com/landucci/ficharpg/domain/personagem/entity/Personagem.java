package br.com.landucci.ficharpg.domain.personagem.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.landucci.ficharpg.domain.armadura.entity.Armadura;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Atributo;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Nivel;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class Personagem implements Serializable {

	private static final long serialVersionUID = -2410949597459193969L;
	
	private String nomePersonagem;
    private String nomeJogador;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String olhos;
    private String pele;
    private String cabelo;
    private String[] tendencia;
    private String[] tracosPersonalidade;
    private String ideais;
    private String ligacoes;
    private String defeitos;
    private String aparencia;
    private String historia;
    
    private IRaca raca = null;
    
    private Nivel nivel;
    private Integer experiencia;
    private Atributo forca;
    private Atributo destreza;
    private Atributo constituicao;
    private Atributo inteligencia;
    private Atributo sabedoria;
    private Atributo carisma;
    private Integer inspiracao;
    private Integer sabedoriaPassiva;
    private Integer classeArmadura;
    private Integer iniciativa;
    private Double deslocamento;
    private Integer pvTotal; // Classe
    private Integer pvAtual;
    private Integer pvTemporario;
    private Integer dvTotal;
    private Integer dvAtual;
    private Integer pontosCobre; //Classe
    private Integer pontosPrata;
    private Integer pontosElectro;
    private Integer pontosOuro;
    private Integer pontosPlatina;
    private Armadura armaduraVestida;
    
    private List<Idioma> idiomas = new ArrayList<Idioma>();
//    private List proficiencias;
//    private List pericias;
//    private List testesResistencia;
//    private List ataques;
//    private List equipamentos;
//    private List caractaristicas;
//    private List habilidades;
//    private List aliados;
//    private List organizacoes;
//    private List tesouro;
//    private List truques;
//    private List magias;

    public Personagem(String nomeJogador, String nomePersonagem, Integer idade, Double altura, Double peso,
    		String olhos, String pele, String cabelo, IRaca raca) {
        this.nomeJogador = nomeJogador;        
        this.nomePersonagem = nomePersonagem;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.olhos = olhos;
        this.pele = pele;
        this.cabelo = cabelo;
        this.experiencia = 0;
        this.nivel = new Nivel(this.experiencia);
        this.forca = new Atributo(0);
        this.destreza = new Atributo(0);
        this.constituicao = new Atributo(0);
        this.inteligencia = new Atributo(0);
        this.sabedoria = new Atributo(0);
        this.carisma = new Atributo(0);
        this.pvTotal = 0;

        this.raca = raca;
        this.raca.inicializarRaca(this);
    }

    public void evoluir() {
        this.experiencia += 1;
        //TODO: Implementar
    }
    
    public void alterarForca(Integer forca) {
        this.forca.alterarAtributo(forca);
    }
    
    public void aumentarForca(Integer forca) {
        this.forca.aumentarAtributo(forca);
    }    

    public void alterarDestreza(Integer destreza) {
        this.destreza.alterarAtributo(destreza);
        this.iniciativa = this.destreza.getModificador();
    }

    public void aumentarDestreza(Integer destreza) {
        this.destreza.aumentarAtributo(destreza);
        this.iniciativa = this.destreza.getModificador();
    }    

    public void alterarConstituicao(Integer constituicao) {
        this.constituicao.alterarAtributo(constituicao);
    }

    public void aumentarConstituicao(Integer constituicao) {
        this.constituicao.aumentarAtributo(constituicao);
    }     

    public void alterarInteligencia(Integer inteligencia) {
        this.inteligencia.alterarAtributo(inteligencia);
    }

    public void aumentarInteligencia(Integer inteligencia) {
        this.inteligencia.aumentarAtributo(inteligencia);
    }    

    public void alterarSabedoria(Integer sabedoria) {
        this.sabedoria.alterarAtributo(sabedoria);
    }    

    public void aumentarSabedoria(Integer sabedoria) {
        this.sabedoria.aumentarAtributo(sabedoria);
    }    

    public void alterarCarisma(Integer carisma) {
        this.carisma.alterarAtributo(carisma);
    }    

    public void aumentarCarisma(Integer carisma) {
        this.carisma.aumentarAtributo(carisma);
    }    

    public void definirTendencia(String[] tendencia) {
    	this.tendencia = tendencia;
    }
    
    public void alterarInspiracao(Integer inspiracao) {
        this.inspiracao = inspiracao;
    }

    /**
     * Percepção Passiva: 10 + bônus de proficiência (caso seja proficiente em Percepção) + modificador de Sabedoria
     */
    public void alterarSabedoriaPassiva() {        
        this.sabedoriaPassiva = 10;
//        if (this.) {
//            this.sabedoriaPassiva += this.nivel.getBonusProficiencia();
//        }
        this.sabedoriaPassiva += this.sabedoria.getModificador();
    }
    
    public void alterarDeslocamento(Double deslocamento) {
    	this.deslocamento = deslocamento;
    }
    
    public void aumentarPvTotal(Integer qtde) {
        if (qtde <= 0) {
            throw new RuntimeException("Informe a quantidade de PV a ser aumentada.");
        }
    	this.pvTotal += qtde;
    }

    public void removerPvTotal(Integer qtde) {
        if (qtde <= 0) {
            throw new RuntimeException("Informe a quantidade de PV a ser removida.");
        }
        this.pvAtual -= qtde;
    }

    public void adicionarPvTemporario(Integer qtde) {
        if (qtde <= 0) {
            throw new RuntimeException("Informe a quantidade de PV temporário a ser adicionada.");
        }
        this.pvTemporario += qtde;
    }

    public void removerPvTemporario(Integer qtde) {
        if (qtde <= 0) {
            throw new RuntimeException("Informe a quantidade de PV temporário a ser removida.");
        }
        this.pvTemporario += qtde;
    }

    public void vestirArmadura(Armadura armadura) {
        this.armaduraVestida = armadura;
    }

    public void removerArmadura(Armadura armadura) {
        this.armaduraVestida = null;
    }
    
    public void alterarTracosPersonalidade(String[] tracosPersonalidade) {
    	this.tracosPersonalidade = tracosPersonalidade;
    }
    
    public void alterarIdeais(String ideais) {
    	this.ideais = ideais;
    }
    
    public void alterarLigacoes(String ligacoes) {
    	this.ligacoes = ligacoes;
    }
    
    public void alterarDefeitos(String defeitos) {
    	this.defeitos = defeitos;
    }
    
    public void alterarAparencia(String aparencia) {
    	this.aparencia = aparencia;
    }
    
    public void alterarHistoria(String historia) {
    	this.historia = historia;
    }

    public void adicionarIdioma(Idioma idioma) {
    	if (this.idiomas.contains(idioma)) {
    		throw new RuntimeException(String.format("O personagem %nome, ja fala o idioma, %idioma!",
    				this.nomePersonagem, idioma.getNome()));
    	}
    	this.idiomas.add(idioma);
    }
    
	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public Integer getIdade() {
		return idade;
	}

	public Double getAltura() {
		return altura;
	}

	public Double getPeso() {
		return peso;
	}

	public String getOlhos() {
		return olhos;
	}

	public String getPele() {
		return pele;
	}

	public String getCabelo() {
		return cabelo;
	}

	public String[] getTendencia() {
		return tendencia;
	}

	public String[] getTracosPersonalidade() {
		return tracosPersonalidade;
	}

	public String getIdeais() {
		return ideais;
	}

	public String getLigacoes() {
		return ligacoes;
	}

	public String getDefeitos() {
		return defeitos;
	}

	public String getAparencia() {
		return aparencia;
	}

	public String getHistoria() {
		return historia;
	}

	public IRaca getRaca() {
		return raca;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public Integer getExperiencia() {
		return experiencia;
	}

	public Atributo getForca() {
		return forca;
	}

	public Atributo getDestreza() {
		return destreza;
	}

	public Atributo getConstituicao() {
		return constituicao;
	}

	public Atributo getInteligencia() {
		return inteligencia;
	}

	public Atributo getSabedoria() {
		return sabedoria;
	}

	public Atributo getCarisma() {
		return carisma;
	}

	public Integer getInspiracao() {
		return inspiracao;
	}

	public Integer getSabedoriaPassiva() {
		return sabedoriaPassiva;
	}

	public Integer getClasseArmadura() {
		return classeArmadura;
	}

	public Integer getIniciativa() {
		return iniciativa;
	}

	public Double getDeslocamento() {
		return deslocamento;
	}

	public Integer getPvTotal() {
		return pvTotal;
	}

	public Integer getPvAtual() {
		return pvAtual;
	}

	public Integer getPvTemporario() {
		return pvTemporario;
	}

	public Integer getDvTotal() {
		return dvTotal;
	}

	public Integer getDvAtual() {
		return dvAtual;
	}

	public Integer getPontosCobre() {
		return pontosCobre;
	}

	public Integer getPontosPrata() {
		return pontosPrata;
	}

	public Integer getPontosElectro() {
		return pontosElectro;
	}

	public Integer getPontosOuro() {
		return pontosOuro;
	}

	public Integer getPontosPlatina() {
		return pontosPlatina;
	}

	public Armadura getArmaduraVestida() {
		return armaduraVestida;
	}

    public List<Idioma> getIdiomas() {
		return idiomas;
	}

    public String toJSON() {
    	ObjectMapper mapper = new ObjectMapper();
    	mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        
    	try {
    	    return mapper.writeValueAsString(this);
    	} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	
    	return "";
    }
    
	@Override
    public String toString() {
		return nomePersonagem + " é uma <Raça>/<Classe> de " + idade + " anos, " + altura + "m de altura e " + peso + "kg. Tem a pele " + pele + ", olhos " + olhos + " e cabelos " + cabelo;
    }

    
}

