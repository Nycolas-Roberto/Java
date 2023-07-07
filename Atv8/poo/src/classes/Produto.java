package classes;


public class Produto {
    public String nome;
    public double preco;
    public double quantidade;
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidade = 0;
    }
    
    public void AdicionarProduto() {
        this.quantidade += this.quantidade;
    }


    public void totalEstoque() {
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
        System.out.println(this.quantidade + " Unidade");

        System.out.println("Total: $" + this.quantidade*this.preco);
    }


    public void qtdEstoque() {
        if(this.quantidade > 0) {
            System.out.println("A quantidade do produto em estoque é -> " + this.quantidade);
        } else {
            System.out.println("Nenhum produto cadastrado.");
        }
    }


    public void removerProduto() {
        if(this.nome.length() > 0 && this.preco > 0 && this.quantidade > 0) {
            this.nome = "";
            this.preco = 0;
            this.quantidade = 0;
            System.out.println("Produto removido do estoque!");
        } else {
            System.out.println("Não existe nenhum produto para remover!");
        }
    }
}