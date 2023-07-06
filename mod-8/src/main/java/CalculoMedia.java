public class CalculoMedia {

    public static void main(String[] args) {

        int nota1 = 5;
        int nota2 = 10;
        int nota3 = 3;
        int nota4 = 2;

        int notaFinal = nota1 + nota2 + nota3 + nota4 / 4;

        System.out.printf("Primeira nota é: " + nota1);
        System.out.printf("\nSegunda nota é: " + nota2);
        System.out.printf("\nTerceira nota é: " + nota3);
        System.out.printf("\nQuarta nota é: " + nota4);

        if (notaFinal >= 5) {
            System.out.printf("\nMédia final: \n" + notaFinal + "\nAluno aprovado!");
        } else {
            System.out.printf("\nMédia final \n: " + notaFinal + "\nAluno reprovado!");
        }
    }
}

