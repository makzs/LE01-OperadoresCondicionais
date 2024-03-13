// 7. Elabore um algoritmo que receba três notas de um aluno os pesos referentes acada nota e 
// retorne a sua média ponderada. 
// Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2 Média ponderada = 8.25

import java.util.Scanner;

public class Exercicio17 {

    // -------------- Funções --------------

    public static String MediaPonderada(double[] notas, int[] pesos){

        double media = (notas[0] * pesos[0] + notas[1] * pesos[1] + notas[2] * pesos[2]) / (pesos[0] + pesos[1] + pesos[2]);
        String FormMedia = String.format("%.2f", media);
        return FormMedia;
    }

    public static void Linha(){
        System.out.println("--------------------------------------------------------------");
    }

    // -------------- Fim Funções --------------

    public static void Executar17(){
        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[3];
        int[] pesos = new int[3];

        Linha();

        System.out.println("Informe o valor do peso da primeira nota: ");
        pesos[0] = leitor.nextInt();

        System.out.println("Informe o valor do peso da segunda nota: ");
        pesos[1] = leitor.nextInt();

        System.out.println("Informe o valor do peso da terceira nota: ");
        pesos[2] = leitor.nextInt();

        Linha();

        System.out.println("(peso 5) Informe o valor da primeira nota: ");
        notas[0] = leitor.nextDouble();

        System.out.println("(peso 3) Informe o valor da segunda nota: ");
        notas[1] = leitor.nextDouble();

        System.out.println("(peso 2) Informe o valor da terceira nota: ");
        notas[2] = leitor.nextDouble();

        Linha();

        System.out.println("O valor da media ponderada do aluno é de: ");
        System.out.println(MediaPonderada(notas, pesos));

        Linha();

        leitor.close();
    }

}
