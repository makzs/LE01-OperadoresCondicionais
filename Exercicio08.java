// 8. Escreva um algoritmo que leia um número e mostre uma mensagem caso estenúmero seja maior ou igual a 50, 
// outra se ele for menor que 50.

import java.util.Scanner;

public class Exercicio08 {

    public static void Executar08()
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int x = leitor.nextInt();

        if (x >= 50)
        {
            System.out.println("O numero é maior ou igual a50!");
        }
        else
        {
            System.out.println("O numero nao é maior que 50!");
        }

        leitor.close();
    }

}
