package secao08;

public class FuncoesBuiltin {
    public static void main(String[] args) {
        // Funções Built-in de String
        String frase = "Estudando Java";
        System.out.println("Funções Built-in de String:");
        System.out.println("O que estuda? eu "+ frase + "Todos os dias");
        System.out.println("A frase tem:" + frase.length() + " caracteres...");
          System.out.println("O resultado será: " + frase.substring(0, 6) + ";");
        // System.out.println("O resultado será: "+ frase.substring(0, 16) + ";");
        System.out.println("Tudo masculino:" + frase.toUpperCase());
        String fraseModificada = frase.toUpperCase();
        System.out.println( fraseModificada.toLowerCase() );
    System.out.println("The End");
    }
}
