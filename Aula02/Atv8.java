package Aula02;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner inIdade = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        int idade = inIdade.nextInt();
        if(idade <= 16) {
            System.out.println("Não pode votar");
        } else if ((idade >= 16) && (idade < 18)) {
            System.out.println("Voto Facultativo");
        } else if ((idade >= 18)) {
            System.out.println("Voto obrigatório");
        } else if((idade >= 70)) {
            System.out.println("Voto facultativo");
        }
        inIdade.close();
    }
}
