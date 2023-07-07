import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        calc();
    }
    public static double calc() {
        Scanner entrada = new Scanner(System.in);
        double base, altura, areaRetangulo, areaTotal = 0;
        System.out.println("Informe a base do retangulo: ");
        base = entrada.nextDouble();
        System.out.println("Informe a altura do retangulo: ");
        altura = entrada.nextDouble();
        areaRetangulo = base*altura;
        System.out.println("A area do retangulo é: " + areaRetangulo);
        areaTotal += areaRetangulo;
        entrada.close();
        return(areaTotal);
    }
}
