//6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
// A fórmula de conversão é: F = (9 * C + 160) / 5

import java.util.Scanner;

public class Exercicio06 {

    // ------------- Funcoes -------------

    public static double Conversor(double x)
    {
        return (9 * x + 160) / 5;
    }

    // ------------- Fim Funcoes -------------

    public static void Executar06()
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        double x = leitor.nextDouble();

        System.out.println("A temperatura " + x + " em Fahrenheit é: ");
        Conversor(x);

        leitor.close();
    }

}
