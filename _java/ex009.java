//Cálculo de média e análise de aprovação de um aluno.
package Uniso._java;
import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        double n1, n2, media;
        
        System.out.print("Digite a primeira nota: ");
        n1 = scanf.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = scanf.nextDouble();

        media = (n1 + n2)/2;

        if (media >= 6){
            System.out.println("\nO aluno está aprovado! Com a média "+ media);
        }
        else{
            System.out.println("\nO aluno está reprovado. Com a média "+ media);
        }
        scanf.close();
    }
}
