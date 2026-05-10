package secao3_tabuada;

import java.util.Scanner;

public class Tabauda_Loop {
    public static void main(String[] args) {
        System.out.println("Tabuada");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número que deseja ver a tabuada:");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
     
}
