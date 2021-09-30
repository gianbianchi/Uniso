// Programa para calcular a soma de dois números

package Uniso._java;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner scanf = new Scanner(System.in);

        System.out.print("Qual o primeiro valor? ");
        n1 = scanf.nextInt();
        System.out.print("Qual o segundo valor? ");
        n2 = scanf.nextInt();
        
        n3 = n1 + n2;
        System.out.println("A soma dos valores é " + n3);
        scanf.close();
    }
}
    