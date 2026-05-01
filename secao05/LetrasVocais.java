package secao05;
import java.util.Scanner;
public class LetrasVocais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma letra:");
        char letra = scanner.next().toLowerCase().charAt(0);
switch (letra) {
    case 'a':
        System.out.println("Vogal A");
        System.out.println("Digite um valor para A:");
        int valorA = scanner.nextInt();
        System.out.println("Valor A: " + valorA);
        break;

    case 'e':
        System.out.println("Vogal E");
        System.out.println("Digite um valor para E:");
        int valorE = scanner.nextInt();
        System.out.println("Valor E: " + valorE);
        break;

    case 'i':
        System.out.println("Vogal I");
        System.out.println("Digite um valor para I:");
        int valorI = scanner.nextInt();
        System.out.println("Valor I: " + valorI);
        break;

    case 'o':
        System.out.println("Vogal O");
        System.out.println("Digite um valor para O:");
        int valorO = scanner.nextInt();
        System.out.println("Valor O: " + valorO);
        break;

    case 'u':
        System.out.println("Vogal U");
        System.out.println("Digite um valor para U:");
        int valorU = scanner.nextInt();
        System.out.println("Valor U: " + valorU);
        break;

    default:
        System.out.println("Consoante");
        break;
}
scanner.close();
    }
}
