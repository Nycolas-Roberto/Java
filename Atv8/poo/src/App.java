import java.util.Scanner;

import classes.Produto;
public class App {
    public static void main(String[] args) throws Exception {
     ko   Produto p1 = new Produto();
        Scanner scanner = new Scanner(System.in);


        // Add produto
        System.out.printf("Digite o nome do produto -> ");
        String nome = scanner.nextLine();
        System.out.printf("Digite o preço do produto -> ");
        double preco = scanner.nextDouble();
        System.out.printf("Digite a quantidade em estoque do produto -> ");
        double quantidade = scanner.nextInt();

        System.out.println("=================================================");
        p1.nome = nome;
        p1.preco = preco;
        p1.quantidade = quantidade;



        p1.AdicionarProduto();
        p1.totalEstoque();
        p1.qtdEstoque();
        p1.removerProduto();


        scanner.close();
    }
}
