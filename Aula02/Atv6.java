package Aula02;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner inIdade = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        int idade = inIdade.nextInt();
        if(idade <= 18) {
            System.out.println("Menor de Idade");
        } else {
            System.out.println("Maior de Idade");
        }
        inIdade.close();
    }
}
