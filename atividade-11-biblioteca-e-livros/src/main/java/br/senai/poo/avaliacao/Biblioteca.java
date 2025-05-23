package br.senai.poo.avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca() {
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivros() {
        for (Livro livro : livros) {
            livro.exibirInformacoes(true);
        }
        return livros;
    }

    public List <Livro> buscarPorCategoria(CategoriaLivroEnum categoria) {
        List<Livro> livrosCategoria = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getCategoria() == categoria) {
                livrosCategoria.add(livro);
            }
        }
        return livrosCategoria;
    }

       public List<Livro> buscarLivroPorTitulo (String titulo){
        List<Livro> livroTitulo = new ArrayList<>();
        String tituloLower = titulo.toLowerCase();
           for (Livro livro : livros) {
                if (livro.getTitulo().toLowerCase().contains(tituloLower)) {
                    livroTitulo.add(livro);
              }
           }
           if(livroTitulo.size() == 0){
               System.out.println("Livro não encontrado!");
               return livroTitulo;
           }
           return livroTitulo;

       }
    }
