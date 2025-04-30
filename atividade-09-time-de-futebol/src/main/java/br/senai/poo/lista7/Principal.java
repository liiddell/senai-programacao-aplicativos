package br.senai.poo.lista7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Time bahia = new Time("Bahia", "Hugostoso");

        String[] nomes = {"Everton", "Jorge", "Joao", "Matheus", "Miqueias"};

        Integer numeroCamisa= 1;
        for (String nome: nomes){
            bahia.contratarJogador(nome, numeroCamisa++);
        }

        bahia.escalarJogador("Everton", SituacaoEscalacaoEnum.TITULAR);
        bahia.escalarJogador("Jorge", SituacaoEscalacaoEnum.TITULAR);
        bahia.escalarJogador("Joao", SituacaoEscalacaoEnum.TITULAR);
        bahia.escalarJogador("Matheus", SituacaoEscalacaoEnum.RESERVA);
        bahia.escalarJogador("Miqueias", SituacaoEscalacaoEnum.RESERVA);

        System.out.println("\n==== Primeira Escalação ====");
        bahia.obterEscalacao();


        bahia.removerJogadorEscalacao("Joao");
        bahia.removerJogadorEscalacao("Matheus");

        System.out.println("==== Escalação final ====");
        bahia.obterEscalacao();
    }
}
