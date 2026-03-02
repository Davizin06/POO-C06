package Aula_Casting;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade = 20;
        long idade1 = idade; //Conversao por promoção
        int idade2 = (int) idade1; // Conversao por Casting

        float pi = 3.1415f;
        double pi2 = pi; //Conversao por promoção
        float pi3 = (float) pi2; //Conversao por Casting

        int ano = Integer.parseInt("2026"); //Conversao por Casting

        char letra = 'S';
        String letra1 = String.valueOf(letra);
        String letra2 = Character.toString(letra);
        String letra3 = "" + letra;

        // String -> char
        String faculdade = "Inatel";
        char primeiraLetra = faculdade.charAt(0);


        char nome[] = {'n', 'o', 'm', 'e'};
        // System.out.printf("The character is: %s", String.valueOf(nome));


        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        System.out.println("Entre com sua idade: ");
        int idadeTeclado = teclado.nextInt();

        System.out.println("Entre com sua altura: ");
        double altura = teclado.nextDouble();

        teclado.nextLine(); //Limpa o buffer

        System.out.println("Entre com o seu nome: ");
        String nomeTeclado = teclado.nextLine();

        System.out.printf("idade = %d; altura = %.2f; nome = %s; \n", idadeTeclado, altura, String.valueOf(nome));
    }
}


