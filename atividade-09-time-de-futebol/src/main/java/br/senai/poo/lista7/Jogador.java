package br.senai.poo.lista7;

public class Jogador {
    private String nome;
    private Integer numCamisa;
    SituacaoEscalacaoEnum situacaoEscalacao;

    public Jogador(){}

    public Jogador(String nome, Integer numCamisa) {
        setNome(nome);
        setNumCamisa(numCamisa);
        this.situacaoEscalacao = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(Integer numCamisa) {
        this.numCamisa = numCamisa;
    }

    public SituacaoEscalacaoEnum getSituacaoEscalacao() {
        return situacaoEscalacao;
    }

    public void setSituacaoEscalacao(SituacaoEscalacaoEnum situacaoEscalacao) {
        this.situacaoEscalacao = situacaoEscalacao;
    }

    @Override
    public String toString() {
        return
                "Nome jogador: " + this.nome+ "\nCamisa: " + this.numCamisa + "\nSituação: " + this.situacaoEscalacao;
    }
}
