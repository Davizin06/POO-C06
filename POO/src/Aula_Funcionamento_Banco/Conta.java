package Aula_Funcionamento_Banco;

public class Conta {

    //Atributos
    public double saldo;
    public double limite;
    public int agencia;
    public int numero_conta;

    //Métodos
    public void deposita(double quantia){
        this.saldo += quantia;
    }

    public void saca(double quantia){
        this.saldo = this.saldo - quantia;
    }
}
