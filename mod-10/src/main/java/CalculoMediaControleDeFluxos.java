import java.util.Scanner;

/**
 * @author ana.ssantos
 */
public class CalculoMediaControleDeFluxos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer nota1, nota2, nota3, nota4;
        Integer notaFinal, i;

        for (i = 0; i < 4; i++) {

            /*
             * Entrada das notas
             */
            System.out.println("\nDigite sua 1ª nota: ");
            nota1 = in.nextInt();

            System.out.println("\nDigite sua 2ª nota: ");
            nota2 = in.nextInt();

            System.out.println("\nDigite sua 3ª nota: ");
            nota3 = in.nextInt();

            System.out.println("\nDigite sua 4ª nota: ");
            nota4 = in.nextInt();

            /*
             * Calcula a média do aluno
             */
            notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A média do aluno foi ---> " + notaFinal);

            /*
             * Validação da média com condicional
             */
            while (notaFinal >= 7) {
                System.out.printf("A média foi: " + notaFinal + "\nAluno aprovado!");
                break;
            }
            while (notaFinal < 7) {
                System.out.printf("A média foi:  " + notaFinal + "\nAluno reprovado!");
                break;
            }
        }
    }
}


