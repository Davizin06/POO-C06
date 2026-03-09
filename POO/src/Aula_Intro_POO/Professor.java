package Aula_Intro_POO;

import java.util.Scanner;

public class Professor extends  Pessoa{
    String disciplina;

    void ministraAula(){
        System.out.println("Aula de " + disciplina);
    }
}
