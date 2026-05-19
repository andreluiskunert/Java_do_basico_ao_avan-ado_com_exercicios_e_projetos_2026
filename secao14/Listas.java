package secao14;
//  Segunda-feira,18/05/2026_De noite
public class Listas {
    public static void main(String[] args) {
        System.out.println("tipos de Arrays: ");
        // 1 - Sintaxe:
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8};
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

    }
}
