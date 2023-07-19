package Exemplo;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        // Recebendo o dado do tipo primitivo int
        int idadeInt = sc.nextInt();

        // Fazendo o boxing de um tipo primitivo para um Wrapper
        Integer idade = idadeInt;

        // Imprimindo no console a idade utilizando o Wrapper Integer do primitivo int
        System.out.println("Sua idade em Integer é: " + idade);

    }
}
