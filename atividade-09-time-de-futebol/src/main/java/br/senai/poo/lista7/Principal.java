package br.senai.poo.lista7;

public class Principal {
    public static void main(String[] args) {

        Time bahia = new Time("Bahia", "Hugostoso");

        bahia.contratarJogador("Everton", 1);
        bahia.contratarJogador("Jorge", 2);
        bahia.contratarJogador("Joao", 3);
        bahia.contratarJogador("Matheus", 4);
        bahia.contratarJogador("Miqueias", 5);
        bahia.contratarJogador("Jose", 6);
        bahia.obterEscalacao();

        bahia.escalarJogador("Everton", SituacaoEscalacaoEnum.RESERVA);
        bahia.escalarJogador("Jorge", SituacaoEscalacaoEnum.RESERVA);
        bahia.escalarJogador("Joao", SituacaoEscalacaoEnum.TITULAR);
        bahia.escalarJogador("Matheus", SituacaoEscalacaoEnum.TITULAR);
        bahia.escalarJogador("Miqueias", SituacaoEscalacaoEnum.RESERVA);
        bahia.escalarJogador("Jose", SituacaoEscalacaoEnum.TITULAR);

        bahia.obterEscalacao();

        bahia.removerJogadorEscalacao("Joao");
        bahia.removerJogadorEscalacao("Jose");
        bahia.removerJogadorEscalacao("Robertinho");
        bahia.obterEscalacao();
    }
}
