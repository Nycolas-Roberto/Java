package praticando00;

public class Main {
	public static void main(String[] args) {
		meuMetodoImprime();
		Double n1 = 10.4;
		Double n2 = 30.1;
		some(n1,n2);
		
		verificarIdade(18);
		
		var login = "hi";
		System.out.println(login);
		
		String text;
		text = "TXT";
		System.out.println(text);
	}
	
	public static void meuMetodoImprime() {
		System.out.println("Ola mundo!");
	}
	public static void some(Double x, Double y) {
		System.out.println(x+y);
	}
	public static void verificarIdade(Integer idade) {
		if(idade != null) {
			if(idade >= 18) {
				System.out.println("Pode entrar, idade -> " + idade);
			} else {
				System.out.println("Não pode entrar, idade -> " + idade);
			}
		} else {
			System.out.println("Idade não informada!");
		}
	}
}
