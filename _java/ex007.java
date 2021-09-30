//Programa de raíz quadrada
package Uniso._java;
import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.print("Valor de a: ");
        a = scanf.nextDouble();
        System.out.print("Valor de b: ");
        b = scanf.nextDouble();
        System.out.print("Valor de c: ");
        c = scanf.nextDouble();
        
        delta = Math.pow(b, 2) - 4*a*c;
        x1 = (Math.sqrt(delta)-b)/(2*a);
        x2 = (-Math.sqrt(delta)-b)/(2*a);

        if (delta < 0){
            System.out.println("\nNão existem raízes reais.");
        }
        else{
            System.out.println("\nA equação é: "+ a +"x² + "+ b +"x + "+ c);
            System.out.println("X1: "+ x1);
            System.out.println("X2: "+ x2);
        }
        scanf.close();
    }
}
