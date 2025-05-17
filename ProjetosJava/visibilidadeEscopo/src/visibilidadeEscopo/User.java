package visibilidadeEscopo;


public class User {
	public static void print()	{
		System.out.println("Hi, I come of User!");
	}
	private static void print2() {
		System.out.println("Hi, I not come of User. Because i am private class.");
	}
	public static void print3() {
		print2();
	}
	public static void main(String[] args) {
		print3();
	}
}
