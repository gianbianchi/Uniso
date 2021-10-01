package Uniso._java;
import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int idade = 0, inter0_25 = 0, inter26_50 = 0, inter51_75 = 0, inter76_100 = 0;

        while (idade >= 0){
            System.out.print("Digite um número inteiro positivo: ");
            idade = scanf.nextInt();

            if (idade >= 0 & idade <= 25){
                inter0_25++;
            }
            else if (idade >= 26 & idade <= 50){
                inter26_50++;
            }
            else if (idade >= 51 & idade <= 75){
                inter51_75++;
            }
            else if (idade >= 76 & idade <= 100){
                inter76_100++;
            }
            else{
                System.out.println("\nValor fora do intervalo.");
            }
        }

        System.out.println("\nA quantidade de números no intervalo [0-25] "+ inter0_25);
        System.out.println("\nA quantidade de números no intervalo [26-50] "+ inter26_50);
        System.out.println("\nA quantidade de números no intervalo [51-75] "+ inter51_75);
        System.out.println("\nA quantidade de números no intervalo [76-100] "+ inter76_100);

        scanf.close();
    }
}
