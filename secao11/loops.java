package secao11;

public class loops {
   
        public static void main(String[] args) {
              // 1 - for

        // loop que vai rodar de 1 a 5

        // Variavel de inicializacao = i, j, k
        // Condição -> determina até quando ou quantas vezes, o loop vai rodar
        // incremento -> a variável vai chegar na condição
        for(int i = 0;i <= 5; i++){
          // repetir
            System.out.println("Contador: " + i);
         }

        // mostrar cada caractere de uma string
        String palavra = "Java";

        // length em strings da o numero de letras

        // arrays e strings a primeira posicao é o 0
        // J -> 0, a -> 3
        for(int i = 0; i < palavra.length(); i++) {

            // palavra.charAt(0) => palavra.charAt(1) ...
            // i < 4
            System.out.println("Caractere: " + palavra.charAt(i));

        }

        // contagem regressiva
        for(int i = 5; i > 0; i--) {
            System.out.println("Contador: " + i);
        }

        // 2 - While
        int i = 0;

        while(i <= 5) {

            System.out.println("While contador: " + i);
            // 
            // 
            // 
            // 
            // 

            i++;
        }
        }
}
