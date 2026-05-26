package secao14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;;

public class AvancandoArrays {
    public static void main(String[] args) {
        System.out.println("1ªOrdenação:");
        System.out.println(" Ordenação de linhas, por um valor de coluna;");
        int[] numbers = {5, 6, 1, 4, 2, 22, 0};
        Arrays.sort(numbers);
        System.out.println("Organizando disso {5, 6, 1, 4, 2, 22, 0}, para isso "+ Arrays.toString(numbers));
     System.out.println("--> Ordenacao com comparator: ");
     String[] names = {"Ana", "Maria","Lucas", "Matheus"};
       Arrays.sort(names);

        Arrays.sort(names, Comparator.reverseOrder());

        System.out.println(Arrays.toString(names));    

        System.out.println("--> Ordenacao de matriz");
        int[][] matriz = {
            {4, 5, 1},
            {3, 8, 9},
            {2, 3, 1},
            {7, 5, 3}
        };
          System.out.println("--> Resultado: Ordenação de linhas, por um valor de coluna");
        Arrays.sort(matriz, Comparator.comparingInt(a -> a[0]));

        for(int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));  
        }
         System.out.println("--> Outra forma: Imprimir matriz, sem foreach");
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("====///==============///==============///==========");
         System.out.println("2 - Manipualação avançada");
        System.out.println("copia");
        // 
        int[] original = {1, 2, 2, 3};

        int[] copia = Arrays.copyOf(original, 2);

        System.out.println(Arrays.toString(copia));

        System.out.println(" fill - preenchimento");
        int[] numeros = new int[5];

        System.out.println(Arrays.toString(numeros));

        Arrays.fill(numeros, 5);

        System.out.println(Arrays.toString(numeros));

        System.out.println(" transformacao de array para stream");
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("fazer uma soma dos els.");

        int sum = Arrays.stream(values).sum();

        System.out.println(sum);

        System.out.println(" Arrays dinamicos");
        ArrayList<String> frutas = new ArrayList<>();

        System.out.println(frutas);

        frutas.add("Maçã");

        frutas.add("Banana");

        System.out.println(frutas);

        for(String fruta : frutas) {
            System.out.println(fruta);
        }

        frutas.remove("Banana");

        System.out.println(frutas);

        frutas.remove(0);

        System.out.println(frutas);

        frutas.add("Maçã");

        String frutaEspecifica = frutas.get(0);

        System.out.println(frutaEspecifica);
        System.out.println("The End");
    }
}
