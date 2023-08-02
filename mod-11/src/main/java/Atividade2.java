import java.util.Scanner;

/**
 * @author ana.ssantos
 */
public class Atividade2 {

    public static void main(String[] args) {

        System.out.println("***** ATIVIDADE 2 - FILTRA PESSOAS POR GÊNERO *****");
        System.out.println("***** EXEMPLO: Carolina Feminino, Carlos Masculino *****");
        System.out.println("\n Digite nome e gênero separando as pessoas por vírgula\n");

        Scanner scan = new Scanner(System.in);
        String input;
        String[] names = new String[6];
        String[] masculino = new String[6];
        String[] feminino = new String[6];

        input = scan.nextLine();
        names = input.split(",");

        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Masculino")){
                masculino[i] = names[i];
            } else {
                feminino[i] = names[i];
            }
        }

        System.out.println("\nLista de Pessoas do sexo Masculino:");
        for (int i = 0; i < masculino.length; i++){
            if (masculino[i] != null)
                System.out.println(masculino[i]);
        }

        System.out.println("\nLista de Pessoas do sexo Feminino:");
        for (int i = 0; i < feminino.length; i++){
            if (feminino[i] != null) {
                System.out.println(feminino[i]);
            }
        }
    }
}


