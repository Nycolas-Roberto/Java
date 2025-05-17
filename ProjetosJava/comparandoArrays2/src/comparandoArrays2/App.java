package comparandoArrays2;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// 2. Comparando arrays 2
		int[] numbersC = new int[]{1,2,3};
		int[] numbersD = new int[]{1,2,3};
		System.out.println(numbersC == numbersD);
		System.out.println(numbersC.equals(numbersD));
		System.out.println(Arrays.equals(numbersC, numbersD));
	}

}
