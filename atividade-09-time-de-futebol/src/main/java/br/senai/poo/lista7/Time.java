package br.senai.poo.lista7;

import java.util.ArrayList;

public class Time {

    private String nome, nomeTecnico;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    private ArrayList<Jogador> jogadoresEscalados = new ArrayList<Jogador>();

    public Time() {

    }

    public Time(String nome, String nomeTecninco) {
        setNome(nome);
        setNomeTecninco(nomeTecninco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeTecninco() {
        return nomeTecnico;
    }

    public void setNomeTecninco(String nomeTecninco) {
        this.nomeTecnico = nomeTecninco;
    }

    // Métodos

    public void contratarJogador(String nome, Integer numeroCamisa) {
        Jogador jogador = new Jogador(nome, numeroCamisa);
        jogadores.add(jogador);
    }

    public boolean escalarJogador(String nomeJogador, SituacaoEscalacaoEnum situacaoEscalacao) {
        Jogador jogador = encontrarJogador(nomeJogador);
        if (jogador == null) {
            return false;
        }
        if (jogador.getSituacaoEscalacao() != null) {
            return false;
        }
        if (calcularQtdJogadores(situacaoEscalacao) >= situacaoEscalacao.getQuantidadeMaxima()) {
            return false;
        }
        jogador.setSituacaoEscalacao(situacaoEscalacao);
        jogadoresEscalados.add(jogador);
        return true;

    }

    private Jogador encontrarJogador(String nomeJogador) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nomeJogador)) {
                return jogador;
            }
        }
        return null;
    }

    private Integer calcularQtdJogadores(SituacaoEscalacaoEnum situacaoEscalacao) {
        Integer qtd = 0;
        for (Jogador jogador : jogadoresEscalados) {
            if (situacaoEscalacao.equals(jogador.getSituacaoEscalacao())) {
                qtd++;
            }
        }
        return qtd;
    }


    public void removerJogadorEscalacao(String nome) {
        Jogador jogador = encontrarJogador(nome) ;
        if(jogador != null){
            jogador.setSituacaoEscalacao(null);
            jogadoresEscalados.remove(jogador);
        }
    }

    public void obterEscalacao() {

        System.out.println("===================== ESCALADES ====================");
        for(Jogador jogador : jogadoresEscalados){
            System.out.println(jogador);
        }

    }


}
