package Exercicios.Exercicio6_Kart;

public class Kart {
    public String nome;
    public Piloto piloto;

    public Kart(){
        Motor motor = new Motor();

        motor.cilindradas = "50";
        motor.velocidadeMaxima = 100;
        motor.mostrarInfo();
    }
    public void Pular(){
        System.out.println("Kart Pulou");
    }

    public void soltarTurbo(){
        System.out.println("Soltou Turbo");
    }

    public void fazerDrift(){
        System.out.println("Fez Drift!");
    }
}
