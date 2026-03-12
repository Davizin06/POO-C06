package Aula_Funcionamento_Banco;

public class Main {
    public static void main(String args[]){
        Conta conta = new Conta();

        conta.saldo = 700;
        conta.numero_conta = 12343;
        conta.agencia = 0001;
        conta.limite = 400;

        conta.saca(300);
        System.out.println("Na conta " + conta.numero_conta + " tem R$: " + conta.saldo);

        conta.deposita(600);
        System.out.println("Na conta " + conta.numero_conta + " tem R$: " + conta.saldo);
    }
}
