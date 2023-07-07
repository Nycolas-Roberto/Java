import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        peso();
    }
    public static void peso() {
        Scanner inNome = new Scanner(System.in);
        Scanner inPeso = new Scanner(System.in);
        String[] nome = new String[2];
        double[] peso = new double[2];

        for(int c1 = 0; c1 < 2; c1++) {
            System.out.println("Digite o " + c1+1 + "° nome: ");
            nome[c1] = inNome.nextLine();
        }
        for(int c2 = 0; c2 < 2; c2++) {
            System.out.println("\nDigite o " + c2+1 + "° peso do " + c2+1 + "° nome: ");
            peso[c2] = inPeso.nextDouble();
            System.out.println(" ");
        }
        
        for(int c3 = 0; c3 < 1; c3++) {
            if(peso[c3] > peso[c3+1]) {
                System.out.println(peso[c3] + " É maior do que " + peso[c3+1] + " informado pelo " + c3+1 + "° usuário.\n");
            } else {
                System.out.println(peso[c3] + " É menor do que " + peso[c3+1] + " informado pelo " + c3+1 + "° usuário.\n");
            }
        }
        inNome.close();
        inPeso.close();
    }
}