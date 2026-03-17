package Exercicios.Zumbi;

public class Main {
    public static void main(String[] args){

        Zumbis zumbis = new Zumbis();

        zumbis.nome = "Zezin";
        zumbis.cor = "Azul";
        zumbis.nivelInteligencia = 20;

        System.out.println("Olá, meu nome é: " + zumbis.nome + "\nMinha cor é: " + zumbis.cor + "\nMeu nivél de inteligencia é: " + zumbis.nivelInteligencia);

        zumbis.cacar(40);

        System.out.println("===========================");
        System.out.println("Após a caçada meu nivel de inteligencia é: " + zumbis.nivelInteligencia);
    }
}
