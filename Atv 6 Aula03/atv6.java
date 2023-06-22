import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner inNum = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float n1 = inNum.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = inNum.nextFloat();

        float resp = n1 < n2 ? n1:n2;
        System.out.println("O número " + resp + " é o menor.");
        float soma = n1+n2;
        System.out.println("O resultado da soma é: " + soma);
        inNum.close();
    }
}
