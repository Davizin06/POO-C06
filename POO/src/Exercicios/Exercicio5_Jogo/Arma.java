package Exercicios.Exercicio5_Jogo;

public class Arma {

    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;

    public void mostraInfoArma(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Resistencia: " + this.resistencia);
    }
}
