//20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta emuma viagem, 
// utilizando um automóvel que faz 12km por litro e considerando que são fornecidos o 
// tempo em hora e a velocidade média da viagem.

import java.util.Scanner;

public class Exercicio20 {

    public static void Executar20(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a velocidade em km/h do automovel: ");
        int velocidade = leitor.nextInt();

        System.out.println("Informe o tempo em hora da viagem: ");
        int tempo = leitor.nextInt();

        int consumo = (velocidade * tempo) / 12;

        System.out.println("A quantidade de combustivel consumida foi de " + consumo + "l");

        leitor.close();
    }

}
