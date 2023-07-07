package classes;

public class User {
    private double numero_da_conta;
    private String nome_do_titular;
    private double saldo;
    public double getSaldo() {
        return this.saldo;
    }
    public String getNome_titular() {
        return this.nome_do_titular;
    }
    public double getNumero_Conta() {
        return this.numero_da_conta;
    }
    public void setSaldo(double valor_depositar) {
        this.saldo += valor_depositar;
    }
    public void setNumero_Conta(double numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }
    public void setNome_titular(String nome_do_titular) {
        this.nome_do_titular = nome_do_titular;
    }

    public void saque(double valor_saque) {
        if(saldo >= valor_saque) {
            saldo -= 5;
            saldo -= valor_saque;
        } else {
            System.out.println("Você não tem esse valor.");
        }
    }
}
