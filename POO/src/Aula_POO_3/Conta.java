package Aula_POO_3;

public class Conta {

    //Atributos
    public int saldo;
    public double limite;
    public String nomeDono;
    public int numero;

    //Metodos
    public void deposito(double quantia){
        this.saldo += quantia;
    }

    public void saque(double quantia){
        this.saldo -= quantia;
    }

    public void transferir(Conta contaDestino, double quantia){
        this.saldo -= quantia;
        contaDestino.saldo += quantia;
    }
}
