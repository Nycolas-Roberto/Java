import java.util.Scanner;

import classes.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        
        
        // Entrada de dados
        System.out.println("CADASTRAR SUA CONTA NO BANCO");
        System.out.println("=======================================");
        System.out.print("Digite o número da conta -> ");
        double numero_da_conta = sc.nextDouble();
        user.setNumero_Conta(numero_da_conta);
        System.out.println(" ");
        System.out.printf("Nome do titular -> ");
        String nome_do_titular = sc.next();
        user.setNome_titular(nome_do_titular);
        System.out.println(" ");
        System.out.print("Deseja realizar seu primeiro depósito [1/0]? ");
        double opcao_depositar = sc.nextDouble();
        // Se quiser depositar
        if(opcao_depositar == 1) {
            System.out.print("Qual o valor que você deseja depositar? ");
            double valor_depositar = sc.nextDouble();
            user.setSaldo(valor_depositar);

        }
        

        // Exibir dados da conta
        System.out.printf("Dados da conta: \n" 
        + "Conta " + user.getNumero_Conta()
        + ", Titular: " + user.getNome_titular()
        + ", Saldo: $" + user.getSaldo()
        + "\n"
        );


        // Depositar
        System.out.println("=======================================");
        System.out.print("Informe o valor para depósito -> ");
        double valor_depositar2 = sc.nextDouble();
        user.setSaldo(valor_depositar2);
        System.out.printf("Dados da conta atualizados: \n"
        + "Conta " + user.getNumero_Conta()
        + ", Titular: " + user.getNome_titular()
        + ", Saldo: $" + user.getSaldo()
        + "\n"
        );




        // Saque
        System.out.println("=======================================");
        System.out.print("Informe o valor para saque -> ");
        double valor_saque = sc.nextDouble();
        user.saque(valor_saque);



        // Exibir dados da conta
        System.out.println("=======================================");
        System.out.printf("Dados da conta atualizados: \n"
        + "Conta " + user.getNumero_Conta()
        + ", Titular: " + user.getNome_titular()
        + ", Saldo: $" + user.getSaldo()
        + "\n"
        );
        sc.close();
    }
}
