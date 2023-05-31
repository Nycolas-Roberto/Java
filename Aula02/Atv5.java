package Aula02;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner inNota = new Scanner(System.in);
        
        System.out.println("Digite uma nota: ");
        int nota = inNota.nextInt();

        if(nota >= 0 && nota <= 100) {
            System.out.println("Nota Válida");
        } else {
            System.out.println("Nota inválida");
        }
        inNota.close();

        
    }
}
