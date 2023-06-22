import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;



public class App {
    public static void main(String[] args) throws Exception {
/*      Scanner inNum = new Scanner(System.in); // Recepção do conteúdo
        System.out.println("Digite um número para encontrar: ");
        int numDigitado = inNum.nextInt();
        int num[] = {5,9,7,4,2};
        Arrays.sort(num); // Organizar o vetor de forma crescente
        int p = Arrays.binarySearch(num, numDigitado); // Encontrar a posição do valor dentro do vetor
        if(p >= 0) {
            System.out.println("Encontrei o valor na posição: " + p);
        } else {
            System.out.println("Valor não encontrado!");
        }
        inNum.close(); 
*/

/*
        int num [] = new int[5];
        int numeros [] = new int[5];
        final int tam = 5;
        Arrays.fill(num, 10);

        System.arraycopy(num, 0, numeros, 0, tam);
        for(int n : numeros) {
            System.out.printf("%d - ", n);
        }
*/
/*  
        int[] num1 = {0,1,2,3,4,5,6,7,8,9};
        int[] num2 = {0,1,2,3,4,5,6,7,8,9};
        int[] num3 = {9,8,7,6,5,4,3,2,1,0};
        int[] num4 = {9,8,7,6,5,4,3,2,1,0};
        System.out.printf("Num1 = num2: %s", Arrays.equals(num1, num2)?"Iguais\n":"Diferentes\n");
        System.out.printf("Num1 = num3: %s", Arrays.equals(num1, num3)?"Iguais\n":"Diferentes\n");
        System.out.printf("Num1 = num4: %s", Arrays.equals(num1, num4)?"Iguais\n":"Diferentes\n");
        System.out.printf("Num2 = num3: %s", Arrays.equals(num2, num3)?"Iguais\n":"Diferentes\n");
        System.out.printf("Num2 = num4: %s", Arrays.equals(num2, num4)?"Iguais\n":"Diferentes\n");
        System.out.printf("Num3 = num4: %s", Arrays.equals(num3, num4)?"Iguais\n":"Diferentes\n");
*/




//================================================================================================================================================
/*      
        ATIVIDADE 01
        int numeros[] = new int[50];
        for(int n = 0; n < numeros.length; n++) {
            numeros[n] = n + 101;
        }
        for(int numero : numeros) {
            System.out.println(numero);
        }
*/
//================================================================================================================================================




//================================================================================================================================================
/*
        Scanner inAluno = new Scanner(System.in);
        Scanner inNota = new Scanner(System.in);

        String alunosNomes[][] = new String[5][3];
        int alunosMedia[][] = new int[5][3];

        int aprovados = 0;
        int acimaDaMedia = 0;


        // Entrada de dados
        for(int c1 = 1; c1 < alunosNomes.length; c1++) {
            System.out.println("Preencha o nome do " + c1 + "° Aluno: ");
            String nomeAluno = inAluno.nextLine();
            alunosNomes[c1] = nomeAluno;
            for(int c2 = 1; c2 <= 3; c2++) {
                System.out.println("Preencha a nota do " + c2 + " trimetre do aluno " + nomeAluno +":");
                int notaAluno = inNota.nextInt();
                alunosMedia[c2] = notaAluno;
            }
        }


        // Cálcular média
        for(int c3 = 0; c3 < alunosNomes.length; c3++) {
            int soma = 0;
            for(int c4 = 0; c4 < 3; c4++) {
                soma += alunosMedia[c3];
            }
            alunosMedia[c3] = soma / 3;
        }


        // Verificação de alunos aprovados e acima da média
        for(int c5 = 0; c5 < alunosNomes.length; c5++) {
            if(alunosMedia[c5] >= 7) {
                aprovados++;
            }
            int mediaTurma = 0;
            for(int c6 = 0; c6 < 5; c6++) {
                mediaTurma += alunosMedia[c6];
            }
            mediaTurma /= 5;
            if(alunosMedia[c5] > mediaTurma) {
                acimaDaMedia++;
            }
        }


        // Saída de dados
        System.out.println("Resultados abaixo");
        System.out.println("==========================");
        for(int c7 = 0; c7 < 5; c7++) {
            System.out.println("Aluno: " + alunosNomes[c7] + ", Média: " + alunosMedia[c7]);
            System.out.println("------------------");
        }
        System.out.println("==========================");
        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos acima da média: " + acimaDaMedia);
        inAluno.close();
        inNota.close();
*/


//================================================================================================================================================


/* 
        ATIVIDADE 3
        int numeros[] = new int[15];
        int numerosPares[] = new int[15];
        int numerosMais50[] = new int[15];
        Random random = new Random();
        
        // Entrada de dados
        for(int c1 = 0; c1 < numeros.length; c1++) {
            numeros[c1] = random.nextInt(0,100);
        }
        

        // Numeros Pares
        for(int c2 = 0; c2 < numeros.length; c2++) {
            if(numeros[c2] % 2 == 0) {
                numerosPares[c2] = numeros[c2];
            }
        }

        // Valor acima de 50
        for(int c3 = 0; c3 < numeros.length; c3++) {
            if(numeros[c3] > 50) {
                numerosMais50[c3] = numeros[c3];
            }
        }



        // Mostrar na ordem em que foi sorteado
        System.out.println("Números em ordem que foi sorteado.");
        for(int c4 = 0; c4 < numeros.length; c4++) {
            System.out.println(numeros[c4]);
        }
        System.out.println("============================");



        // Mostrar números em ordem crescente
        System.out.println("Números em ordem crescente");
        Arrays.sort(numeros);
        for(int c5 = 0; c5 < numeros.length; c5++) {
            System.out.println(numeros[c5]);
        }
        System.out.println("============================");




        // Mostrar numeros maiores que 50
        System.out.println("Números maiores que 50");
        for(int c6 = 0; c6 < numerosMais50.length; c6++) {
            System.out.println(numerosMais50[c6]);
        }
        System.out.println("============================");




        // Mostar números pares
        System.out.println("Números Pares");
        for(int c7 = 0; c7 < numerosPares.length; c7++) {
            System.out.println(numerosPares[c7]);
        }
*/


//================================================================================================================================================


/*      
        ATIDADE 04
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {
                "Qual é a capital do Brasil?",
                "Qual é a fórmula química da água?",
                "Quem pintou a Mona Lisa?",
                "Qual é a maior montanha do mundo?",
                "Quem é o autor de 'Dom Quixote'?"
        };
        String[] opcoes = {
                "a) São Paulo  b) Rio de Janeiro  c) Brasília  d) Salvador",
                "a) CO2  b) H2O  c) O2  d) N2",
                "a) Pablo Picasso  b) Leonardo da Vinci  c) Vincent van Gogh  d) Salvador Dalí",
                "a) Monte Everest  b) Montanha da Mesa  c) Monte Kilimanjaro  d) Montanha K2",
                "a) Machado de Assis  b) Fernando Pessoa  c) Miguel de Cervantes  d) William Shakespeare"
        };
        String[] respostasCorretas = {"c", "b", "b", "a", "c"};
        String[] respostasUsuario = new String[perguntas.length];
        int pontuacao = 0;

        System.out.println("Bem-vindo ao jogo de perguntas e respostas!");

        // Apresentação das perguntas e coleta das respostas
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("\nQuestão " + (i + 1) + ":");
            System.out.println(perguntas[i]);
            System.out.println(opcoes[i]);
            System.out.print("Escolha a opção correta: ");
            String resposta = scanner.nextLine().toLowerCase();

            while (!validarResposta(resposta)) {
                System.out.println("Resposta incorreta! Digite a letra correspondente à opção correta.");
                System.out.print("Escolha novamente: ");
                resposta = scanner.nextLine().toLowerCase();
            }

            respostasUsuario[i] = resposta;
            if (resposta.equals(respostasCorretas[i])) {
                pontuacao++;
            }
        }

        // Resultados e feedback
        System.out.println("\n=== Resultados ===");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Questão " + (i + 1) + ": Resposta do usuário: " + respostasUsuario[i]
                    + " - " + (respostasUsuario[i].equals(respostasCorretas[i]) ? "Correta" : "Incorreta"));
        }

        double notaFinal = (double) pontuacao / perguntas.length * 10;
        System.out.println("Nota final: " + notaFinal);

        if (pontuacao == perguntas.length) {
            System.out.println("Parabéns! Você acertou todas as questões!");
        }

        scanner.close();
        }

        public static boolean validarResposta(String resposta) {
        return resposta.equals("a") || resposta.equals("b") || resposta.equals("c") || resposta.equals("d");
        } */

    }
}
