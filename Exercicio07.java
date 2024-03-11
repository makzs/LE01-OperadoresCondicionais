// 7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, se este número está 
// no intervalo entre 100 e 200. Caso o número esteja fora do intervaloo usuário também 
// deverá ser informado.

import java.util.Scanner;

public class Exercicio07 {
    
    public static void Executar07()
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int x = leitor.nextInt();

        if ((x >= 100) && (x <= 200))
        {
            System.out.println("O numero esta no intervalo entre 100 e 200!");
        }
        else
        {
            System.out.println("O numero nao esta no intervalo entre 100 e 200!");
        }

        leitor.close();
    }

}
