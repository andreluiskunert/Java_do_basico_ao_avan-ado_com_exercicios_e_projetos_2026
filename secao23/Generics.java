package secao23;

public class Generics {
    public static void main(String[] args) {
        // Terça-feira_D'noite, 14/07/2026

        System.out.println("--- Generics ----");
          System.out.println("01_Classes Genericas:");
             Caixa<Integer> caixaInteira = new Caixa<>();

        caixaInteira.adicionar(100);

        System.out.println(caixaInteira.obter());

        Caixa<String> caixaStr = new Caixa<>();

        caixaStr.adicionar("teste");

        System.out.println(caixaStr.obter());
        System.out.println("===//===//===//======//======//=======//====");
          System.out.println("02_métodos genericos:");
          System.out.println("Próxima aula...");

          System.out.println("----///-----//-----");
        System.out.println(" The End...");
    }
}
