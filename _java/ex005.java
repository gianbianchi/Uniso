//Programa cálculo média de 3 notas

package Uniso._java;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        float n1, n2, n3, media;

        System.out.print("Primeira nota: ");
        n1 = scanf.nextFloat();
        System.out.print("Segunda nota: ");
        n2 = scanf.nextFloat();
        System.out.print("Terceira nota: ");
        n3 = scanf.nextFloat();

        media = (n1 + n2 + n3)/3;

        System.out.println("\nA média das notas é "+ media);
        scanf.close();
    }
}
