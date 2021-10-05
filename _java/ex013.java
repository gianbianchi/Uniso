/*  Faça um programa que calcule e mostre ao final a média aritmética de quantas notas forem informadas pelo usuário. A entrada de dados deverá terminar quando for lido um número negativo.*/
package Uniso._java;
import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        float nota=0f, soma=0f, media=0f;
        int i = 0;

        while (nota >= 0){
            System.out.print("Digite a "+ (i+1) +"° nota: ");
            nota = scanf.nextFloat();
            if (nota >= 0){
                soma = soma + nota;
                i++;
            }
        }
        media = soma / i;
        System.out.println("A media das " +i+ " notas foi: "+ media);
        
        scanf.close();
    }
}
