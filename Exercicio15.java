// 15. Tendo como dados de entrada dois pontos quais quer no plano, 
// P1(x1, y1) e P2(x2,y2), calcule e retorne a distância entre eles. 
//A fórmula que efetua tal cálculo é: d = raiz(((x2 - x1)2) + ((y2 - y1)2)). 
// Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03
import java.util.Scanner;

public class Exercicio15 {

    public static void Executar15()
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o x da posição do primeiro ponto: ");
        double x1 = leitor.nextDouble();
        System.out.println("Informe o y da posição do primeiro ponto: ");
        double y1 = leitor.nextDouble();

        System.out.println("Informe o x da posição do segundo ponto: ");
        double x2 = leitor.nextDouble();
        System.out.println("Informe o y da posição do segundo ponto: ");
        double y2 = leitor.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("A distancia entre os dois pontos é de: " + distancia);

        leitor.close();
    }

}
