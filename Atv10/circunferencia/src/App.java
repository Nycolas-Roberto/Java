import java.util.Scanner;

import classes.Circunferencia;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia();
        System.out.print("Entre com o raio: ");
        double raio = scanner.nextDouble();
        c1.circunferencia(raio);
        c1.volume(raio);
        System.out.println("Valor de PI é: " + Math.PI);
        scanner.close();
    }
}
