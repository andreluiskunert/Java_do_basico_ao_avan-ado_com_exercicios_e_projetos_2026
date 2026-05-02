package secao02;
import java.util.Scanner;

public class TesteScanner {
  
public static void main(String[] args) {
       System.out.println("-/-/-//====================================================================================" );
System.out.println("A classe Scanner");
// 1_Teste scanner
Scanner scanner = new Scanner(System.in);
System.out.println("Informe seu nome Completo pra cadastrado: ");
String nome = scanner.nextLine();
System.out.println("Complete o cadastro : " + nome + ";" );

// 2_Problema com NextLine
System.out.println("Informe sua idade:");
int idade = scanner.nextInt();
scanner.nextLine();
System.out.println("Informe seu email:");
String email  = scanner.nextLine();
System.out.println("Seu nome é : "+ nome +",você tem : " + idade + "anos, e-mail é  = " + email +";");



 // 2 - Problema do nextLine

        System.out.println("Digite um número: ");

        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite um texto: ");

        String txt = scanner.nextLine();

        System.out.println("Os dados são, n = " + n + " e txt = " + txt);
        
        scanner.close();
}
}
