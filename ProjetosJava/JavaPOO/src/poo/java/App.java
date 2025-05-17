package poo.java;

public class App {

	public static void main(String[] args) {
		User userA = new User(); // Instanciando um objeto;
		userA.firstName = "Nycolas";
		userA.lastName = "Roberto";
		
		User userB = new User();
		userB.firstName = "João";
		userB.lastName = "Lucas";
		
		System.out.println(userA.firstName);
		System.out.println(userB.firstName);
		
		Guitar fender = new Guitar();
		fender.name = "Fender";
		fender.chords = 6;
		
		Guitar ibanez = new Guitar();
		ibanez.name = "Ibanez";
		ibanez.chords = 6;
		System.out.println(fender.name);
		
		fender.play();
		ibanez.play();
		
		
		User userC = new User();
		userC.firstName = "Lucas";
		userC.lastName = "Martins";
		userC.setLogged(true);
		
		userC.setFullname(userC.firstName, userC.lastName);
		System.out.println(userC.getfullname());
		
		User userD = new User();
		
	}

}
