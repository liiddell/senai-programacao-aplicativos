package br.senai.poo.lista08;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String matricula;
    private TipoPlano tipoPlano;
    private static int totalAlunos = 0;
    private List<String> aulasAgendadas;

    public Aluno(String nome, String cpf, String dataNascimento, TipoPlano tipoPlano) {
        super(nome, cpf, dataNascimento);
        this.tipoPlano = tipoPlano;
        setMatricula("AL"+ totalAlunos);
        totalAlunos++;
    }

    public void agendarAula(String nomeAula){
        aulasAgendadas.add(nomeAula);
    }

    public void agendarAula(List<String> aulas){
        aulasAgendadas.addAll(aulas);
    }

    public void cancelarAula(String nomeAula){
        aulasAgendadas.remove(nomeAula);
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("=== Informações do Aluno ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Tipo de Plano: " + tipoPlano);
        System.out.println("Aulas Agendadas: " + aulasAgendadas);
        System.out.println("============================");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoPlano getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(TipoPlano tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public static int getTotalAlunos() {
        return totalAlunos;
    }

    public static void setTotalAlunos(int totalAlunos) {
        Aluno.totalAlunos = totalAlunos;
    }

    public List<String> getAulasAgendadas() {
        return aulasAgendadas;
    }

    public void setAulasAgendadas(List<String> aulasAgendadas) {
        this.aulasAgendadas = aulasAgendadas;
    }
}
