package secao12_CalculadoraSimples;
/**
 * 
 * Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração
 * 
 * 1 - Pedir dois números para o usuário (double)
 * 2 - Apresentar uma tabela/texto para escolher a operação
 * 3 - Resgatar a operação que o usuário seleciou
 * 4 - Realizar o calculo
 * 5 - Exibir o resultado
 * 6 - Se a operação escolhida for inválida, exibir mensagem de erro
 * 7 - Se a divisão for por 0, exibir mensagem de erro
 * 
 */
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        System.out.println("Calculadora Simples");
        // Testar antes...
        // System.out.println(adicionar(2, 3));
        // System.out.println(subtrair(2, 3));
        // System.out.println(multiplicar(2, 3));
        // System.out.println(dividir(2, 3));


        Scanner scanner = new Scanner(System.in);
          System.out.println("Informe o primeiro número:");
          double num1 = scanner.nextDouble();
          System.out.println("Informe o segundo número:");
          double num2 = scanner.nextDouble();
          System.out.println("Escolha a operação:");
          System.out.println("01)Adição(+):");
          System.out.println("02)Subtração(-):");
          System.out.println("03)Multiplicação(*):");
          System.out.println("04)Divisão(/):");
        //   Resgatar operação
          int operacao = scanner.nextInt();
        //   System.out.println(num1);
        //   System.out.println(num2);
        //   System.out.println(operacao);
         double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = adicionar(num1, num2);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:

                if(num2 != 0) {
                    resultado = dividir(num1, num2);
                } else {
                    System.out.println("Divisão por 0 não permitida!");
                    scanner.close();
                    return;
                }

                break;
        
            default:
                System.out.println("Operação inválida!");
                scanner.close();
                return;
        }
        System.out.println("O resultado da operação é :" + resultado +";");
          System.out.println("End The");
        scanner.close();

    }
    public static double adicionar(double a, double b) {
        return a + b;

    }
       public static double subtrair(double a, double b) {
        return a - b;
        
    }
       public static double multiplicar(double a, double b) {
        return a * b;
        
    }
       public static double dividir(double a, double b) {
        return a / b;
        
    }
}
