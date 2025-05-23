package br.senai.poo.avaliacao;

public abstract class ItemBiblioteca {
    private String titulo;
    private int codigo;

    public ItemBiblioteca(String titulo, int codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }


    public abstract String exibirInformacoes();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0){
            throw new IllegalArgumentException("Não pode número negativo");
        }
        else{
            this.codigo = codigo;
        }

    }
}
