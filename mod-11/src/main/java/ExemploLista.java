import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ana.ssantos
 */
public class ExemploLista {

    public static void main(String[] args) {

        System.out.println("\n***** CRIANDO UMA LISTA DE NOMES E ORDENANDO EM ORDEM ALFABÉTICA *****");

        /*
        Instancia uma Lista de ArrayList
         */
        List<String> listaNomes = new ArrayList<>();

        /*
        Inicializa as variáveis
         */
        String nome1 = "Carolina";
        String nome3 = "Bruno";
        String nome2 = "Ana";
        String nome4 = "Douglas";

        /*
        Adiciona as variáveis na lista
         */
        listaNomes.add(nome1);
        listaNomes.add(nome2);
        listaNomes.add(nome3);
        listaNomes.add(nome4);

        /*
        Orderna os objetos populados em forma alfabética, não necessitando usar o médoto Split
         */
        Collections.sort(listaNomes);

        /*
        Imprime na tela:
        [Ana, Bruno, Carolina, Denise]
         */
        System.out.println(listaNomes);

        System.out.println("\n***** CRIANDO UMA LISTA DE NOMES & GÊNEROS *****");

        String grupoSexoFeminino = "Carolina-F,Ana-F";
        String grupoSexoMasculino = "Douglas-M,Bruno-M";

        var separaTexto1= grupoSexoFeminino.split(",");
        var separaTexto2= grupoSexoMasculino.split(",");

        Arrays.sort(separaTexto1);
        Arrays.sort(separaTexto2);

        System.out.println("Grupo feminino contém: " + (Arrays.toString(separaTexto1)));
        System.out.println("Grupo masculino contém: " + (Arrays.toString(separaTexto2)));
    }
}


