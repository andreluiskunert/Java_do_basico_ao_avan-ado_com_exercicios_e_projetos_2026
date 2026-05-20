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

    }
}
