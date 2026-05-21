package secao14;
//  Segunda-feira,18/05/2026_De noite
public class Listas {
    public static void main(String[] args) {
        System.out.println("tipos de Arrays: ");
        // 1 - Sintaxe:
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        // {elem1, elem2 elemX...}
        System.out.println("Acessando o 1ª elemento: " + numeros[0]);
        //  tamanho tixo, só que vázio
        String[] frutas = new String[3];
        //  0, 1 e 2 =>Add elementos
        // 3 => não tenho
         frutas[0] = "Maça";
         frutas[1] = "Bananas";
         frutas[2] = "Mamão";
        System.out.println(frutas[1]);
        // frutas[3] = "teste";
        double[] precos = {1.99, 2.45, 4.97};
        precos[2] = 5.00;
        System.out.println(precos[2]);
    //   Terça-feira,19/05/2026_De noite
    System.out.println("====///=====///=====///=====///=====///===");
    System.out.println("2_Loops em Arrays");
    int soma = 0;
    for(int i = 0; i < numeros.length; i++){
    // i > 0; i > 1; i > 2...
    soma += numeros[1];

    }
    System.out.println("Soma dos Elementos: " + soma + ";");
 // for each
        // Nomear o item => Array
        // Pessoas => Pessoa
        // Frutas => Fruta
        for(String fruta : frutas) {
            System.out.println("A fruta da vez: " + fruta);
        }

        // encontrar o maior valor de um array
        int[] valores = {17, 27, 877, 77, 1};

        int maiorValor = valores[0];

        int j = 0;

        while(j < valores.length) {

            if(valores[j] > maiorValor) {
                maiorValor = valores[j];
            }

            j++;

        }

        System.out.println("O maior valor é: " + maiorValor);
 System.out.println("====///=====///=====///=====///=====///===");

        System.out.println(" 3 - for each");
        // Quarta-feira,20/05/2026_De noite
        for(int numero : numeros){
            System.out.println("O numero é: " + numero + ";");
        }
         String[] palavras = {"Java", "é", "Legal!"};

        String frase = "";

        for(String palavra : palavras) {
            frase += palavra + " ";
        }

        System.out.println(frase);

        // verificar se valor esta presente em array
        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        char letraProcurada = 'o';

        for(char letra : letras) {

            if(letra == letraProcurada) {
                System.out.println("Encontramos a letra: " + letra + ";");
                break;
            }

        }
 System.out.println("====///=====///=====///=====///=====///===");
    System.out.println("4_loops com if");
     int somaPares = 0;
     for(int numero : numeros){
        if (numero % 2 == 0) {
            somaPares += numero;
        }
     }
    System.out.println("Soma Pares é : " + somaPares+ ";");
      // Exibir valores maiores que um determinado valor
        int[] nums = {12, 6, 18, 24, 48, 55, 3};

        int limite = 10;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > limite) {
                System.out.println("Numero maior encontado: " + nums[i]);
            }

        }

        String[] linguagens = {"Java", "C", "Python", "PHP", "mySQL"};

        String linguagemAlvo = "Python";

        for(String linguagem : linguagens) {

            if(linguagemAlvo == linguagem) {
                System.out.println("Linguagem encontrada! Parando o loop");
                break;
            } else {
                System.out.println("Linguagem ainda não encontrada!");
            }

        }
    }
}
