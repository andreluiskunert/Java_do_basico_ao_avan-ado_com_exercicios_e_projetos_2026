package secao05;
// Quinta-feira,23/04/2026_DE noite

public class Condicionais {
    public static void main(String[] args) {
        System.out.println("======Condicionais=====");
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);
        int x = 24;
         System.out.println(x == 24);

        System.out.println(x == 9);

        System.out.println(x != 5);

        System.out.println(x != 24);

        System.out.println(x > 24);
           // x é maior ou igual a 24
        System.out.println(x >=24 );

        // Sabado,25/04/2026_De mada 
        System.out.println("===Diferença entre comparação e atribuição===");
        System.out.println(x < 25);

        // x é menor ou igual 25
        System.out.println(x <= 25);

        // 3 - atribuição e comparação
        int n = 5;
        int m = 25;

        // System.out.println(n = 12);

        System.out.println(n == 12);

        System.out.println(n);

        System.out.println(n == m);

        System.out.println("==== Comparaçao de strings=====");

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);

        System.out.println(str1 == "Java");

        System.out.println(str1.equals(str2));

        System.out.println(str2.equals(str1));

        System.out.println(str1.equals("Java"));

        String str3 = "JAVA";

        System.out.println(str1.equals(str3));

        // Java == JAVA (false) > java == java
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println("===//====///====//============///============///===========///=====");
        System.out.println("Estruturas de condição: ");
        System.out.println(
                        "●if: Executa um bloco de código se a condição for verdadeira;\n" + //
                        "●else: Executa um bloco de código alternativo se a condição do if for falsa;\n" + //
                        "●else if: Verifica outra condição se as condições anteriores forem falsas;\n" + //
                        "●switch: Seleciona e executa um bloco de código entre várias opções com base no\n" + //
                        "valor de uma expressão;\n" + //
                        "●\n" + //
                        "Importante: Todas essas estruturas permitem controlar o fluxo de execução com base\n" + //
                        "em condições lógicas;"
                         );
        System.out.println("§ if :");
         int numero = 25;
         if (numero > 155) {
            System.out.println("O numero é maior que 5");
            
         }
         System.out.println(" If com strings");
         String texto = "Good Morning";
         if (texto.equals(texto)) {
             System.out.println("O texto é : " + texto);
         }
         System.out.println("obs.:   declaração do if (comparação ou retorno de booleano) { o que será executado... }");
         
        // // 6 - else
        // int q = 17;

        // if(q > 10) {
        //     System.out.println("Q é maior q 10");
        // } else {

        //     System.out.println("Insira um número maior que 10!");

        // }

        // // Tod o else precisa de um if, mas nem todo if precisa ter um else

        // if(texto.equals("Teste2")) {

        //     System.out.println("O texto é: Teste");

        // } else {

        //     System.out.println("O texto não é igual!");
        // }

        // // 7 - else if
        // double nota = 10;

        // if(nota == 10) {
        //     System.out.println("Você tirou a nota máxima, parabéns!");
        // } else if(nota >= 9) {
        //     System.out.println("Nota muito boa!");
        // } else if(nota >= 7) {
        //     System.out.println("Acima da média");
        // } else {
        //     System.out.println("Abaixo da média");
        // }

        // int num = 5;

        // if(num > 3 && num < 5) {
        //     System.out.println("Alguma coisa");
        // } else if(num == 5) {
        //     System.out.println("Outra coisa aqui!");
        // }

         System.out.println("======The End=====");
    }
}
