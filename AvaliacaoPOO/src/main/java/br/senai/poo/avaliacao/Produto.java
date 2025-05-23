package br.senai.poo.avaliacao;

//Herança e Implementação
public class Produto extends ItemLoja implements ICalculavel {
    private CategoriaProdutoEnum categoria;
    private double precoBase;
    private int codigo;
    private static int ultimoId = 0;

    public Produto(String nome, CategoriaProdutoEnum categoria, double precoBase) {
        super(nome);
        this.categoria = categoria;
        this.precoBase = precoBase;
        this.codigo = ++ultimoId;
    }

    //Metodo sobrescrito
    @Override
    public String exibirInformacoes() {
        return "Nome: " + getNome() + "| Codigo: " + codigo + "| Categoria: " + categoria +
                "| Preço Final: " + calcularPrecoFinal();
    }

    //Metodo sobrecarregado
    public String exibirInformacoes(boolean detalhado) {
        if (detalhado) {
            return exibirInformacoes();
        }
        return "Nome: " + getNome();
    }

    //Metodo sobrescrito implementado
    @Override
    public double calcularPrecoFinal() {
        if (categoria == CategoriaProdutoEnum.ELETRONICO) {
            return precoBase * 1.20;
        }
        if (categoria == CategoriaProdutoEnum.ROUPA) {
            return precoBase * 1.10;
        }
        if (categoria == CategoriaProdutoEnum.ALIMENTO) {
            return precoBase * 1.05;
        }
        return 0.0;
    }

    //Geterrs e Setters
    public CategoriaProdutoEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProdutoEnum categoria) {
        this.categoria = categoria;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase < 0) {              //Validação não permiter valor negativo
            throw new IllegalArgumentException("Erro, não pode ter preço abaixo de R$ 0");
        } else {
            this.precoBase = precoBase;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getUltimoId() {
        return ultimoId;
    }

    public void setUltimoId(int ultimoId) {
        this.ultimoId = ultimoId;
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() + "| Categoria: " + categoria+
                "| Preço: " + precoBase+ "| Código:  "+ codigo + "| Último ID: " + ultimoId+ "\n";
    }
}