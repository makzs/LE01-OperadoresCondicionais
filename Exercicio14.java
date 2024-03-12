// 14. A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão Aritmética (PA). 
// Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),r é a razão e
// a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmoque encontre o n-ésimo termo 
// de uma progressão aritmética. Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28

import java.util.Scanner;

public class Exercicio14 {

    public static void Executar14()
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("Calculadora de progressões aritmeticas");
        System.out.println("-------------------------------------------");

        System.out.println("Informe o valor de a1: ");
        double a1 = leitor.nextDouble();

        System.out.println("Informe o valor de n: ");
        double n = leitor.nextDouble();

        System.out.println("Informe o valor de r: ");
        double r = leitor.nextDouble();

        double an = a1 + (n -1) * r;

        System.out.println("O n-ésimo termo da profressão é: " + an);

        leitor.close();

    }

}
