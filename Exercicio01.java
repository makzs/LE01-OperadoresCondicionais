// 1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a mensagem:
// “Número maior do que 10!”, caso este número seja maior, ou “Número menor ou igual a 10!”, 
// caso este número seja menor ou igual.
import java.util.Scanner;


public class Exercicio01{

    public static void Executar01()
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int x = leitor.nextInt();

        if (x > 10)
        {
            System.out.println("Numero Maior do que 10!");
        }
        else
        {
            System.out.println("Numero menor ou igual a 10!");
        }

        leitor.close();
    }

}