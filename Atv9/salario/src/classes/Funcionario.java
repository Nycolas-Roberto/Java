package classes;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;
    
    public void novoSalario(double novoSalario) {
        this.salario = novoSalario;
    }
    public void aumento(double pct) {
        this.salario = this.salario*(pct/100);
    }
    public double salarioLiquido() {
        return salario-imposto;
    }
    public void getSalario() {
        System.out.println("Salário Atual: " + this.salario);
    }
}
