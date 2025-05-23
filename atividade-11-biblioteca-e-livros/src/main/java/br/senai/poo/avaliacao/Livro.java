package br.senai.poo.avaliacao;

public class Livro extends ItemBiblioteca{

    private CategoriaLivroEnum categoria;
    private int id;
    private static int proxId = 1;

    public Livro(String titulo, int codigo, CategoriaLivroEnum categoria) {
        super(titulo, codigo);
        this.categoria = categoria;
        this.id = ++proxId;
    }

    @Override
    public String exibirInformacoes(){
        return String.format("Livro %d: %s | Código: %d | Categoria: %s", id, getTitulo(), getCodigo(), categoria);
    }


    public String exibirInformacoes(boolean detalhado){
        if (detalhado){
            return String.format("Livro %d: %s | Código: %d | Categoria: %s", id, getTitulo(), getCodigo(), categoria);
        }
        return String.format("Livro %d: %s", id, getTitulo());
    }

    public CategoriaLivroEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaLivroEnum categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProxId() {
        return proxId;
    }

    public void setProxId(int proxId) {
        this.proxId = proxId;
    }
}
