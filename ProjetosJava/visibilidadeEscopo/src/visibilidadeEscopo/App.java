package visibilidadeEscopo;
import visibilidadeEscopo.User;	// Classe User no mesmo pacote
import outroPacote.House;

public class App {
	
	static int x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x = 2;
		sum(10,10);
		
		User user = new User();
		user.print();
		
		House house = new House();
		house.print();
	}

	public static void sum(int a, int b) {
		System.out.println((a+b)*x);
	}
}
