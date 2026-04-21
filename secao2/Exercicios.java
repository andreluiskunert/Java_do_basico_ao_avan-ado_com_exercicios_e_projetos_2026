package secao2;
// Domingo, 19/04/2026_De noite
public class Exercicios {
    
// /*   
//     EXERCÍCIO 1:

//     Crie uma variável int para armazenar o valor 10. 
//     Crie uma segunda variável int que armazene o dobro do valor da primeira variável
//     usando operadores aritméticos. 
//     Exiba o resultado.

//     EXERCÍCIO 2:

//     Declare uma variável char que armazene a letra 'B'. 
//     Faça o casting explícito dessa variável para int e exiba o valor numérico correspondente.

//     EXERCÍCIO 3:

//     Declare duas variáveis double para armazenar os valores 15.75 e 20.40. 
//     Some os valores dessas variáveis e armazene o resultado em uma nova variável double. 
//     Exiba o resultado.

//     EXERCÍCIO 4:

//     Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000). 
//     Em seguida, declare uma variável int e faça o casting explícito do valor long para int. 
//     Exiba o resultado.

//     EXERCÍCIO 5:

//     Escreva um programa que crie uma variável String com o valor "Olá, Mundo!". 
//     Em seguida, crie outra variável String que concatene a primeira variável com o texto 
//     " Bem-vindo ao Java!". 
//     Exiba o resultado
public static void main(String[] args) {
    System.out.println("Exercicios");
    // Exer.01
    int valorOriginal = 12;
    int valorDobrado = valorOriginal * 2;
    System.out.println("O valorOriginal X 2 é:" + valorDobrado + ";" );
    // Exerc.02
    char letra = 'C';
    int valorAscii = (int) letra;
    System.out.println("O valor do C na tabela da ASCII é : " + valorAscii + ";");
    // Exerc.03
    double n1 = 373.75;
    double n2 = 645.40;
    double soma = n1 +n2 ;
    System.out.println("o valor da Alexa é: "+ n1 + "é o valor do tablete é : " + n2 +"Se somamos será de: " + soma + "R$;" );
    // Exerc.04
    long numeroGrandeSalarioDevCanada = 2_000_000_000l;
    int numeroInt = (int) numeroGrandeSalarioDevCanada;
    System.out.println("O salario de um dev no Canada é :"+ numeroInt + ";");
     // Ex 5
        String saudacao = "Boa Noite!";
        String mensagem = saudacao + " Bora La Cordar em  Java!";

        System.out.println("Sou Desenvolvedor Fulll Stack Java," +mensagem + ",trabalhar pra AWS com Dev Java ");
    
//   


}

}
