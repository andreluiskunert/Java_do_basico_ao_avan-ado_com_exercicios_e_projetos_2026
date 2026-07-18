package secao23;
import java.util.*;
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
          // System.out.println("Próxima aula...");
          // Quarta-feira_D'noite, 15/07/2026
           System.out.println("Maior valor entre 5 e 10: " + obterMaior(5, 10));

        System.out.println("Maior valor entre Java e Python: " + obterMaior("Java", "Python"));

        String[] letras = {"a", "b", "c", "d"};

        Integer[] numeros = {12, 44, 123, 999};

        Boolean[] bools = {true, false, false, true};

        imprimirArray(letras);

        imprimirArray(numeros);

        imprimirArray(bools);

        System.out.println();
  System.out.println("===//===//===//======//======//=======//====");
          System.out.println("03_bounded types:");
          // Quinta-feira_D'noite, 16/07/2026
          // Comparator<Integer> ComparadorInteiros = new Comparador<>();
Comparador<Integer> comparadorInteiros = new Comparador<>();

        System.out.println("Maior numero entre 20 e 10: " + comparadorInteiros.obterMaior(20, 10));

        Comparador<Double> comparadorInteiros2 = new Comparador<>();

        System.out.println("Maior numero entre 1.95 e 4.55: " + comparadorInteiros2.obterMaior(1.95, 4.55));
    
        // Erro de compilação
        // Comparador<String> comparadorStrings = new Comparador<>();
         System.out.println("===//===//===//======//======//=======//====");
          System.out.println("04_wildcard:");
          // Sexta-feira_D'noite, 17/07/2026
             List<Integer> numeros2 = List.of(1, 2, 3);
        List<String> palavras2 = List.of("teste", "Java", "olá");

        // aceita qualquer tipo de lista (?)
        imprimirLista(numeros2);

        imprimirLista(palavras2);

        // aceita listas numericas (? extends Number)
        System.out.println(somarNumeros(numeros2));

        // somarNumeros(palavras2);

        // aceita apenas tipos numericos especificos
        // Number > Integer (5,4,3)
        List<Integer> numeros3 = new ArrayList<>();

        // adicionarNumeros aceita apenas Lista de Inteiros
        adicionarNumeros(numeros3);

        for(Integer numero : numeros3) {
            System.out.println(numero);
        }

        
          System.out.println("----///-----//-----");
        System.out.println(" The End...");
    }
   
    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2){
      return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;

    }
    public static <T> void  imprimirArray(T[] array){
      for(T elemento: array){
        System.out.println(elemento + " , ");
      }
    }
    public static void imprimirLista(List<?> lista){
      for(Object elemento : lista) {
            System.out.println(elemento);
        }
    }
    public static double somarNumeros( List<? extends Number> lista ){
     double soma = 0;

        for(Number numero : lista) {
            soma += numero.doubleValue();
        }

        return soma;

    }
    public static void adicionarNumeros(List<? super Integer> lista){
      for(int i = 1; i <= 5; i++) {
            lista.add(i);
        }

    }

    }

