// 18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média harmônica.
// Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8 Média: 7.37.

import java.util.Scanner;

public class Exercicio18 {

    // ------------ Funções ------------

    public static String MediaHarmonica(double nota1, double nota2, double nota3){

        double media = 3 / ((1 / nota1)+(1 / nota2)+(1 / nota3));
        String FormMedia = String.format("%.2f", media);
        return FormMedia;
    }

    // ------------ Fim Funções ------------
    
    public static void Executar18(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = leitor.nextDouble();

        System.out.println("A media do aluno foi de: ");
        System.out.println(MediaHarmonica(nota1, nota2, nota3));

        leitor.close();
    }

}
