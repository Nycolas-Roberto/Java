import classes.Caneta;

public class Exemplo {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 1.2;
        c1.marca = "BIC";
        c1.carga = 1;
        c1.tampada = true;
        c1.destampar();
        c1.escrever();
        c1.status();
    }
}