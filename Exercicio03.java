import java.util.Scanner;

// 3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nasvariáveis A e B e 
// informe qual deles é o maior. Caso os números sejam iguais informarao usuário que a sequência de 
// números informados é inválida.

public class Exercicio03 {

    // ------------- Funcoes -------------

    public static void Comparar(double x, double y) {
        if (x > y) {
            System.out.println(x + " é maior que " + y);
        } else if (y > x) {
            System.out.println(y + "é maior que " + x);
        } else {
            System.out.println("a sequencia de numeros informados é invalida.");
        }
    }

    // ------------- Fim Funcoes -------------

    public static void Executar03(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double x = leitor.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double y = leitor.nextDouble();

        System.out.println("Comaparação dos numeros: ");
        Comparar(x, y);

        leitor.close();
    }

}
