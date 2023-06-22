import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner inNum = new Scanner(System.in);
        Scanner inOper = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float n1 = inNum.nextFloat();
        System.out.println("Digite o segundo número: ");
        float n2 = inNum.nextFloat();
        System.out.println("Escolha o operador\n+\n-\nx\n/");
        String operador = inOper.nextLine();
        switch (operador) {
            case "+":
                float resultado = n1+n2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case "-":
                float resultadoM = n1-n2;
                System.out.println("Resultado da subtração: " + resultadoM);
                break;
            case "x":
                float resultadoX = n1*n2;
                System.out.println("Resultado da multiplicação: " + resultadoX);
                break;
            case "/":
                float resultadoD = n1/n2;
                System.out.println("Resultado da divisão: " + resultadoD);
                break;
            default:
                System.out.println("Erro ao reconhecer o operador!");
        }
        inNum.close();
        inOper.close();
    }
}
