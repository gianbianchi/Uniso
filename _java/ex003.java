// Kilometragem por litro
package Uniso._java;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        float n1, n2;

        System.out.print("Distância percorrida (Km): ");
        n1 = scanf.nextFloat();
        System.out.print("Litros de combustível: ");
        n2 = scanf.nextFloat();

        System.out.print("O consumo médio é: "+ (n1/n2) +" Km/L");
        scanf.close();
    }
}
