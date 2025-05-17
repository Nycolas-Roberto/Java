package manipulacaoString;

public class Manipulacao {

	public static void main(String[] args) {
		String frase = "Olá mundo! Estou aprendendo Java com Java    ";
		System.out.println(frase.length()); // Quantidade de caracteres da frase
		System.out.println(frase+" concatenado"); // Concatenar caracteres
		System.out.println(frase.contains(" Java")); // Verifica si existe uma certa sequência de caracteres
		System.out.println(frase.indexOf("mundo")); // Verificar o primeiro índice de onde começa determinada palavra, no caso começa no quarto índice
		System.out.println(frase.lastIndexOf("Java")); // Verifica o último índice de onde começa determinada palavra.
		System.out.println(frase.toUpperCase()); // Deixa tudo maiúsculo
		System.out.println(frase.toLowerCase()); // Deixa tudo minúsculo
		System.out.println(frase.trim()); // Remover espaços desnecessários no começo e fim de uma string
		System.out.println(frase.substring(10)); // Retorna a frase a partir de determinado índice
		System.out.println(frase.equals("mundo")); // Realiza uma comparação para ver si a frase é igual a "mundo"
		System.out.println(frase.equals("Olá mundo! Estou aprendendo Java com Java    "));
	}

}
