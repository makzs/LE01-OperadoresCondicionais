// 4. Escreva um algoritmo que leia dois números e ao final mostre a 
// soma, subtração, multiplicação e a divisão dos números lidos.

import java.util.Scanner;

public class Exercicio04{

    // ------------- Funcoes -------------

    public static void Calculadora(double x, double y)
    {
        System.out.println("Soma: " + (x+y));
        System.out.println("Subtração: " + (x-y));
        System.out.println("Multiplicação: " + (x*y));
        System.out.println("Divisão: " + (x/y));
        
    }

    // ------------- Fim Funcoes -------------
    
    public static void Executar04()
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double x = leitor.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double y = leitor.nextDouble();

        System.out.println("Comaparação dos numeros: ");
        Calculadora(x, y);

        leitor.close();
    }

}