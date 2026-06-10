package secao19_CadastroAunosP;
// Segunda-feira,08/06/2026_D'noite
import java.util.Scanner;
public class Aluno1 {
    /* Scanner scanner = new Scanner(System.in);
    scanner.close;
     */
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno1(String nome, String matricula, int numeroDeNotas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[numeroDeNotas];

    }
    public String getNome() {
        return nome;
    }
     public void adicionarNotas(Scanner scanner) {

        System.out.println("Digite as notas para o aluno " + nome + ":");

        for(int i = 0; i < notas.length; i++) {

            System.out.println("Digite a nota " + (i + 1) + ":");

            notas[i] = scanner.nextDouble();

        }
    }

    public double calcularMedia() {
        double soma = 0;

        for(double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;

    }

  
    public void exibirResultado() {

        double media = calcularMedia();

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Média final: " + media);

        if(media >= 6.0) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }

    }

}
