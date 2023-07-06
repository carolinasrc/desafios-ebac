/**
 * @author ana.ssantos
 */
public class ConversaoPrimitivoParaWrapper {

    public static void main(String[] args) {

        /**
         * Declaração de variável do tipo primitivo
         */
        int valorPrimitivo = 5;
        System.out.printf("Valor primitivo: \n" + valorPrimitivo);

        /*
         * Conversão de tipo primitivo para Wrapper/Boxing
         */
        Integer valorConvertidoParaWrapper = Integer.valueOf(valorPrimitivo);
        System.out.printf("\nValor covertido em Wrapper: \n" + valorConvertidoParaWrapper);

    }
}

