package Aula02;
import java.util.Scanner;
public class Atv7 {
    public static void main(String[] args) {
        Scanner inIdade = new Scanner(System.in);


        System.out.println("Digite sua Idade");
        int idade = inIdade.nextInt();

        if(idade <= 12) {
            System.out.println("Você é uma criança");
        } else if (idade <= 18) {
            System.out.println("Você é um adolescente");
        } else if (idade <= 50) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um velho");
        }
        inIdade.close();
    }
}
