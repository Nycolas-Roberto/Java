package sobrecarga;

public class App {

	public static void main(String[] args) {
		// Sobrecarga de métodos
		User user01 = new User("Nycolas", "Roberto");
		System.out.println(user01.output());
		
		System.out.println(user01.output(true));
		System.out.println(user01.output(false));
		System.out.println(user01.toString());
	}

}
