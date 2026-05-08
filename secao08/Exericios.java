package secao08;
/*

    > Exercício 1: Função para Converter Temperatura

    Crie uma função que converta uma temperatura de Celsius para Fahrenheit. 
    A função deve receber a temperatura em Celsius como argumento 
    e retornar o valor correspondente em Fahrenheit. 
    Exiba o resultado encapsulado em uma variável.
    
    > Exercício 2: Função para Calcular o Fatorial de um Número

    Crie uma função que calcule o fatorial de um número inteiro. 
    Teste a função com um número de sua escolha.
    
    > Exercício 3: Função com if-else para Verificar Paridade

    Crie uma função que receba um número inteiro 
    e retorne uma string indicando se o número é "Par" ou "Ímpar". 
    Use condicionais if-else para determinar a paridade.
    
    > Exercício 4: Função com switch para Classificar Notas

    Crie uma função que receba uma nota de 0 a 10

    10 e 9: A, 8: B, 7: C, 6: D, restante F

    e retorne uma classificação de letra (A, B, C, D, F) usando um switch. 
    Inclua uma verificação para garantir que a nota está dentro do intervalo válido.
    
    > Exercício 5: Função com System.exit para Verificar Idade

    Crie uma função que receba a idade de uma pessoa. 
    Se a idade for menor que 18, use System.exit(0) 
    para encerrar o programa com uma mensagem de "Acesso negado". 
    Caso contrário, exiba "Acesso permitido".
    
    > Exercício 6 (Desafio): Função que Recebe um Array e Retorna o Maior Número

    Crie uma função que receba um array de inteiros 
    e retorne o maior número presente no array. 
    Utilize um loop para percorrer os elementos do array e identificar o maior valor.

*/
public class Exericios {
    public static void main(String[] args) {
        // Execuções
        System.out.println("ExercícioS");
        System.out.println("Ex.: 01");
        double celsius = 25.0;
        double fahrenheit = converterTemperatura(celsius);
        System.out.println("A temperatura de "+ celsius + "cº é equivamente a " + fahrenheit + " F;");
        System.out.println("Ex.: 02");
         System.out.println("O fatorial de 10 é: " + calcularFatorial(10));
    }
    // Funções
    public static double converterTemperatura(double celsius){
      return (celsius * 9/5) + 32;
    }
    public static int calcularFatorial(int numero) {

        if(numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }

    }
}
