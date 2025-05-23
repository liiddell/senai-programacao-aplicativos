package br.senai.poo.avaliacao;

//Classe Abstrata
public abstract class ItemLoja {
    private String nome;

    public ItemLoja(String nome) {
        this.nome = nome;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String exibirInformacoes();
}