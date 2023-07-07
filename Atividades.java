import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*
        System.out.println("Atividade 01");
        System.out.println("========================================================================");

        // A)
        String texto = "UNITesteRIO";
        System.out.println(texto.length());


        // B)
        System.out.println(texto.toUpperCase());

        // C)
        String textoGrande = texto.toUpperCase();
        int vogais = 0;
        for(int c1 = 0; c1 < textoGrande.length(); c1++) {
            if(textoGrande.charAt(c1) == 'A') {
                vogais++;
            } else if (textoGrande.charAt(c1) == 'E') {
                vogais++;
            } else if (textoGrande.charAt(c1) == 'I') {
                vogais++;
            } else if (textoGrande.charAt(c1) == 'O') {
                vogais++;
            } else if (textoGrande.charAt(c1) == 'U') {
                vogais++;
            } else {
                continue;
            }
        }
        System.out.println("O número de vogais da palavra " + textoGrande + " é: " + vogais);


        // D)
        if(texto.startsWith("UNI", 0)) {
            System.out.println("O texto começa com UNI? Sim.");
        } else {
            System.out.println("O texto começa com UNI? Não.");
        }


        // E)
        if(texto.endsWith("RIO")) {
            System.out.println("Termina com RIO? Sim.");
        } else {
            System.out.println("Termina com RIO? Não.");
        }

        // F)
        int qtdNumeros = 0;
        for(int c2 = 0; c2 < textoGrande.length(); c2++) {
            if(textoGrande.charAt(c2) == '0' ||textoGrande.charAt(c2) == '1' || textoGrande.charAt(c2) == '2' || textoGrande.charAt(c2) == '3' || textoGrande.charAt(c2) == '4' || textoGrande.charAt(c2) == '5' || textoGrande.charAt(c2) == '6' || textoGrande.charAt(c2) == '7' || textoGrande.charAt(c2) == '8' || textoGrande.charAt(c2) == '9') {
                qtdNumeros++;
            } else {
                continue;
            }
        }
        System.out.println("O números de dígitos de (0 a 9) é: " + qtdNumeros);


        // G)
        String palavra = "ana";
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        if(palavra.equals(palavraInvertida)) {
            System.out.println("A palavra " + palavra + ": é um palíndromo.");
        } else {
            System.out.println("A palavra " + palavra + ": não é um palíndromo.");
        }
        System.out.println("========================================================================");
*/






/* 
        System.out.println("Atividade 02");
        System.out.println("========================================================================");
        Scanner inNumero = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = inNumero.nextInt();
        String numeroExtenso = "";
        char[] caraceteres = Integer.toString(numero).toCharArray();
        for( char caracter : caraceteres) {
        switch (caracter) {
            case '0':
                numeroExtenso += "- zero ";
                break;
            case '1':
                numeroExtenso += "- um ";
                break;
            case '2':
                numeroExtenso += "- dois ";
                break;
            case '3':
                numeroExtenso += "- três ";
                break;
            case '4':
                numeroExtenso += "- quatro ";
                break;
            case '5':
                numeroExtenso += "- cinco ";
                break;
            case '6':
                numeroExtenso += "- seis ";
                break;
            case '7':
                numeroExtenso += "- sete ";
                break;
            case '8':
                numeroExtenso += "- oito ";
                break;
            case '9':
                numeroExtenso += "- nove ";
                break;
            default:
                numeroExtenso += "";
        }
        }

        System.out.println(numeroExtenso);
        inNumero.close();
        System.out.println("========================================================================");
*/

/*
    System.out.println("Atividade 03");
    System.out.println("========================================================================");
    Scanner inTexto = new Scanner(System.in);
    System.out.println("Digite um texto: ");
    String texto = inTexto.nextLine();
    String[] textoDivido = texto.split(" ");
    System.out.println("Quantidade de palavras: " + textoDivido.length);
    inTexto.close();
    System.out.println("========================================================================");
*/


/*
    System.out.println("Atividade 04");
    System.out.println("========================================================================");
    Scanner inNome = new Scanner(System.in);
    System.out.println("Digite o nome: ");
    String nome = inNome.nextLine().toUpperCase();
    String[] nomeDivido = nome.split(" ");
    String inicias = "";
    for(int c1 = 0; c1 < nomeDivido.length; c1++) {
        if(nomeDivido[c1] == "E" || nomeDivido[c1] == "DO" || nomeDivido[c1] == "DA" || nomeDivido[c1] == "DAS" || nomeDivido[c1] == "DE" || nomeDivido[c1] == "DI" || nomeDivido[c1] == "DU") {
            inicias += "";
        } else {
            inicias += " "+nomeDivido[c1].charAt(0);
        }
    }
    System.out.println(inicias);
    
    inNome.close();
    System.out.println("");
    System.out.println("========================================================================");
*/
    }
}
