import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner inNota = new Scanner(System.in);
        System.out.println("Digite 1° nota");
        float nota1 = inNota.nextFloat();

        System.out.println("Digite 2° nota");
        float nota2 = inNota.nextFloat();

        float media = (nota1 + nota2)/2;
        if(media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media <= 7.0) {
            System.out.println("Reprovado");
        } else if (media == 1.0) {
            System.out.println("Aprovado com Distinção");
        }
        inNota.close();
    }
}
