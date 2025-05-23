package br.senai.poo.avaliacao;

public class Main {
    public static void main(String[] args) {

        Biblioteca senai = new Biblioteca();

        Livro l1 = new Livro("Alice no País das Maravilhas", 123, CategoriaLivroEnum.INFANTIL);
        Livro l2 = new Livro("1984", 123, CategoriaLivroEnum.FICCAO);
        Livro l3 = new Livro("Café com deus pai", 123, CategoriaLivroEnum.NAO_FICCAO);
        Livro l4 = new Livro("Dom Casmurro", 123, CategoriaLivroEnum.FICCAO);
        Livro l5 = new Livro("Bob Sponja", 123, CategoriaLivroEnum.INFANTIL);
        Livro l6 = new Livro("Livro", 123, CategoriaLivroEnum.INFANTIL);

        senai.adicionarLivro(l1);
        senai.adicionarLivro(l2);
        senai.adicionarLivro(l3);
        senai.adicionarLivro(l4);
        senai.adicionarLivro(l5);
        senai.adicionarLivro(l6);

        System.out.println("Livros detalhados: \n");
        for(Livro livro: senai.listarLivros()){
            System.out.println(livro.exibirInformacoes(true));
        }

        System.out.println();
        System.out.println("Livros resumidos: \n");
        for(Livro livro: senai.listarLivros()){
            System.out.println(livro.exibirInformacoes(false));
        }
        System.out.println();

        System.out.println("Categoria Ficção: \n");
        for(Livro livro: senai.buscarPorCategoria(CategoriaLivroEnum.FICCAO)) {
            System.out.println(livro.exibirInformacoes());
        }
        System.out.println();
        System.out.println("Categoria Infantil: \n");
        for(Livro livro: senai.buscarPorCategoria(CategoriaLivroEnum.INFANTIL)) {
            System.out.println(livro.exibirInformacoes());
        }

        System.out.println();
        System.out.println("Buscar por Nome: ");
        for(Livro livro: senai.buscarLivroPorTitulo("om")){
            System.out.println(livro.exibirInformacoes(false));
        }

    }
}
