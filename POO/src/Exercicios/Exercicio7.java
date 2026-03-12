package Exercicios;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
    static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int x = aleatorio.nextInt( 10) + 1;
        int numero = -1;

        while(x != numero){
            System.out.println("Informe um numero: ");
            numero = teclado.nextInt();

            if (x < numero){
                System.out.println("VALOR ALEATORIO É MENOR");
            }
            else{
                System.out.println("VALOR ALEATORIO É MAIOR");
            }
        }
        System.out.println("VOCE ACERTOU");
    }
}

