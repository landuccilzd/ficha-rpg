package br.com.landucci.ficharpg.domain.personagem.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.landucci.ficharpg.domain.armadura.entity.Armadura;
import br.com.landucci.ficharpg.domain.classe.entity.IClasse;
import br.com.landucci.ficharpg.domain.habilidade.entity.Carisma;
import br.com.landucci.ficharpg.domain.habilidade.entity.Constituicao;
import br.com.landucci.ficharpg.domain.habilidade.entity.Destreza;
import br.com.landucci.ficharpg.domain.habilidade.entity.Forca;
import br.com.landucci.ficharpg.domain.habilidade.entity.IHabilidade;
import br.com.landucci.ficharpg.domain.habilidade.entity.Inteligencia;
import br.com.landucci.ficharpg.domain.habilidade.entity.Sabedoria;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Idioma;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Nivel;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Riqueza;
import br.com.landucci.ficharpg.domain.personagem.valueobject.TendenciaMoral;
import br.com.landucci.ficharpg.domain.personagem.valueobject.TendenciaOrdem;
import br.com.landucci.ficharpg.domain.raca.IRaca;

public class Personagem implements Serializable {

	@Serial
    private static final long serialVersionUID = -2410949597459193969L;
	
	private final String nomePersonagem;
    private final String nomeJogador;
    private final Integer idade;
    private final Double altura;
    private final Double peso;
    private final String olhos;
    private final String pele;
    private final String cabelo;
    private TendenciaOrdem tendenciaOrdem;
    private TendenciaMoral tendenciaMoral;
    private String[] tracosPersonalidade;
    private String ideais;
    private String ligacoes;
    private String defeitos;
    private String aparencia;
    private String historia;
    
    private IRaca raca = null;
    private final List<IClasse> classes = new ArrayList<>();
    
    private Integer experiencia = 0;
    private final Nivel nivel;
    private final IHabilidade forca;
    private final IHabilidade destreza;
    private final IHabilidade constituicao;
    private final IHabilidade inteligencia;
    private final IHabilidade sabedoria;
    private final IHabilidade carisma;
    private Integer inspiracao = 0;
    private Integer sabedoriaPassiva = 0;
    private Integer classeArmadura = 0;
    private Integer iniciativa = 0;
    private Double deslocamento = 0D;
    private Integer pvTotal = 0;
    private Integer pvAtual = 0;
    private Integer pvTemporario = 0;
    private Integer dvTotal = 0;
    private Integer dvAtual = 0;
    private final Riqueza riqueza = new Riqueza();
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
    		String olhos, String pele, String cabelo, IRaca raca, TendenciaOrdem tendenciaOrdem, TendenciaMoral tendenciaMoral,
    		IClasse classe) {
        this.nomeJogador = nomeJogador;        
        this.nomePersonagem = nomePersonagem;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.olhos = olhos;
        this.pele = pele;
        this.cabelo = cabelo;
        this.pvTotal = 0;
        this.nivel = new Nivel(this.experiencia);
        this.forca = new Forca();
        this.destreza = new Destreza();
        this.constituicao = new Constituicao();
        this.inteligencia = new Inteligencia();
        this.sabedoria = new Sabedoria();
        this.carisma = new Carisma();
        this.tendenciaOrdem = tendenciaOrdem;
        this.tendenciaMoral = tendenciaMoral;
        this.raca = raca;
        this.adicionarClass(classe);
    }

    public void inicializar() {
    	this.sabedoriaPassiva = 10 + this.sabedoria.getModificador();
    	//TODO: Implementar +2 se tiver proficiencia em Percepcao
    	
        this.raca.inicializarRaca(this);
        this.classes.forEach(classe -> {
        	classe.inicializarClasse(this);
        });
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

    public void adicionarClass(IClasse classe) {
        if (this.classes.contains(classe)) {
            throw new RuntimeException("Esse personagem ja possui essa classe");
        }
        this.classes.add(classe);
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

    public void alterarPvTotal(Integer qtde) {
        if (qtde <= 0) {
            throw new RuntimeException("Informe a quantidade de PV a ser aumentada.");
        }
    	this.pvTotal = qtde;
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

    public TendenciaOrdem getTendenciaOrdem() {
		return tendenciaOrdem;
	}

	public TendenciaMoral getTendenciaMoral() {
		return tendenciaMoral;
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

    public List<IClasse> getClasses() {
        return classes;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public IHabilidade getForca() {
        return forca;
    }

    public IHabilidade getDestreza() {
        return destreza;
    }

    public IHabilidade getConstituicao() {
        return constituicao;
    }

    public IHabilidade getInteligencia() {
        return inteligencia;
    }

    public IHabilidade getSabedoria() {
        return sabedoria;
    }

    public IHabilidade getCarisma() {
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

    public Riqueza getRiqueza() {
        return riqueza;
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
		return nomePersonagem + " é um(a) <Raça>/<Classe> de " + idade + " anos, " + altura + "m de altura e " + peso + "kg. Tem a pele " + pele + ", olhos " + olhos + " e cabelos " + cabelo;
    }

}