package Exercicios;

import java.util.Scanner;

public class Exercicio1_Avaliativo {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qtd_inteira;
        int qtd_meia;
        String qtd_inteira_string;
        String qtd_meia_string;
        double valor_inteira;
        double valor_meia;

        double total_inteira;
        double total_meia;
        double total_geral;
        double valor_medio;
        int total_ingressos;

        System.out.println("Calculadora de Arrecadação do Cinema");

        System.out.print("Digite a quantidade de ingressos inteiros vendidos: ");
        qtd_inteira = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o valor do ingresso inteiro: R$ ");
        qtd_inteira_string = scanner.nextLine();

        qtd_inteira_string = qtd_inteira_string.replace(',', '.');
        valor_inteira = Double.parseDouble(qtd_inteira_string);

        System.out.println();
        System.out.print("Digite a quantidade de ingressos meia entrada vendidos: ");
        qtd_meia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o valor do ingresso meia entrada: R$ ");
        qtd_meia_string = scanner.nextLine();

        qtd_meia_string = qtd_meia_string.replace(',', '.');
        valor_meia = Double.parseDouble(qtd_meia_string);

        total_inteira = qtd_inteira * valor_inteira;
        total_meia = qtd_meia * valor_meia;
        total_geral = total_inteira + total_meia;

        total_ingressos = qtd_inteira + qtd_meia;

        if (total_ingressos > 0) {
            valor_medio = total_geral / total_ingressos;
        } else {
            valor_medio = 0.0;
        }

        System.out.println("\n================ RESULTADOS ================");
        System.out.printf("Total arrecadado com ingressos inteiros: R$ %.2f\n", total_inteira);
        System.out.printf("Total arrecadado com meia-entrada: R$ %.2f\n", total_meia);
        System.out.printf("Valor total arrecadado na sessão: R$ %.2f\n", total_geral);
        System.out.printf("Valor médio pago por ingresso: R$ %.2f\n", valor_medio);
        System.out.println("============================================");

        scanner.close();
    }
}
