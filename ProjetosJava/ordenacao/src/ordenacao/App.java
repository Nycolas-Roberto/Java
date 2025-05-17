package ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		int[] numbers = new int[] {
				10,
				30,
				20,
				90,
				40,
				1,
				2,
				5,
				9,
		};
		System.out.println(numbers); // <-- Hashcode do objeto, é o identificador do objeto
		
		Arrays.sort(numbers);
		for(int a = 0; a < numbers.length; a++) {
			System.out.println(numbers[a]);
		}
		
		/* Ou usamos outra forma de imprimir o array */
		System.out.println(Arrays.toString(numbers));
		
		List<String> names = new ArrayList<>();
		names.add("Nome 3");
		names.add("Nome 4");
		names.add("Nome 1");
		names.add("Nome 2");
		
		Collections.sort(names); // Ordena a lista
		// Foreach, especificamos o elemento de retorno (name) e indicamos de onde o retorno vêm (Lista names)
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
