// aça um algoritmo que receba o raio e a altura de um cilindro e retorne o seuvolume calculado
//  de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura;
// Exemplo: raio = 10, altura = 15. Volume = 4710

import java.util.Scanner;

public class Exercicio19 {

    public static void Executar19(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor do raio do cilindro: ");
        int raio = leitor.nextInt();

        System.out.println("Informe o valor da altura do cilindro: ");
        int altura = leitor.nextInt();

        double volume = 3.14 * Math.pow(raio, 2) * altura;

        System.out.println("O volume desse cilidro é de: " + volume);

        leitor.close();
    }
    
}
