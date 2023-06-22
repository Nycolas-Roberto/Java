import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner inLang = new Scanner(System.in);
        System.out.println("Linguagens de programação");
        System.out.println("=============================");
        System.out.println("[1] - JS");
        System.out.println("[2] - PHP");
        System.out.println("[3] - PYTHON");
        System.out.println("=============================");
        System.out.print("Escolha uma linguagem de programação [1] - [2] - [3] -> ");
        int lang = inLang.nextInt();
/*         System.out.println(lang); */

         switch (lang) {
            case 1:
                System.out.println("JavaScript é uma linguagem de programação interpretada estruturada, de script em alto nível com tipagem dinâmica fraca e multiparadigma. Juntamente com HTML e CSS, o JavaScript é uma das três principais tecnologias da World Wide Web.");
                break;
            case 2:
                System.out.println("PHP é uma linguagem interpretada livre, usada originalmente apenas para o desenvolvimento de aplicações presentes e atuantes no lado do servidor, capazes de gerar conteúdo dinâmico na World Wide Web.");
                break;
            case 3:
                System.out.println("Python é uma linguagem de programação de alto nível, interpretada de script, imperativa, orientada a objetos, funcional, de tipagem dinâmica e forte. Foi lançada por Guido van Rossum em 1991.");
                break;
            default:
                System.out.println("[ERRO] - Opção não reconhecida!");
        } 

        inLang.close();
    }
}
