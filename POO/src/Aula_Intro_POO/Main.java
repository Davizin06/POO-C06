package Aula_Intro_POO;

public class Main {
    static void main(String[] args){
        Pessoa Renzo = new Pessoa();

        Renzo.nome = "Renzo Mesquita";
        Renzo.idade = 35;

//        Renzo.falar();

        Professor ProfessorPOO = new Professor();

        ProfessorPOO.nome = "Justino";
        ProfessorPOO.idade = 70;
        ProfessorPOO.disciplina = "Radio";

//        ProfessorPOO.falar();
//        ProfessorPOO.ministraAula();

        Engenheiro Eng = new Engenheiro();

        Eng.categoria = "Civil";
        Eng.idade = 29;
        Eng.nome = "Davizin";
        Eng.disciplina = "Aula de QA";

        Eng.falar();
        Eng.ministraAula();
        Eng.constroi();
    }
}
