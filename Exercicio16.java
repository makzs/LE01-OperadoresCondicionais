// 6. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média aritmética. 
// Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83
import java.util.Scanner;

public class Exercicio16 {

    // ------------ Funções ------------

    public static String Media(double nota1, double nota2, double nota3){

        double valor = (nota1+nota2+nota3) / 3;
        String FormMedia = String.format("%.2f", valor);
        return FormMedia;
    }

    // ------------ Fim Funções ------------

    public static void Executar16(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = leitor.nextDouble();

        System.out.println("A media do aluno foi de: ");
        System.out.println(Media(nota1, nota2, nota3));

        leitor.close();
    }

}
