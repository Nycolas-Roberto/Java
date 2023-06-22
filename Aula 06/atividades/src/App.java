public class App {
    public static void main(String[] args) throws Exception {
        // Atividade 01

        // A)
        String texto = "Teste";
        System.out.println(texto.length());


        // B)
        System.out.println(texto.toUpperCase());

        // C)
        String textoGrande = texto.toUpperCase();
        int vogais = 0;
        for(int c1 = 0; c1 < textoGrande.length(); c1++) {
            System.out.println(textoGrande.charAt(c1));
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
    }
}
