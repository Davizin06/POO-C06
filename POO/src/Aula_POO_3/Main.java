package Aula_POO_3;

public class Main {
    public static void main(String[] args){

//        Conta contaCorrente = new Conta();
//        Conta contaCorrente2 = new Conta();
//
//        contaCorrente.saldo = 1000;
//       contaCorrente.nomeDono = "DaviPsadelo";
//
//        System.out.println("Conta de: " + contaCorrente.nomeDono + " possui R$" + contaCorrente.saldo);
//
//        contaCorrente.deposito(250);
//
//        System.out.println("Conta de: " + contaCorrente.nomeDono + " possui R$" + contaCorrente.saldo);
//
//        contaCorrente.saque(70);
//
//        System.out.println("Conta de: " + contaCorrente.nomeDono + " possui R$" + contaCorrente.saldo);
//
//        System.out.println("-------------------------");
//
//
//        contaCorrente2.saldo = 3500;
//        contaCorrente2.nomeDono = "SebaTororo";
//
//        System.out.println("Conta de: " + contaCorrente2.nomeDono + " possui R$" + contaCorrente2.saldo);
//
//        contaCorrente2.deposito(250);
//
//        System.out.println("Conta de: " + contaCorrente2.nomeDono + " possui R$" + contaCorrente2.saldo);
//
//        contaCorrente2.saque(70);
//
//        System.out.println("Conta de: " + contaCorrente2.nomeDono + " possui R$" + contaCorrente2.saldo);
//
//        System.out.println("-------------------------");

        Conta contaCorrente = new Conta();

        contaCorrente.saldo = 1000;
        contaCorrente.nomeDono = "DaviPsadelo";

        Conta contaCorrente2 = new Conta();
        contaCorrente2.saldo = 5000;
        contaCorrente2.nomeDono = "SebaTororo";

        //contaCorrente = contaCorrente2;

        //if (contaCorrente == contaCorrente2)
            //System.out.println("Contas iguais!");
        //else
           //System.out.println("Contas diferentes!");

        contaCorrente.transferir(contaCorrente2, 500);

        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.nomeDono);

        System.out.println(contaCorrente2.saldo);
        System.out.println(contaCorrente2.nomeDono);
    }
}
