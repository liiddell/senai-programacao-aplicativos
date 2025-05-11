package br.senai.poo.lista08;

public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia("Arena Corpus");

        Instrutor i1 = new Instrutor("Luiz", "12345646123","08/01/2003", "Musculação");
        Instrutor i2 = new Instrutor("Jorge", "12345646123","08/01/2003", "Cardio");
        Instrutor i3 = new Instrutor("Maria", "55566677788","08/01/2003", "Pilates");

        academia.contratarInstrutor(i1);
        academia.contratarInstrutor(i2);
        academia.contratarInstrutor(i3);

        Aluno a1 = new Aluno("Hugo", "12345678912", "08/01/2003",TipoPlano.INTERMEDIARIO);
        Aluno a2 = new Aluno("Jose", "55566677788", "08/01/2003",TipoPlano.BASICO);
        Aluno a3 = new Aluno("Victor", "12345678912", "08/01/2003",TipoPlano.INTERMEDIARIO);
        Aluno a4 = new Aluno("Maria", "12345678912", "08/01/2003",TipoPlano.PREMIUM);
        Aluno a5 = new Aluno("Pedro", "55566677788", "08/01/2003",TipoPlano.BASICO);

        academia.cadastrarAluno(a1);
        academia.cadastrarAluno(a2);
        academia.cadastrarAluno(a3);
        academia.cadastrarAluno(a4);
        academia.cadastrarAluno(a5);

        a1.agendarAula("Musculação - Aulão");
        a2.agendarAula("Pilates - Intermediário");
        a3.agendarAula("Musculação - Aulão");
        a4.agendarAula("Yoga - Avançado");

        System.out.println("Lista de Instrutores:");
        for (Instrutor instrutor : academia.getInstrutores()) {
            System.out.println("Instrutor: " + instrutor.getNome() + " | Especialização: " + instrutor.getEspecializacao());
        }

        System.out.println("\nLista de Alunos:");
        for(Aluno aluno : academia.getAlunos()){
            System.out.println("Aluno: " + aluno.getNome() + "| Tipo de plano: "+ aluno.getTipoPlano());
        }


        System.out.println("\nPlano Básico:");
        for (Aluno aluno : academia.relatorioAlunosPorPlano(TipoPlano.BASICO)){
            System.out.println(aluno.getNome());
        }

        System.out.println("\nPlano Intermediário:");
        for (Aluno aluno : academia.relatorioAlunosPorPlano(TipoPlano.INTERMEDIARIO)){
            System.out.println(aluno.getNome());
        }

        System.out.println("\nPlano Premium:");
        for (Aluno aluno : academia.relatorioAlunosPorPlano(TipoPlano.PREMIUM)){
            System.out.println(aluno.getNome());
        }

        System.out.println("\nTotal de alunos: " + Aluno.getTotalAlunos());
    }
}
