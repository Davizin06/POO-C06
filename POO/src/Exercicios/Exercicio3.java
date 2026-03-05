package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Quantos lanches foram consumidos? ");
        int quantidade = cin.nextInt();
        int soma = 0;

        for(int i = 1; i <= quantidade; ++i) {
            System.out.println("Digite a quantidade de lanches da pessoa " + i + ": ");
            int lanches = cin.nextInt();
            soma += lanches;
        }

        double media = (double)soma / (double)quantidade;
        System.out.println("Soma total de lanches: " + soma);
        System.out.println("Média de lanches: " + media);
    }
}
