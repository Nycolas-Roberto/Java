package classes;

public class Caneta {
    public String cor;
    public double ponta;
    public String marca;
    public int carga;
    public boolean tampada;
    
    public void escrever() {
        if(tampada == true) {
           System.out.println("Caneta está tampada!");
        } else {
            if(carga >= 10) {
                System.out.println("Escrevendo na tela!");
            } else {
                System.out.println("Caneta sem tinta!");
            }
        }
    }
    public void destampar() {
        if(tampada == true) {
            tampada = false;
        } else {
            System.out.println("Caneta já está destampada");
        }
    }
    public void tampar() {
        if(tampada == true) {
            System.out.println("Caneta já está tampada");
        } else {
            tampada = true;
        }
    }
    public void desenhar() {
        if(tampada == true) {
           System.out.println("Caneta está tampada!");
        } else {
            if(carga >= 1) {
                System.out.println("Desenhando na tela!");
            } else {
                System.out.println("Caneta sem tinta!");
            }
        }
    }
    public void status() {
        System.out.println(
            "Cor: " + this.cor + "\n" +
            "Ponta: " + this.ponta + "\n" +
            "Marca: " + this.marca + "\n" +
            "Carga: " + this.carga + "\n" +
            "Tampada? " + this.tampada + "\n"
        );
    }
}
