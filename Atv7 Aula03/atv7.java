import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner inAnoNasc = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        int ano = inAnoNasc.nextInt();
        float idade = 2023-ano;
        
         if(idade < 16) {
            System.out.println("Voto não obrigatório");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("Voto facultativo");
        } else if (idade >= 70) {
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Voto Obrigatório");
        }
        inAnoNasc.close();
    }
}
