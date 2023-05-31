package Aula02;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner inNumero = new Scanner(System.in);
        System.out.println("Digite um número com 3 casas decimais: ");
        float numero = inNumero.nextFloat();
        System.out.printf("Número: %.3f", numero);
        inNumero.close();
    }
}
