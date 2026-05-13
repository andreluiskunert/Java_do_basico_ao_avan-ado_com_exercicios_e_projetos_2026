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
        // Terça-feira,12/05/2026_De Noite
        System.out.println("Terça-feira,12/05/2026_De Noite {While } ");
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
        //   int valor = 0;
        //   while (valor != 7) {
        //     valor = ((int)Math.random() * 10);
        //     // System.out.println("valor aleatorio: " + valor + ";");
            
        //   }
        // loop infinito
        // System.out.println("loop infinito");
        // while (true) {
        //     System.out.println("Ao Infinito é além...");
        // }
        // for(int j = 0; j <= 5; j--){
        //     System.out.println(j);
        // }
        System.out.println("Do while");
        int j = 10;
        do{
        System.out.println("O valor de j é :" + 1);
         j--;
        } while(j > 0);
         int numero = 0;

        do {

            numero = (int)(Math.random() * 10);

            System.out.println("numero aleatorio: " + numero);

        } while (numero != 1);


     }
}
