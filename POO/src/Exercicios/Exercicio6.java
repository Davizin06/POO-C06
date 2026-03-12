package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
    static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int x = aleatorio.nextInt( 10) + 1;
        int numero = -1;

        while(x != numero){
            System.out.println("Informe um numero: ");
            numero = teclado.nextInt();

            if (x == numero){
                System.out.println(" VOCÊ ACERTOU");
            }
            else{
                System.out.println("VOCE ERRRROUUU");
            }
        }

    }
}
