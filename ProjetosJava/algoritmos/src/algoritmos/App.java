package algoritmos;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int f1 = 0;
		int f2 = 1;
		int limit = input.nextInt();
		while (f2 < limit) {
			int fn = f1 + f2; /* 0+1 = 1; 1+1 = 2; 1+2 = 3; 2+3 = 5; 3+5 = 8...*/
			if(fn > limit) {
				break;
			}
			System.out.println(fn); /* 1, 2, 3,  */
			f1 = f2; /* O f1 vai passar a valer o último número do f2 que era 1. */
			f2 = fn; /* O f2 vai passar a valer o resultado da soma de f1 + f2 para dar sequência, no caso é 1 */
		}
		input.close();
	}

}
