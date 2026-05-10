package secao09_ConversorTemperatura;
/**
 * Objetivo: Criar um conversor de Celsius para Fahrenheit e de Fahrenheit para Celsius
 * 
 * Etapas do projeto
 * 
 * 1 - Obter do usuário se ele quer conveter Celsius ou Fahrenheit
 * 2 - Criar duas funções, uma para cada conversão
 * 3 - Obter a temperatura em cada uma das funções escolhidas
 * 4 - Exibir uma mensagem com a temperatura, ex: De x C para y F
 */
import java.util.Scanner;
public class ConversorTemperatura {
    public static void main(String[] args) {
        System.out.println("Conversor Temperatura: ");
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
              System.out.println("C para F");
                converterCparaF();
        } else if (escolha == 2) {
            System.out.println("F pra C");
            converterFparaC();
        } else{
            System.out.println("Opção Inválida");
        }
        // 
        scanner.close();
        System.out.println("The End");
    }
    public static void converterCparaF(){
          Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");

        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "C convertido é igual a: " + fahrenheit + "F");

        scanner.close();   
    }
    public static void converterFparaC(){
           Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit: ");

        double fahrenheit = scanner.nextDouble();

        double  celsius = (fahrenheit - 32) * 5/9;

        System.out.println(fahrenheit + "F convertido é igual a: " + celsius + "C");

        scanner.close();

    }
}
