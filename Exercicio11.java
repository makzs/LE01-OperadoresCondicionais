// 11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em ordem crescente.
import java.util.Scanner;

public class Exercicio11 {

    // ---------- Funções ----------

        public static void bubblesort(int[] array)
        {
            for(int i = 0; i < array.length -1; i++){
                for(int j = 0; j < array.length - i - 1; j++)
                {   
                    if (array[j] > array[j + 1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }

        }

    // ---------- Fim Funções ----------

    public static void Executar11()
    {
        Scanner leitor = new Scanner(System.in);

        int[] valores = new int[3];

        System.out.println("Informe o primero valor: ");
        valores[0] = leitor.nextInt();

        System.out.println("Informe o segundo valor: ");
        valores[1] = leitor.nextInt();

        System.out.println("Informe o terceiro valor: ");
        valores[2] = leitor.nextInt();

        bubblesort(valores);

        System.out.println("Valores ordenados: ");

        for (int i = 0; i < valores.length; i++)
        {
            System.out.print(valores[i] + " ");
        }

        leitor.close();
    }

}
