package br.senai.poo.lista7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimeTest {
    public Time time;

    @Before
    public void setUp(){
        time = new Time("Bahia", "Rogério");
        for(Integer i = 1; i <=12; i++){
            time.contratarJogador("nome" +i, i); // Contrata 12 jogadores
        }
    }

    @Test
    public void escalarMaximoJogadoresTitulares() {
        for (Integer i = 1; i <= 11; i++) {
            // Escala os 11 primeiros como titulares
            time.escalarJogador("nome"+ i, SituacaoEscalacaoEnum.TITULAR);
        }

        // Tenta escalar o 12º jogador como titular (deve falhar)
        Assert.assertFalse(time.escalarJogador("nome12",SituacaoEscalacaoEnum.TITULAR));
    }

    @Test
    public void escalarJogadorQueNaoEstaNoTime(){
        Assert.assertFalse(time.escalarJogador("nome13", SituacaoEscalacaoEnum.RESERVA));
    }

    //Sugestões

    @Test
    public void escalarMaximoReservas(){
        for(Integer i = 1; i <= 12; i++){
            time.escalarJogador("nome"+i, SituacaoEscalacaoEnum.RESERVA);
        }
        Assert.assertFalse(time.escalarJogador("nome13", SituacaoEscalacaoEnum.RESERVA));
    }

    @Test
    public void escalarDuasVezes(){
        Assert.assertTrue(time.escalarJogador("nome1", SituacaoEscalacaoEnum.TITULAR));

        Assert.assertFalse(time.escalarJogador("nome1", SituacaoEscalacaoEnum.RESERVA));
    }

    @Test
    public void removerEadicionar(){
        Assert.assertTrue(time.escalarJogador("nome1", SituacaoEscalacaoEnum.TITULAR));
        time.removerJogadorEscalacao("nome1");
        Assert.assertTrue(time.escalarJogador("nome1", SituacaoEscalacaoEnum.RESERVA));
    }

}
