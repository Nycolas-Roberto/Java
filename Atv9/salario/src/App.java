import classes.Funcionario;
public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario();
        f1.nome = "Nycolas";
        f1.salario = 6000;
        f1.imposto = 1000;
        f1.getSalario();
        f1.salarioLiquido();
        f1.novoSalario(5000);
        f1.aumento(300);
        f1.getSalario();
    }
}
