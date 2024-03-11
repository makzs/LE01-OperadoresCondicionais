// 2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba oresultado da sua soma.

import java.util.Scanner;

public class Exercicio02 {

    // ------------- Funcoes -------------

    public static double Soma(double x, double y)
    {
        return x+y;
    }

    // ------------- Fim Funcoes -------------
    
    public static void Executar02()
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double x = leitor.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double y = leitor.nextDouble();

        System.out.println("Soma dos numeros: ");
        System.out.println(Soma(x, y));

        leitor.close();
    }

}
