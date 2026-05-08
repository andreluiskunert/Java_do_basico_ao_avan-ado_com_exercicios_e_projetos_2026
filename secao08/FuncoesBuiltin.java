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
        System.out.println("====///====///============///======");
        System.out.println("Funções Built-in de Números (Math)");
        System.out.println("qual é a raiz quadrada de 26 é :" +Math.sqrt(26));
        System.out.println("qual é a raiz quadrada de 9 é : " + Math.sqrt(9));
        System.out.println("Qual é a potencia de 2³ é : " + Math.pow(2, 03));
        System.out.println("Valor Absoluto de -10 é : " + Math.abs(-10));
        System.out.println("Qual maior de 100 ou 10 é : " + Math.max(100, 10));
        System.out.println("O valor Absoluto de 10 é : "+Math.abs(10));
        double raizQuadrada = Math.sqrt(99);
        System.out.println("A raiz quadrada de 99 é: " + raizQuadrada);
    System.out.println("The End");
    }
}
