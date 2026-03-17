package Exercicios.Zumbi;

public class Zumbis {

    //Atributos

    public String nome;
    public int nivelInteligencia;
    public String cor;

    public void cacar(double pontos){

        if(pontos > nivelInteligencia)
            this.nivelInteligencia += pontos;

        else
            this.nivelInteligencia = this.nivelInteligencia;
    }
}
