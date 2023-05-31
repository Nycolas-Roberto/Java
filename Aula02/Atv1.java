package Aula02;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner inNome = new Scanner(System.in);
        System.out.println("Digite o primeiro nome: ");
        String nome1 = inNome.nextLine();

        System.out.println("Digite o segundo nome: ");
        String nome2 = inNome.nextLine();
        
        System.out.println("Digite o terceiro nome: ");
        String nome3 = inNome.nextLine();

        System.out.println("Nome 01: " + nome1);
        System.out.println("Nome 03: " + nome2);
        System.out.println("Nome 03: " + nome3);
        inNome.close();
    }
}
