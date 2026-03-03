package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int NPA = teclado.nextInt();
        int NFA;

        if (NPA >= 60) {

            System.out.println("Você está aprovado!");
            NFA = NPA;

        } else if (NPA < 30) {

            System.out.println("Você está reprovado!");
            NFA = NPA;

        } else {

            System.out.println("Você ficou de NP3, qual a sua nota de NP3?");
            int NP3 = teclado.nextInt();
            NFA = (NPA + NP3) / 2;

            if (NFA >= 50)
                System.out.println("Você foi aprovado!");
            else
                System.out.println("Você foi reprovado!");
        }
    }
}
