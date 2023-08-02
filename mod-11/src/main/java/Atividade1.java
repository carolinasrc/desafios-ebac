import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ana.ssantos
 */
public class Atividade1 {

    public static void main(String[] args) {

        System.out.println("***** ATIVIDADE 1 *****");
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um nome: ");
        String input = scan.nextLine();

        var splitString = input.split(",");

        Arrays.sort(splitString);

        System.out.println("\n" + (Arrays.toString(splitString)));
        scan.close();

    }

}

