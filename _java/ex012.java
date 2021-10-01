// Calcular a média de 5 notas de um aluno
//    Exibir se ele está aprovado (media >= 6)
//    Se ele está em recuperação (3 >= media < 6)
//    Se ele está reprovado (media < 3)

package Uniso._java;
import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        double nota, soma=0;

        for (int i=0; i<5; i++){
            System.out.print("Qual a "+ (i + 1) +"° nota do aluno? ");
            nota = scanf.nextDouble();

            soma = soma + nota;
        }
        if ((soma/5) >= 6){
            System.out.println("\nAluno aprovado! Com média "+ (soma/5));
        }
        else if ((soma/5) >= 3 & (soma/5) < 6){
            System.out.println("\nAluno recuperação! Com média "+ (soma/5));
        }
        else{
            System.out.println("\nAluno reprovado! Com média "+ (soma/5));
        }
        scanf.close();
    }
}
