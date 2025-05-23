package br.senai.poo.avaliacao;

public class Exemplo {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto comida = new Produto("Maçã", CategoriaProdutoEnum.ALIMENTO, 5.50);
        Produto eletronico = new Produto("Samsung A55", CategoriaProdutoEnum.ELETRONICO, 1200.0);
        Produto roupa = new Produto("Camisa Oversized", CategoriaProdutoEnum.ROUPA, 55.0);

        loja.adicionarProduto(comida);
        loja.adicionarProduto(eletronico);
        loja.adicionarProduto(roupa);


        System.out.println("Lista de produtos detalhadas: ");
        for(Produto produtos: loja.listarProdutos()){
            System.out.println(produtos.exibirInformacoes(true));
        }

        System.out.println();
        System.out.println("Lista de produtos resumida: ");
        for(Produto produtos: loja.listarProdutos()){
            System.out.println(produtos.exibirInformacoes(false));
        }

        System.out.println();
        System.out.println("Categoria Eletrónico: ");
        for(Produto produtos: loja.buscarPorCategoria(CategoriaProdutoEnum.ELETRONICO)){
            System.out.println(produtos.exibirInformacoes(true));
        }

        System.out.println();
        System.out.println("Buscar por Nome: Maç");
        for(Produto produtos: loja.buscarPorNome("Maçã")){
            System.out.println(produtos.exibirInformacoes(true));
        }


    }

}