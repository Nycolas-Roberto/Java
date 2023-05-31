import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        /* Abrindo a entrada de dados */
        Scanner teclado = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma nota com números decimais:");
        float nota = teclado.nextFloat();
        System.out.println("Informe o seu nome:");
        String nome = entrada.nextLine();
        System.out.printf("Sua nota informada é: %.2f", nota);
        System.out.print("\nSeu nome é " + nome);
        /* Finalizando a entrada de dados */
        teclado.close();
        entrada.close();
        /* Nota, o sistema aceita que você use a mesma entrada de tecldo várias vezes, por exemplo a entrada com o nome "Entrada" estaá recebendo uma string, se vc usar ela de novo para receber uma entrada, tudo certo. Contudo, ele não funciona se você tentar inserir um dado de outro tipo */
    }
}
