package Exercicios;

import java.util.Scanner;

public class Exercicio1_Casting {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a quantidade de lanches na primeira hora: ");
        int primeiraHora = teclado.nextInt();

        System.out.print("Insira a quantidade de lanches na segunda hora: ");
        int segundaHora = teclado.nextInt();

        System.out.print("Insira a quantidade de lanches na terceira hora: ");
        int terceiraHora = teclado.nextInt();

        int total = primeiraHora + segundaHora + terceiraHora;
        int media = total / 3;

        System.out.println("Total de lanches consumidos: " + total);
        System.out.printf("Media de lanches consumidos nesses 3 horas: " + media);
    }
}