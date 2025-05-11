package br.senai.poo.lista08;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nome;
    private List<Instrutor> instrutores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private static int capacidadeMaxima = 200;

    public Academia(String nome) {
        this.nome = nome;
    }

    public void cadastrarAluno(Aluno aluno){
        if(alunos.size() < capacidadeMaxima) {
            alunos.add(aluno);
            //System.out.println("Aluno cadastrado com sucesso: " + aluno.getNome());
        }else{
            System.out.println("Capacidade máxima da academia atingida");
        }
    }

    public void contratarInstrutor(Instrutor instrutor){
        instrutores.add(instrutor);
        //System.out.println("Instrutor contratado com sucesso: " + instrutor.getNome());
    }


    public Pessoa buscarPessoa(String cpf){
        for(Aluno aluno: alunos){
            if(aluno.getCpf().equalsIgnoreCase(cpf)){
                return aluno;
            }
        }

        for(Instrutor instrutor: instrutores){
            if(instrutor.getCpf().equalsIgnoreCase(cpf)){
                return instrutor;
            }
        }
        return null;
    }

    public Pessoa buscarPessoaNome(String nome){
        for(Aluno aluno: alunos){
            if(aluno.getNome().equalsIgnoreCase(nome)){
                return aluno;
            }
        }

        for(Instrutor instrutor: instrutores){
            if(instrutor.getNome().equalsIgnoreCase(nome)){
                return instrutor;
            }
        }
        return null;
    }


    public ArrayList<Aluno> relatorioAlunosPorPlano(TipoPlano tipoPlano){
        ArrayList<Aluno> alunosTipoPlano = new ArrayList<>();
        for(Aluno aluno :alunos){
            if(aluno.getTipoPlano() == tipoPlano){
                alunosTipoPlano.add(aluno);
            }

        }
        return alunosTipoPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public static int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public static void setCapacidadeMaxima(int capacidadeMaxima) {
        Academia.capacidadeMaxima = capacidadeMaxima;
    }
}
