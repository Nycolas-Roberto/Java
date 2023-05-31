package Aula02;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner inNome = new Scanner(System.in);
        Scanner inNota = new Scanner(System.in);

        System.out.println("Primeiro Nome: ");
        String nome1 = inNome.nextLine();
        
        System.out.println("Segundo Nome: ");
        String nome2 = inNome.nextLine();

        System.out.println("Terceiro Nome: ");
        String nome3 = inNome.nextLine();


        System.out.println("Nota do Primeiro Aluno: ");
        float nota1 = inNota.nextFloat();

        System.out.println("Nota do Primeiro Aluno: ");
        float nota2 = inNota.nextFloat();

        System.out.println("Nota do Primeiro Aluno: ");
        float nota3 = inNota.nextFloat();

        System.out.println("Nome do Primeiro aluno: " + nome1 + "\n");
        System.out.println("Nome do Segundo aluno: " + nome2 + "\n");
        System.out.println("Nome do Terceiro aluno: " + nome3 + "\n");

        System.out.println("Nota do Primeiro aluno: " + nota1 + "\n");
        System.out.println("Nota do Segundo aluno: " + nota2 + "\n");
        System.out.println("Nota do Terceiro aluno: " + nota3 + "\n");

        inNome.close();
        inNota.close();
    }
}
