// Programa de cálculo de comissão para um vendedor
package Uniso._java;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        double salario, vendas, total;
        String n;

        System.out.print("Qual o nome do vendedor? ");
        n = scanf.nextLine();
        System.out.print("Qual o salário fixo de "+ n +"? ");
        salario = scanf.nextDouble();
        System.out.print("Qual o valor em vendas? ");
        vendas = scanf.nextDouble();

        total = salario + (vendas * 0.15);

        System.out.println("\nA comissão será de "+ (vendas * 0.15));
        System.out.println("O salário final de "+ n + " é igual a R$" + total);

        scanf.close();
    }
}
