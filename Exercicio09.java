// Leia dois números nas variáveis A e B e identifique se os valores são iguais oudiferentes. 
// Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.Caso sejam diferentes, 
// informe que são diferentes e qual número é o maior
import java.util.Scanner;

public class Exercicio09 {

    public static void Executar09()
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double a = leitor.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double b = leitor.nextDouble();

        if (a != b)
        {
            if (a > b){
                System.out.println("O valor " + a + " é maior que o valor " + b);
            }
            else{
                System.out.println("O valor " + b + " é maior que o valor " + a);
            }
        }
        else
        {
            System.out.println("Os valores " + a + " e " + b + " são iguais!");
        }

        leitor.close();
    }
}
