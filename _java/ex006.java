//Programa para calcular temperatura em Fahrenheit a partir de Celsius

package Uniso._java;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        float tempC, tempF;

        System.out.print("Digite a temperatura em Celsius: ");
        tempC = scanf.nextFloat();

        tempF = (9 * tempC + 160)/5;

        System.out.println("\nA temperatura em Fahrenheit é: "+ tempF + "°");
        scanf.close();
    }
}
