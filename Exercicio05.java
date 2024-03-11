// 5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valorda variável 
// A passe a ser o valor da variável B e o valor da variável B passe a ser ovalor da variável A. 
// Apresentar uma mensagem com o valor original de cada variávele outra com os valores trocados.

import java.util.Scanner;

public class Exercicio05 {

    public static void Executar05() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double x = leitor.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double y = leitor.nextDouble();

        System.out.println("Valores originais: ");
        System.out.println("Valor A: " + x + "\nValor B: " + y);

        double temp = x;
        x = y;
        y = temp;

        System.out.println("Valores trocados: ");
        System.out.println("Valor A: " + x + "\nValor B: " + y);


        leitor.close();
    }

}
