package br.senai.poo.avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos = new ArrayList<>();

    public Loja() {
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }


    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void buscarPorCategoria(CategoriaProdutoEnum categoria) {
        for (Produto produto : produtos) {
            if (categoria == produto.getCategoria()) {
                System.out.println(produto.exibirInformacoes());
            }
        }
    }

    public Produto buscarPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
