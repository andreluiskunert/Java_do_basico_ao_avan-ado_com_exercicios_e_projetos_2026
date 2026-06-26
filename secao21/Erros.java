package secao21;
// Quinta-feira, 25/062026_D'noite
public class Erros {
   
    public static void main(String[] args) {
        // try catch
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

    }
}
