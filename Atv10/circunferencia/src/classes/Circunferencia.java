package classes;

public class Circunferencia {
    public void circunferencia(double raio) {
        double circunferencia = 2 * Math.PI * raio;
        System.out.println("Circunferencia: " + circunferencia);
    }
    public void volume(double raio) {
        double volume = (4.0/3.0) * Math.PI * Math.pow(raio,3); // Math.pow serve para elevar o raio ao cubo
        System.out.println("O volume: " + volume);
    }
}
