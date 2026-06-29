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
              System.out.println("05_exceções_customizadas:");
        // System.out.println("Continue....");
        // Segunda-feira_D'Tarde,29/06/2026_Feriado Municipal

        Banco minhaConta = new Banco(5000);

        try {
            
            minhaConta.sacar(6000);

        } catch (Exception e) {
           
            System.out.println("Erro: " + e.getMessage());

        }
          System.out.println("===//=====//========//=====");
              System.out.println("06_throws em métodos:");
        // System.out.println("Continue....");
           // Segunda-feira_D'Tarde,29/06/2026_Feriado Municipal
           try {
            
            processarArquivo("/var/www/arquivo.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("===//=====//========//=====");
              System.out.println("07_Encadeamento de exceções:");
        // System.out.println("Continue....");
         try {
            
            abrirArquivo(null);

        } catch (Exception e) {
            
            System.out.println("Mensagem: " + e.getMessage());

            System.out.println("Causa original: " + e.getCause());

        }
           System.out.println("===//=====//========//=====");
              System.out.println("08_multicatch:");
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

    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException {

        if(caminho == null || caminho.isEmpty()) {
            throw new IOException("Caminho inválido.");
        }

        File arquivo = new File(caminho);

        if(!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo não encontrado.");
        }

        System.out.println("Arquivo encontrado com sucesso!");

    }

    public static void abrirArquivo(String caminho) {

        try {
            
            if(caminho == null) {
                throw new NullPointerException("Caminho nulo.");
            }

            throw new FileNotFoundException("Arquivo não encontrado");

        } catch (FileNotFoundException e) {
            
            NullPointerException npe = new NullPointerException("Erro ao processar arquivo");

            npe.initCause(e);

            throw npe;

        }

    }
        public static void processarDados(String dados) throws Exception {

        try {
            
            if(dados == null) {
                throw new NullPointerException("Os dados são nulos.");
            }


        } catch (Exception e) {

            System.out.println("Tratamento, criação de log, ...");

            throw e;
        }


    }
}
