package calculadora;
// Soma, subtração, multiplicação e divisão
public class Calculadora {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		if (args[0].equals("somar")) {
			sum(x,y);
		} else if (args[0].equals("subtrair")) {
			subt(x,y);
		} else if (args[0].equals("multiplicar")) {
			mult(x,y);
		} else if (args[0].equals("div")) {
			div(x,y);
		} else {
			System.out.println("Nenhum método encontrado.");
		}
	}

	public static void sum(int x, int y) {
		System.out.println(x+y);
	}
	
	public static void subt(int x, int y) {
		System.out.println(x-y);
	}
	
	public static void mult(int x, int y) {
		System.out.println(x*y);
	}
	
	public static void div(int x, int y) {
		System.out.println(x/y);
	}
}
