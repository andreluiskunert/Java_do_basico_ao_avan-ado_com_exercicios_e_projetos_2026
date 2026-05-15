package secao11;

//     > Exercício 1: Somatório com for

//     Crie um programa que use um loop for para calcular 
//     o somatório dos números de 1 a 100 e exiba o resultado.
//     1 + 2 + 3... = x
    
//     > Exercício 2: Impressão de Números Pares com while

//     Desenvolva um programa que use um loop while para imprimir 
//     todos os números pares de 1 a 20.
    
//     > Exercício 3: Verificação de Número Primo com for

//     Escreva um programa que receba um número do usuário 
//     e use um loop for para verificar se ele é primo.
    
//     > Exercício 4: Menu Interativo com do-while

//     Crie um programa que exiba um menu interativo usando do-while, 
//     permitindo ao usuário escolher opções até que ele decida sair.

//     // menu de opcoes com print: 1) comida 2) bebida
//     // um numero aleatorio que mediante a ser X, pare o loop
    
//     > Exercício 5: Fatorial de um Número com for

//     Desenvolva um programa que calcule o 
//     fatorial de um número inteiro positivo usando um loop for.

//     5 * 4 * 3 * 2 * 1

//     1 * 2 * 3 * 4 * 5
    
//     > Exercício 6: Contagem de Dígitos de um Número com while

//     Crie um programa que conte quantos dígitos há em um número inteiro positivo 
//     usando um loop while.

//     1000 = 4 digitos

public class Exercicios {
    public static void main(String[] args) {
        System.out.println("===Exercicios===");
        System.out.println("Ex.01");
        int somatorio = 0;
        for(int i = 0; i <= 100;i++){
            somatorio += i;
        }
        System.out.println("Soma de 1 a 100 é : " + somatorio + ";");
        System.out.println("===Exercicios===");
        System.out.println("Ex.02");
          int numero = 1;

        while(numero <= 20) {

            if(numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            }

            numero++;
        }
    }
     
}
