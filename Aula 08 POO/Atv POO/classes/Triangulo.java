package classes;

public class Triangulo {
    public double l1;
    public double l2;
    public double l3;
    public double calcArea() {
        double p = (this.l1+this.l2+this.l3)/2;
        double area = Math.sqrt(p*(p-this.l1)*(p-this.l2)*(p-this.l3));
        return area;
    }
}
