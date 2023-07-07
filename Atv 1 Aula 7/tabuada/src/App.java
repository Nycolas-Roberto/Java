import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        tabuada();
    }
    public static void tabuada() {
        Scanner inNumero = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = inNumero.nextInt();
        for(int c1 = 0; c1 <= 10; c1++) {
            System.out.println(c1+"x"+numero+"="+numero*c1);
        }
        inNumero.close();
    }
}
