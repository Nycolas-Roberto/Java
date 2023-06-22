import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        
        if(salarioBruto <= 900) {
            System.out.println("Desconto IR: " + salarioBruto);
            double salarioLiquido = salarioBruto - descontoSindicato;
            System.out.println("Seu salário Liquido: " + salarioLiquido);
        } else if (salarioBruto <= 1500) {
            double descontoIR = salarioBruto * 0.05;
            System.out.println("Desconto IR: " + descontoIR);
            double salarioLiquido = salarioBruto - descontoIR - descontoSindicato;
            System.out.println("Seu salário Liquido: " + salarioLiquido);
        } else if (salarioBruto <= 2500) {
            double descontoIR = salarioBruto * 0.01;
            System.out.println("Desconto IR: " + descontoIR);
            double salarioLiquido = salarioBruto - descontoIR - descontoSindicato;
            System.out.println("Seu salário Liquido: " + salarioLiquido);
        } else {
            double descontoIR = salarioBruto * 0.2;
            System.out.println("Desconto IR: " + descontoIR);
            double salarioLiquido = salarioBruto - descontoIR - descontoSindicato;
            System.out.println("Seu salário Liquido: " + salarioLiquido);
        }
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("FGTS: " + fgts);
        System.out.println("Desconto Sindicato: " + descontoSindicato);
        scanner.close();
    }
}
