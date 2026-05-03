package secao08;

public class funcoes {
    public static void main(String[] args) {
        // Criando a primeira função_Sábado, 02/05/2026_De Tarde
        System.out.println("Criando a primeira função:"); 
        saudacao();
        soma(2, 6);
        saudar("Andre Luis", "Desenvolvedor Full Stack");
        dobrar(12);
        int numero = 6;
        int anoDobrado = dobrar(numero);
        System.out.println("O ano dobrado  é "+ anoDobrado + "formado como Desenvolvedor Full Stack pela Estácio");
        dobrar(numero);
        primeiraPosgraduacao(" iniciando minha pos em Engenharia_de_Software");
    }
   public static void saudacao(){
      System.out.println("ola... essa minha 1ª função");
    }
//   sabádo, 02/05/2026_De noite
   
 public static void soma (int a, int b) {
    System.out.println("Argumentos em funções");
    int resultado = a + b;
    System.out.println("O resultado da soma é = "+ " a = "+ a + " entre b = " + b + " tem o resultado = " + resultado +";");

    
 }
  public static void saudar(String nome ,String profission) {
    System.out.println("Uso do return em funções");
    System.out.println("Olá meu nome é," + nome + ",tudo bem? " + "Sou "+ profission + " estou estudando Java " );
  }
  public static int dobrar(int n ) {
    System.out.println("daqui alguns estaria quase me formato" +  n + " meses" + " , Se Deus permitir...");
     return n * 2;
  }
  public static void primeiraPosgraduacao(String ps) {
    System.out.println(" iniciando minha pos em Engenharia_de_Software... Querendo o Senhor...");
  }
}
