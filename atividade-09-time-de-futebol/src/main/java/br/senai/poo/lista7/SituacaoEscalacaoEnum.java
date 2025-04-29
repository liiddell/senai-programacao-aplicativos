package br.senai.poo.lista7;

public enum SituacaoEscalacaoEnum {
    TITULAR(11),RESERVA(12);

    private Integer quantidadeMaxima;

    private SituacaoEscalacaoEnum(Integer quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public Integer getQuantidadeMaxima() {
        return quantidadeMaxima;
    }
}
