// 13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de operador em outra
// variável do tipo CARACTERE. Imprima o resultado da operação de A por B se o operador aritmético for
// válido; caso contrário deve ser impresso uma mensagem de operador não definido. 
// Tratar erro de divisão por zero.

import java.util.Scanner;

public class Exercicio13 {

    public static void Executar13(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Calculadora Console");
        System.out.println("--------------------------");

        System.out.println("Informe o primeiro valor da operação: ");
        int A = leitor.nextInt();

        System.out.println("Informe o segundo valor da operação: ");
        int B = leitor.nextInt();

        System.out.println("Informe o operador (+ - * /): ");
        char operador = leitor.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("A soma dos valores é: " + (A+B));
                break;
        
            case '-':
                System.out.println("A subtração dos valores é: " + (A-B));
                break;
        
            case '*':
                System.out.println("A multiplicação dos valores é: " + (A*B));
                break;
        
            case '/':
                if (A != 0 && B != 0){
                    System.out.println("A divisão dos valores é: " + (A/B));
                }
                else{
                    System.out.println("Operação invalida! não é possivel dividir por 0");
                }
                break;
        
            default:
            System.out.println("O operador informado é invalido!");
                break;
        }

        leitor.close();

    }
}
