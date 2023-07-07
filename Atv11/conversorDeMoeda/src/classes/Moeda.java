package classes;

public class Moeda {
    public double IOF = 0.06;
    public double conversaoMoeda(int quantidade, double valor) {
        return quantidade * valor * (1.0 + IOF);
    }
}
