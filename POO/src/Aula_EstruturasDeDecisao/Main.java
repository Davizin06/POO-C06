package Aula_EstruturasDeDecisao;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
/*
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
        */

        Scanner inatel = new Scanner(System.in);

        int qtd = inatel.nextInt();

        switch (qtd) {
            case 5:
                System.out.println("Quantidade = 5");
                System.out.println("Inatel");
                break;
            case 1:
                System.out.println("Quantidade = 1");
                break;
            case 2:
                System.out.println("Quantidade = 2");
                break;
            default:
                System.out.println("Condição padrão");
        }
    }
}

