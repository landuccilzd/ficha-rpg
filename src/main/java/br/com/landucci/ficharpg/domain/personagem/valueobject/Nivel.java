package br.com.landucci.ficharpg.domain.personagem.valueobject;

public class Nivel {

    private Integer valor = 1;
    private Integer bonusProficiencia = 2;

    public Nivel(Integer experiencia) {
        evoluir(experiencia);
    }

    public Integer getValor() {
        return valor;
    }

    public Integer getBonusProficiencia() {
        return bonusProficiencia;
    }

    public void evoluir(Integer experiencia) {
        if (experiencia < 0) {
            throw new RuntimeException("O valor de experiência não pode ser menos do que 0.");
        }

        if (experiencia <= 300) {
            this.valor = 1;
            this.bonusProficiencia = 2;
        } else if (experiencia > 300 && experiencia <= 900) {
            this.valor = 2;
            this.bonusProficiencia = 2;
        } else if (experiencia > 900 && experiencia <= 2700) {
            this.valor = 3;
            this.bonusProficiencia = 2;
        } else if (experiencia > 2700 && experiencia <= 6500) {
            this.valor = 4;
            this.bonusProficiencia = 2;
        } else if (experiencia > 6500 && experiencia <= 14000) {
            this.valor = 5;
            this.bonusProficiencia = 3;
        } else if (experiencia > 14000 && experiencia <= 23000) {
            this.valor = 6;
            this.bonusProficiencia = 3;
        } else if (experiencia > 23000 && experiencia <= 34000) {
            this.valor = 7;
            this.bonusProficiencia = 3;
        } else if (experiencia > 34000 && experiencia <= 48000) {
            this.valor = 8;
            this.bonusProficiencia = 3;
        } else if (experiencia > 48000 && experiencia <= 64000) {
            this.valor = 9;
            this.bonusProficiencia = 4;
        } else if (experiencia > 64000 && experiencia <= 85000) {
            this.valor = 10;
            this.bonusProficiencia = 4;
        } else if (experiencia > 85000 && experiencia <= 100000) {
            this.valor = 11;
            this.bonusProficiencia = 4;
        } else if (experiencia > 100000 && experiencia <= 120000) {
            this.valor = 12;
            this.bonusProficiencia = 4;
        } else if (experiencia > 120000 && experiencia <= 140000) {
            this.valor = 13;
            this.bonusProficiencia = 5;
        } else if (experiencia > 140000 && experiencia <= 165000) {
            this.valor = 14;
            this.bonusProficiencia = 5;
        } else if (experiencia > 165000 && experiencia <= 195000) {
            this.valor = 15;
            this.bonusProficiencia = 5;
        } else if (experiencia > 195000 && experiencia <= 225000) {
            this.valor = 16;
            this.bonusProficiencia = 5;
        } else if (experiencia > 225000 && experiencia <= 265000) {
            this.valor = 17;
            this.bonusProficiencia = 6;
        } else if (experiencia > 265000 && experiencia <= 305000) {
            this.valor = 18;
            this.bonusProficiencia = 6;
        } else if (experiencia > 305000 && experiencia <= 355000) {
            this.valor = 19;
            this.bonusProficiencia = 6;
        } else if (experiencia >= 355000) {
            this.valor = 20;
            this.bonusProficiencia = 6;            
        }
    }
    
}
