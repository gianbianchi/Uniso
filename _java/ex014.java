/* Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.*/

package Uniso._java;
import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int i=0, nPessoas, idade;
        float soma=0f, media=0f;

        System.out.print("Quantas pessoas? ");
        nPessoas = scanf.nextInt();

        while (i < nPessoas){
            System.out.print("Qual a idade da "+ (i+1) +"° pessoa? ");
            idade = scanf.nextInt();
            
            if (idade >= 0){
                soma = soma + idade;
                i++;
            }
            else{
                System.out.println("Valor inválido, por favor digite novamente!");
            }
        }
        media = soma / nPessoas;

        if (media >= 0 & media <= 25){
            System.out.println("Com média igual a "+ media + ", a turma é jovem!");
        }
        else if (media >= 26 & media <= 60){
            System.out.println("Com média igual a "+ media + ", a turma é adulta!");
        }
        else{
            System.out.println("Com média igual a "+ media + ", a turma é velha!");
        }

        scanf.close();
    }
}
