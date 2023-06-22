public class App {
    public static void main(String[] args) throws Exception {
        String nome1 = "Carlos";
        String nome2 = "Carlos";
        if(nome1.equals(nome2)) { // Fazer comparação com duas Strings.
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }


        if(nome1.equalsIgnoreCase(nome2)) { // Fazer comparação entre duas Strings ignorando letras maiusculas e minusculas
            System.out.println("São Iguais");
        } else {
            System.out.println("São diferentes");
        }


        /*
         ==
         equals
         compareTo
         */
        
    }
}
