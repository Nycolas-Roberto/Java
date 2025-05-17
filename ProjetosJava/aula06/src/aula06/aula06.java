package aula06;

public class aula06 {

	public static void main(String[] args) {
		// TIPOS DE ERROS
		// ERROS DE COMPILAÇÃO (É o erro de quando escrevemos errados)
		// varr texto = 10;
		
		// ERROS DE LÓGICA
		// int x = 10;
		// int y = 0;
		// System.out.println(x/y);
		
		double a = 10;
		double b = 20;
		calc(a, b);
	}
	
	public static void calc(Double x, Double y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x*y);
	}

}
