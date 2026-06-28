package secao21;
// Quinta-feira, 25/062026_D'noite
import java.io.*;//Sábado,27/06/2026_d'noite
public class Erros {
   
    public static void main(String[] args) {
        // try catch
        System.out.println("01_try catch");
        try{
            int a = 0;
            int b = 10;
            int resultado = b / a;

        } catch(ArithmeticException e ){
            System.out.println("Divisão por 0 não é possivel");
        }try {
            int[] numerosm= {1,2,3};
        } catch (Exception error) {
             System.out.println("Erro Genérico");
             System.out.println("Msg: "+ error.getMessage());
        }
        System.out.println("===//=====//========//=====");
        // Sexta-feira,26/06/2026_d'noite
        System.out.println("02_Bloco finaly");
        try {
            int[] numeros = {1,2,3};
            System.out.println(numeros[3]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Erro genético");
            System.out.println("Msg: " + error.getMessage());

        } finally{
            System.out.println("Executou o finaly");
        }
        System.out.println("===//=====//========//=====");
        // Sábado,27/06/2026_d'noite
        System.out.println("03_verificadas e nao verificadas:");
        // 
        System.out.println("03_01Verificada:");
          try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
     System.out.println("03_02Não_verificada:");
      // não verificadas
        String texto = null;

        // System.out.println(texto.length());
          System.out.println("===//=====//========//=====");
        // Sábado,27/06/2026_d'noite
        System.out.println("04_exceções_com_throw:");
 try {   

            validarIdade(20);
            
            validarIdade(10);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
              System.out.println("===//=====//========//=====");
        // Sábado,27/06/2026_d'noite
        System.out.println("05_exceções_customizadas:");
        System.out.println("Continue....");
        System.out.println("===//=====//========//=====");

  System.out.println("       The End       ");
    }
     public static void validarIdade(int idade) {

        if(idade < 18) {
            throw new IllegalArgumentException("Idade deve ser maior que 18.");
        }

        System.out.println("Idade válida :" + idade);

    }

}
