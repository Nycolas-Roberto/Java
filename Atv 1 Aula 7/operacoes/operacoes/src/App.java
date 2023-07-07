import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Receber info
        int opcao;

        do {
            exibirMenu(); // Procedimento de exibir menu
            opcao = scanner.nextInt(); // Armazenar a opção digitada em uma variável

            switch (opcao) { // Utilizando um 'Escolha, Caso'
                case 1:
                    calcularSoma();
                    break;
                case 2:
                    calcularSubtracao();
                    break;
                case 3:
                    calcularMultiplicacao();
                    break;
                case 4:
                    calcularDivisao();
                    break;
                case 0: // Encerrar programa
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0); // Repetir se o valor da variável for diferente de 0
        scanner.close();
    }



    /*
        Procedimento de exibir o menu 
    */
    public static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Somar dois números");
        System.out.println("2. Subtrair dois números");
        System.out.println("3. Multiplicar dois números");
        System.out.println("4. Dividir dois números");
        System.out.println("0. Sair do programa");
        System.out.print("Opção: ");
    }


    /* 
        Procedimento da operação de soma 
    */
    public static void calcularSoma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int soma = Math.addExact(num1, num2);;
        System.out.println("A soma dos números é: " + soma);
    }

    /* 
        Procedimento da operação de subtração 
    */
    public static void calcularSubtracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int subtracao = Math.subtractExact(num1, num2);
        System.out.println("A subtração dos números é: " + subtracao);
    }

    /* 
        Procedimento da operação de Multiplicação 
    */
    public static void calcularMultiplicacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int multiplicacao = Math.multiplyExact(num1, num2);
        System.out.println("A multiplicação dos números é: " + multiplicacao);
    }


    /* 
        Procedimento da operação de Divisão 
    */
    public static void calcularDivisao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Digite o denominador: ");
        int denominador = scanner.nextInt();
        

        if (denominador != 0) { // Se o dominador for diferente de 0.
            int divisao = numerador / denominador;
            System.out.println("O resultado da divisão é: " + divisao);
        } else {
            System.out.println("Erro: divisão por zero.");
        }
    }
}