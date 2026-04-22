package secao3;
// Projeto tabuada
// Receber um número pelo scanner, exibir a tabuada do mesmo
// Terça-feira,21/04/2026_De noite
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Tabuada");
        Scanner scanner = new Scanner(System.in);
          System.out.println("Informe o número que deseja ver a tabuada:");
          int numero = scanner.nextInt();
          System.out.println(numero + "x 1" + (numero * 1));
          System.out.println(numero + "x 2" + (numero * 2));
          System.out.println(numero + "x 3" + (numero * 3));
          System.out.println(numero + "x 4" + (numero * 4));
          System.out.println(numero + "x 5" + (numero * 5));
          System.out.println(numero + "x 6" + (numero * 6));
          System.out.println(numero + "x 7" + (numero * 7));
          System.out.println(numero + "x 8" + (numero * 8));
          System.out.println(numero + "x 1" + (numero * 9));
          System.out.println(numero + "x 1" + (numero * 10));

        scanner.close();
    }
}
