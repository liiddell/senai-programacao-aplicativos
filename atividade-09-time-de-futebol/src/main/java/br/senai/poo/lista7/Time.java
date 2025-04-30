package br.senai.poo.lista7;

import java.util.ArrayList;

public class Time {

    private String nome, nomeTecnico;

    // Lista de jogadores contratados (pertencem ao time)
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    // Lista de jogadores escalados (já estão como TITULAR ou RESERVA)
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
        Jogador jogador = new Jogador(nome, numeroCamisa);  // Cria um novo objeto Jogador
        jogadores.add(jogador);                             // Adiciona o jogador à lista de contratados
    }

    public boolean escalarJogador(String nomeJogador, SituacaoEscalacaoEnum situacaoEscalacao) {
        Jogador jogador = encontrarJogador(nomeJogador);// Procura o jogador pelo nome

        if (jogador == null) {
            return false;                                   // Jogador não pertence ao time
        }
        if (jogador.getSituacaoEscalacao() != null) {
            return false;                                   // Já está escalado
        }
        if (calcularQtdJogadores(situacaoEscalacao) >= situacaoEscalacao.getQuantidadeMaxima()) {
            return false;                                   // Limite atingido
        }


        jogador.setSituacaoEscalacao(situacaoEscalacao);    // Define a situação (TITULAR/RESERVA)
        jogadoresEscalados.add(jogador);                    // Adiciona na lista de escalados
        return true;                                        // Escalado com sucesso

    }

    // Metodo auxiliar para encontrar um jogador contratado pelo nome
    private Jogador encontrarJogador(String nomeJogador) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nomeJogador)) {
                return jogador;
            }
        }
        return null;
    }

    // Conta quantos jogadores já foram escalados como TITULAR ou RESERVA
    private Integer calcularQtdJogadores(SituacaoEscalacaoEnum situacaoEscalacao) {
        Integer qtd = 0;
        for (Jogador jogador : jogadoresEscalados) {
            if (situacaoEscalacao.equals(jogador.getSituacaoEscalacao())) {
                qtd++;
            }
        }
        return qtd;
    }


    // Remove jogador da lista de escalados, se estiver escalado
    public void removerJogadorEscalacao(String nome) {
        Jogador jogador = encontrarJogador(nome);
        if (jogador != null) {
            jogador.setSituacaoEscalacao(null); // Reseta a situação
            jogadoresEscalados.remove(jogador); // Remove da lista de escalados
        }
    }

    public void obterEscalacao() {

        //System.out.println("===================== ESCALADES ====================");
        for (Jogador jogador : jogadoresEscalados) {
            System.out.println(jogador);
        }

    }


}
