package Exercicios;

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero de alunos matriculados em C06: ");
        int matriculas = teclado.nextInt();
        switch (matriculas){

            case 10:
                System.out.println("Aula na sala I-6");
                break;
            case 20:
                System.out.println("Aula na sala I-6");
                break;
            case 30:
                System.out.println("Aula na sala I-5");
                break;

            default:
                System.out.println("Sala não cadastrada!");
        }

    }
}
