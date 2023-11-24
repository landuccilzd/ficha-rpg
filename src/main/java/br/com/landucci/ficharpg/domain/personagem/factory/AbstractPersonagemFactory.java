package br.com.landucci.ficharpg.domain.personagem.factory;

import java.util.Random;

import br.com.landucci.ficharpg.domain.classe.entity.Barbaro;
import br.com.landucci.ficharpg.domain.classe.entity.Bardo;
import br.com.landucci.ficharpg.domain.classe.entity.Bruxo;
import br.com.landucci.ficharpg.domain.classe.entity.Clerigo;
import br.com.landucci.ficharpg.domain.classe.entity.Druida;
import br.com.landucci.ficharpg.domain.classe.entity.Feiticeiro;
import br.com.landucci.ficharpg.domain.classe.entity.IClasse;
import br.com.landucci.ficharpg.domain.classe.entity.Ladino;
import br.com.landucci.ficharpg.domain.classe.entity.Mago;
import br.com.landucci.ficharpg.domain.classe.entity.Monge;
import br.com.landucci.ficharpg.domain.classe.entity.Paladino;
import br.com.landucci.ficharpg.domain.classe.entity.Patrulheiro;
import br.com.landucci.ficharpg.domain.personagem.entity.Personagem;
import br.com.landucci.ficharpg.domain.personagem.valueobject.TendenciaMoral;
import br.com.landucci.ficharpg.domain.personagem.valueobject.TendenciaOrdem;
import br.com.landucci.ficharpg.domain.raca.IRaca;
import br.com.landucci.ficharpg.domain.raca.elfo.entity.AltoElfo;

public abstract class AbstractPersonagemFactory {
	
	protected static final Random random = new Random();
	
	protected static final IClasse[] CLASSES = new IClasse[] {
			new Barbaro(),
			new Bardo(),
			new Bruxo(),
			new Clerigo(),
			new Druida(),
			new Feiticeiro(),
//			new Guerreiro(),
			new Ladino(),
			new Mago(),
			new Monge(),
			new Paladino(),
			new Patrulheiro()
	};

	private static final String[] NOMES_JOGADORES = new String[] { 
			"Cris", "Flabão", "Lara", "Natalina", "Samuca"
	};

	protected static final String[] OLHOS = new String[] {
			"Azuis", "Verdes", "Castanhos", "Pretos"
	};	

	protected static final String[] PELES = new String[] {
			"Branca", "Negra", "Parda", "Morena"
	};	

	private static final String[] CABELOS = new String[] {
			"Loiro", "Preto", "Castanho", "Ruivo", "Branco", "Prateado", "Roxo", "Verde", "Azul", "Rosa"
	};

	private static final TendenciaOrdem[] TENDENCIAS_ORDEM = new TendenciaOrdem[] {
			TendenciaOrdem.CAOTICO, TendenciaOrdem.NEUTRO, TendenciaOrdem.LEAL 
	};

	private static final TendenciaMoral[] TENDENCIAS_MORAL = new TendenciaMoral[] {
			TendenciaMoral.BOM, TendenciaMoral.NEUTRO, TendenciaMoral.MAU 
	};
	
    public Personagem create(String nomeJogador, String nomePersonagem, Integer idade, Double altura, Double peso, String olhos, String pele, String cabelo) {
    	var raca = new AltoElfo();
        var personagem = new Personagem(nomeJogador, nomePersonagem, idade, altura, peso, olhos, pele, cabelo, raca, 
        		TendenciaOrdem.CAOTICO, TendenciaMoral.NEUTRO, new Ladino());
        personagem.alterarAparencia("Mellian Tallan é uma alta elfa com cabelos longos e prateados que caem em cascata pelas costas. Seus olhos são de um azul profundo e brilhante, e ela tem uma cicatriz em forma de estrela no lado direito do rosto. Ela é magra e ágil, com uma postura confiante e um sorriso astuto.");

        StringBuilder sbHistoria = new StringBuilder();
        sbHistoria.append("Mellian Tannal cresceu nas ruas de uma cidade grande, onde aprendeu a sobreviver por conta própria. Ela se envolveu em atividades criminosas desde cedo, roubando para sobreviver. Com o tempo, ela se tornou uma ladra habilidosa e astuta, capaz de entrar e sair de lugares sem ser detectada. Ela se juntou a um grupo de ladrões, mas logo se cansou de seguir as ordens de outros. Decidiu seguir seu próprio caminho e se tornar uma aventureira, usando suas habilidades para ganhar dinheiro e fama.\r\n");
        sbHistoria.append("Mellian é uma ladina caótica neutra, o que significa que ela segue suas próprias regras e não se importa muito com a lei. Ela é uma pessoa independente e não gosta de ser controlada por ninguém. Ela é leal apenas a si mesma e a seus amigos mais próximos. Ela é uma pessoa inteligente e astuta, capaz de pensar rapidamente em situações difíceis. Ela é uma excelente ladra e pode desarmar armadilhas e abrir fechaduras com facilidade.");
        personagem.alterarHistoria(sbHistoria.toString());
        personagem.alterarTracosPersonalidade(new String[] { "Extremamente receosa em confiar em pessoas", "Sempre tem um plano B" });
        personagem.alterarIdeais("Liberadade. Correntes foram feitas para serem quebradas");
        personagem.alterarLigacoes("Se tornou a maior ladra de todos os tempos");
        personagem.alterarDefeitos("Um inocente foi preso por causa de um crise que cometeu. Para ela está tudo bem.");
        personagem.alterarForca(10);
        personagem.alterarDestreza(18);
        personagem.alterarConstituicao(13);
        personagem.alterarInteligencia(11);
        personagem.alterarSabedoria(13);
        personagem.alterarCarisma(10);
        personagem.getRiqueza().adicionarPecasOuro(90);
        personagem.inicializar();
        return personagem;
    }
    
    public Personagem randomize() {
        var genero = random.nextInt(1, 3);
        var nomeJogador = gerarNomeJogador();
        var nome = ((genero == 1) ? gerarNomeFeminino() : gerarNomeMasculino()) + " " + gerarSobrenome();
        var idade = random.nextInt(100, 500);
        var altura = random.nextDouble(1.5, 1.8);
        var peso = random.nextDouble(50, 90);
        var olhos = gerarOlhos();
        var pele = gerarPele();
        var cabelo = gerarCabelo();
        var raca = gerarRaca();
        var tendenciaOrdem = gerarTendenciaOrdem();
        var tendenciaMoral = gerarTendenciaMoral();
        var classe = gerarClasse();
        
    	var personagem = new Personagem(nomeJogador, nome, idade, altura, peso, olhos, pele, cabelo, raca, tendenciaOrdem, tendenciaMoral, classe);
    	
//        personagem.alterarAparencia("Mellian Tallan é uma alta elfa com cabelos longos e prateados que caem em cascata pelas costas. Seus olhos são de um azul profundo e brilhante, e ela tem uma cicatriz em forma de estrela no lado direito do rosto. Ela é magra e ágil, com uma postura confiante e um sorriso astuto.");
//        StringBuilder sbHistoria = new StringBuilder();
//        sbHistoria.append("Mellian Tannal cresceu nas ruas de uma cidade grande, onde aprendeu a sobreviver por conta própria. Ela se envolveu em atividades criminosas desde cedo, roubando para sobreviver. Com o tempo, ela se tornou uma ladra habilidosa e astuta, capaz de entrar e sair de lugares sem ser detectada. Ela se juntou a um grupo de ladrões, mas logo se cansou de seguir as ordens de outros. Decidiu seguir seu próprio caminho e se tornar uma aventureira, usando suas habilidades para ganhar dinheiro e fama.\r\n");
//        sbHistoria.append("Mellian é uma ladina caótica neutra, o que significa que ela segue suas próprias regras e não se importa muito com a lei. Ela é uma pessoa independente e não gosta de ser controlada por ninguém. Ela é leal apenas a si mesma e a seus amigos mais próximos. Ela é uma pessoa inteligente e astuta, capaz de pensar rapidamente em situações difíceis. Ela é uma excelente ladra e pode desarmar armadilhas e abrir fechaduras com facilidade.");
//        personagem.alterarHistoria(sbHistoria.toString());
//        personagem.alterarTracosPersonalidade(new String[] { "Extremamente receosa em confiar em pessoas", "Sempre tem um plano B" });
//        personagem.alterarIdeais("Liberadade. Correntes foram feitas para serem quebradas");
//        personagem.alterarLigacoes("Se tornou a maior ladra de todos os tempos");
//        personagem.alterarDefeitos("Um inocente foi preso por causa de um crise que cometeu. Para ela está tudo bem.");
        
        personagem.alterarForca(jogarDado(6) + jogarDado(6) + jogarDado(6));
        personagem.alterarDestreza(jogarDado(6) + jogarDado(6) + jogarDado(6));
        personagem.alterarConstituicao(jogarDado(6) + jogarDado(6) + jogarDado(6));
        personagem.alterarInteligencia(jogarDado(6) + jogarDado(6) + jogarDado(6));
        personagem.alterarSabedoria(jogarDado(6) + jogarDado(6) + jogarDado(6));
        personagem.alterarCarisma(jogarDado(6) + jogarDado(6) + jogarDado(6));
        personagem.getRiqueza().adicionarPecasOuro(90);
        personagem.inicializar();
    	return personagem;
    }
    

    protected IClasse gerarClasse() {
    	var indice = random.nextInt(CLASSES.length);
    	return CLASSES[indice];
    }

    protected String gerarNomeJogador() {
    	var indice = random.nextInt(NOMES_JOGADORES.length);
    	return NOMES_JOGADORES[indice];
    }

    protected String gerarOlhos() {
    	var indice = random.nextInt(OLHOS.length);
    	return OLHOS[indice];
    }    

    protected String gerarPele() {
    	var indice = random.nextInt(PELES.length);
    	return PELES[indice];
    }    

    protected String gerarCabelo() {
    	var indice = random.nextInt(CABELOS.length);
    	return CABELOS[indice];
    }    

    protected TendenciaOrdem gerarTendenciaOrdem() {
    	var indice = random.nextInt(TENDENCIAS_ORDEM.length);
    	return TENDENCIAS_ORDEM[indice];
    }

    protected TendenciaMoral gerarTendenciaMoral() {
    	var indice = random.nextInt(TENDENCIAS_MORAL.length);
    	return TENDENCIAS_MORAL[indice];
    }
    
    protected final int jogarDado(int qtdeLados) { 
    	return random.nextInt(qtdeLados);
    }

    protected abstract String gerarNomeFeminino();
    protected abstract String gerarNomeMasculino();
    protected abstract String gerarSobrenome();
    protected abstract IRaca gerarRaca();    
}
