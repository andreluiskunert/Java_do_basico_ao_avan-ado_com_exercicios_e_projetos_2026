package secao4_media;
// Obter nome do aluno e 3 notas
// Exibir mensagem com nome e média final
// Bônus: Se a nota for maior ou igual a 7, imprimir Aprovado, se não: Reprovado
// quarta-feira,22/04/2026
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        System.out.println("Média de Aluno");
        Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a nota do Aluno:");
            String nome = scanner.nextLine();
            System.out.println(" informe a 1ª nota: ");
            double nota1 = scanner.nextDouble();
             System.out.println(" informe a 2ª nota: ");
            double nota2 = scanner.nextDouble();
             System.out.println(" informe a 3ª nota: ");
            double nota3 = scanner.nextDouble();
             System.out.println(" informe a 4ª nota: ");
            double nota4 = scanner.nextDouble();
         double media = (nota1 + nota2 + nota3 + nota4) / 4;
         System.out.println("O Aluno: " + nome + " sua media foi:" + media +";");
if (media >= 7.0) {
    System.out.println("Parabéns aprovado");
    
} else {
    System.out.println("Reprovado...se esforce mais nene");
}
        scanner.close();
    }
}
