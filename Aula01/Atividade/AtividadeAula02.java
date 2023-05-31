import java.util.Scanner;

public class AtividadeAula02 {
    public static void main(String[] args) {
        /* Abrindo a entrada de dados */
        Scanner inNome = new Scanner(System.in);
        Scanner inNotas = new Scanner(System.in);

        /* Form Nome */
        System.out.println("Informe o nome do aluno: ");
        String nome = inNome.nextLine();
        /* Form Nota 1 */
        System.out.println("Informe a primeira nota: ");
        Float nota1 = inNotas.nextFloat();
        /* Form Nota 1 */
        System.out.println("Informe a segunda nota: ");
        Float nota2 = inNotas.nextFloat();
        /* Form Nota 1 */
        System.out.println("Informe a terceira nota: ");
        Float nota3 = inNotas.nextFloat();

        /* Exibição do resultado */
        System.out.print("\nSeu nome é" + nome + "\nSuas notas são:\n" + "\t"+ nota1 + "\n"+ "\t" + nota2 + "\n" + nota3);
        inNome.close();
        inNotas.close();
    }
}
