//Comparação de string e "calculadora"
package Uniso._java;
import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String operacao;
        double n1, n2;

        System.out.print("Escolha uma operação: (+, -, *, /) ");
        operacao = scanf.nextLine();
        System.out.print("Digite N1: ");
        n1 = scanf.nextDouble();
        System.out.print("Digite N2: ");
        n2 = scanf.nextDouble();

        if (operacao.equals("+")){
            System.out.println("\nO resultado é: "+ (n1 + n2));
        }
        else if (operacao.equals("-")){
            System.out.println("\nO resultado é: "+ (n1 - n2));
        }
        else if (operacao.equals("*")){
            System.out.println("\nO resultado é: "+ (n1 * n2));
        }
        else if (operacao.equals("/")){
            System.out.println("\nO resultado é: "+ (n1 / n2));
        }
        else{
            System.out.println("\nOperação inválida.");
        }
        scanf.close();
    }
}
