package Aula02;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner inNome = new Scanner(System.in);
        Scanner inGenero = new Scanner(System.in);
        Scanner inAno = new Scanner(System.in);

        System.out.println("Digite o nome do Filme: ");
        String nomeFilme = inNome.nextLine();

        System.out.println("Digite o gênero do Fime: ");
        String gerenoFilme = inGenero.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoFilme = inAno.nextInt();

        System.out.println("Nome do filme: " + nomeFilme);
        System.out.println("Gênero do filme: " + gerenoFilme);
        System.out.println("Ano do filme: " + anoFilme + "\n");

        inNome.close();
        inGenero.close();
        inAno.close();
    }
}
