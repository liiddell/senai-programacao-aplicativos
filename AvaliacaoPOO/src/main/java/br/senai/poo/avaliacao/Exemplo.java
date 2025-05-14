package br.senai.poo.avaliacao;

public class Exemplo {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto comida = new Produto("Maça", CategoriaProdutoEnum.ALIMENTO, 5.50);
        Produto eletronico = new Produto("Samsung A55", CategoriaProdutoEnum.ELETRONICO, 1200.0);
        Produto roupa = new Produto("Camisa Oversized", CategoriaProdutoEnum.ROUPA, 55.0);

        loja.adicionarProduto(comida);
        loja.adicionarProduto(eletronico);
        loja.adicionarProduto(roupa);

        System.out.println("Lista de produtos: ");
        loja.listarProdutos();

        System.out.println("Lista de produtos detalhadas: ");
        System.out.println(comida.exibirInformacoes());
        System.out.println(eletronico.exibirInformacoes());
        System.out.println(roupa.exibirInformacoes());

        System.out.println();
        System.out.println("Lista de produtos resumida: ");

        System.out.println(comida.exibirInformcacoes(false));
        System.out.println(eletronico.exibirInformcacoes(false));
        System.out.println(roupa.exibirInformcacoes(false));

        System.out.println();
        System.out.println("Categoria Eletrónico: ");
        loja.buscarPorCategoria(CategoriaProdutoEnum.ELETRONICO);

        System.out.println();
        System.out.println("Buscar por Nome: ");
        System.out.println(loja.buscarPorNome("maça"));
        

    }

}
