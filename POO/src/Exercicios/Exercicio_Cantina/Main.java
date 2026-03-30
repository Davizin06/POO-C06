package Exercicios.Exercicio_Cantina;

public class Main {
    public static void main(String[] args){
        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado s1 = new Salgado();
        Salgado s2 = new Salgado();
        Salgado s3 = new Salgado();

        s1.nome = "Pastel";
        s2.nome = "Coxinha";
        s3.nome = "Medina";

        cantina.addSalgado(s1);
        cantina.addSalgado(s2);
        cantina.addSalgado(s3);

        cantina.mostrarInfo();
    }
}
