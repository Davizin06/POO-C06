package Exercicios.br.inatel.poo;

import Exercicios.br.inatel.poo.turmas.Aluno;
import Exercicios.br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turmaC06 = new Turma();

        Aluno a1 = new Aluno();
        a1.nome = "Davi";
        a1.matricula = "123";
        a1.notas = new double[]{8.5, 9.0, 7.5};

        Aluno a2 = new Aluno();
        a2.nome = "Ana";
        a2.matricula = "456";
        a2.notas = new double[]{10.0, 9.5, 9.8};

        Aluno a3 = new Aluno();
        a3.nome = "Lucas";
        a3.matricula = "789";
        a3.notas = new double[]{6.0, 7.0, 5.5};

        turmaC06.adicionarAluno(a1);
        turmaC06.adicionarAluno(a2);
        turmaC06.adicionarAluno(a3);

        turmaC06.listarAlunos();

        Aluno melhor = turmaC06.buscarMelhorAluno();
        if (melhor != null) {
            System.out.println("Vencedor do prêmio de melhor média: " + melhor.nome);
            System.out.println("Média final: " + melhor.calculaMedia());
        }
    }
}
