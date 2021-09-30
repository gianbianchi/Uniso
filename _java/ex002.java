// Programa para calcular soma, subtr, multip, e divisão entre dois números
package Uniso._java;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n1, n2;
        float divisao, a, b;

        System.out.print("Digite n1: ");
        n1 = scanf.nextInt();
        System.out.print("Digite n2: ");
        n2 = scanf.nextInt();

        //Fiz isso para dividir corretamente.
        a = n1; b = n2;
        divisao = (float)(a / b);

        System.out.println("\nA soma é: "+ (n1 + n2));
        System.out.println("A subtração é: "+ (n1 - n2));
        System.out.println("A multiplicação é: "+ (n1 * n2));
        System.out.println("A divisão é: "+ divisao);

        scanf.close();
    }
}
