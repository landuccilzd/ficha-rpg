package br.com.landucci.ficharpg.domain.personagem.entity;

import br.com.landucci.ficharpg.domain.armadura.entity.Armadura;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Atributo;
import br.com.landucci.ficharpg.domain.personagem.valueobject.Nivel;

public class Personagem {

    private Long id;
    private String nomePersonagem;
    private String nomeJogador;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String olhos;
    private String pele;
    private String cabelo;
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
    private Integer deslocamento; // Raça
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

    public Personagem(String nomeJogador, String nomePersonagem, Integer idade, Double altura, Double peso, String olhos, String pele, String cabelo) {
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
    }

    public void evoluir() {
        this.experiencia += 1;
        //TODO: Implementar
    }

    public void alterarForca(Integer forca) {
        this.forca.alterarAtributo(forca);
    }

    public void alterarDestreza(Integer destreza) {
        this.destreza.alterarAtributo(destreza);
        this.iniciativa = this.destreza.getModificador();
    }    

    public void alterarConstituicao(Integer constituicao) {
        this.constituicao.alterarAtributo(constituicao);
    }    

    public void alterarInteligencia(Integer inteligencia) {
        this.inteligencia.alterarAtributo(inteligencia);
    }    

    public void alterarSabedoria(Integer sabedoria) {
        this.sabedoria.alterarAtributo(sabedoria);
    }    

    public void alterarCarisma(Integer carisma) {
        this.carisma.alterarAtributo(carisma);
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

    public void ferir(Integer qtde) {
        if (qtde <= 0) {
            throw new RuntimeException("Informe a quantidade de PV a ser removida.");
        }
        this.pvAtual -= qtde;
    }
    
    public void curar(Integer qtde) {
        if (qtde <= 0) {
            throw new RuntimeException("Informe a quantidade de PV a ser adicionada.");
        }
        this.pvAtual += qtde;
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

    public Long getId() {
        return id;
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

    public Integer getDeslocamento() {
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
        return this.armaduraVestida;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personagem other = (Personagem) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nomePersonagem + " é uma <Raça>/<Classe> de " + idade + " anos, " + altura + "m de altura e " + peso + "kg. Tem a pele " + pele + ", olhos " + olhos + " e cabelos " + cabelo;
    }

    
}

