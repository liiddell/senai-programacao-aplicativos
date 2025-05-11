package br.senai.poo.lista08;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa{

    private String registro, especializacao;
    private List<Aluno> alunos = new ArrayList<>();

    public Instrutor(String nome, String cpf, String dataNascimento, String especializacao) {
        super(nome, cpf, dataNascimento);
        this.especializacao = especializacao;
    }


    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void listarAlunos(){
        for(Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== Informações do Instrutor ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Registro: " + registro);
        System.out.println("Especialização: " + especializacao);
        System.out.println("===============================");
    }


    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
