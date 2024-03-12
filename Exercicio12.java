// 12. Escreva um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido

import java.util.Scanner;

public class Exercicio12 {

    public static void Executar12()
    {   
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o numero que deseja saber o mês: ");
        int mes = leitor.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Esse Mês é Janeiro!");
                break;
            case 2:
                System.out.println("Esse Mês é Fevereiro!");
                break;
            case 3:
                System.out.println("Esse Mês é Março!");
                break;
            case 4:
                System.out.println("Esse Mês é Abril!");
                break;
            case 5:
                System.out.println("Esse Mês é Maio!");
                break;
            case 6:
                System.out.println("Esse Mês é Junho!");
                break;
            case 7:
                System.out.println("Esse Mês é Julho!");
                break;
            case 8:
                System.out.println("Esse Mês é Agosto!");
                break;
            case 9:
                System.out.println("Esse Mês é Setembro!");
                break;
            case 10:
                System.out.println("Esse Mês é Outubro!");
                break;
            case 11:
                System.out.println("Esse Mês é Novembro!");
                break;
            case 12:
                System.out.println("Esse Mês é Dezembro!");
                break;
        
            default:
            System.out.println("Mês invalido!");
                break;
        }

        leitor.close();
    }

}
