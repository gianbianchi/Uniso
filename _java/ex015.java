package Uniso._java;
import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] vetor = new int[5];

        for(int i = 0; i<5; i++){
            System.out.printf("Qual o %d° valor? ", i + 1);
            vetor[i] = scanf.nextInt();
        }
        System.out.println("O vetor é: ");
        for (int item : vetor) {
            System.out.print(item + " ");
        }

        scanf.close();
    }
}
