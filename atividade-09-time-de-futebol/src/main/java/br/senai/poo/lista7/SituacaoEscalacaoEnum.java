package br.senai.poo.lista7;

public enum SituacaoEscalacaoEnum {

    // Define os dois tipos possíveis de escalação e seus respectivos limites
    TITULAR(11),RESERVA(12);

    // Atributo que guarda o limite de jogadores para cada tipo
    private Integer quantidadeMaxima;

    // Construtor privado usado internamente pela enum
    private SituacaoEscalacaoEnum(Integer quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    // Getter para acessar o limite de cada tipo (TITULAR ou RESERVA)
    public Integer getQuantidadeMaxima() {
        return quantidadeMaxima;
    }
}
