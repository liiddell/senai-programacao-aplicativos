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


    public List<Produto> listarProdutos(){
        return produtos;
    }

    public List<Produto> buscarPorCategoria(CategoriaProdutoEnum categoria) {
        List<Produto> produtosCategoria = new ArrayList<>();
        for (Produto produto : produtos) {
            if (categoria == produto.getCategoria()) {
                produtosCategoria.add(produto);
            }
        }
        return produtosCategoria;
    }

    public List<Produto>buscarPorNome(String nome) {
        List<Produto> produtosNome = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtosNome.add(produto);
            }
        }
        return produtosNome;
    }
}