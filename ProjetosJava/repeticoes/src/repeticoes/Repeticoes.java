package repeticoes;
import java.util.Random;
public class Repeticoes {

	public static void main(String[] args) {
		int x;
		Random generate = new Random();
		int number = generate.nextInt(60);
		System.out.println(number);
		
		int i = 0; 
		// Enquanto verdadeiro
		while(i <= 10) {
			System.out.println("Contador While -> " + i);
			i++; // Ou podemos utilizar i = i + 1;
		}
		
		
		// Para contador, enquanto estiver verdadeiro, incremente.
		for(int counter = 0; counter <= 6; counter++) {
			int nextNumber = generate.nextInt(100);
			if(counter == 6) {
				System.out.println(nextNumber);
			} else {
				System.out.print(""+nextNumber+" - ");
			}
		}
		
		
		// Faça enquanto estiver verdadeiro
		int y = 0;
		do {
			System.out.println("Contador DO -> " + y);
			y++;
		} while (y <= 10);
	}

}
