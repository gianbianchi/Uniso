// Programa para efetuar soma de idade de n alunos
// E a média das idades
package Uniso._java;
import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int nAlunos, idade, soma = 0;
        double somaDouble, nalunosDouble;

        System.out.print("Digite o número de alunos: ");
        nAlunos = scanf.nextInt();

        for (int n = 0; n < nAlunos; n++){
            System.out.print("Qual a idade do "+ (n + 1) +"° aluno ? ");
            idade = scanf.nextInt();
            soma = soma + idade;
        }
        somaDouble = soma; nalunosDouble = nAlunos;

        System.out.println("A soma das idades é: "+ soma);
        System.out.println("A média das idades é: "+ (somaDouble/nalunosDouble));
        scanf.close();
    }
}
