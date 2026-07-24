package secao24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Colecoes {
    // Quarta-feira_D'noite,22/07/2026
public static void main(String[] args) {
    System.out.println("01_list:");
     List<String> listaDeNomes = new ArrayList<>();
    System.out.println("Adicionar");
        listaDeNomes.add("Maria");
        listaDeNomes.add("João");
        listaDeNomes.add("Pedro");
        // Lista do  Professor Matheus
         listaDeNomes.add("Sofia");
        listaDeNomes.add("Ravy");
        listaDeNomes.add("Breno");
        // Minha lista
        System.out.println("Resgatar");
 System.out.println("Primeiro nome: " + listaDeNomes.get(0));
   System.out.println(" alterar");
           // alterar
        listaDeNomes.set(1, "Ana");

        System.out.println("Segundo nome: " + listaDeNomes.get(1));

        // Remover el
        listaDeNomes.remove(2);

        // Erro de execução, fora dos indices do array
        // System.out.println("Segundo nome: " + listaDeNomes.get(2));

        listaDeNomes.add("Teste");
        listaDeNomes.add("Outro teste");

        // Procura por valor de item
        System.out.println(listaDeNomes.contains("Teste"));


        // LinkedList
        List<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(numeros.get(3));

        numeros.remove(0);

        // Ver os valores facilmente
        System.out.println(numeros.toString());

        numeros.set(0, 23);

        System.out.println(numeros.get(0));
// 
        // As collections tem os mesmos métodos, qualquer uma
        // mas nem todas, podem aplicá-los
 System.out.println("===//===//===//===//===//===//===//===//===");
  System.out.println("02_LinkedList");
//   Quinta-feira_D'Noite, 23/07/2026
List<Integer> numeros1 = new LinkedList<>();
numeros1.add(5);
numeros1.add(4);
numeros1.add(3);
numeros1.add(3);
numeros1.add(2);
numeros1.add(1);
System.out.println(numeros1.get(3));
numeros1.remove(0);
System.out.println(numeros1.toString());
numeros1.set(0, 07);
System.out.println(numeros1.get(0));
System.out.println(numeros1.toString());
System.out.println("Obs.:As collections tem os mesmos métodos, qualquer uma\n" + //
   "         mas nem todas, podem aplicá-los ");
System.out.println("===//===//===//===//===//===//===//===//===");
  System.out.println("03_Set");
//   Quinta-feira_D'Noite, 23/07/2026
 
        System.out.println("HashSet - reordena os elementos");
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("PHP");
        conjunto.add("PHP");
          conjunto.add("JavaSCript");
        conjunto.add("Next");
        conjunto.add("Angular");
        conjunto.add("ReactComVim");

        System.out.println(conjunto);

        System.out.println(conjunto.contains("PHP"));

        System.out.println("LinkedHashSet - mantem ordem");
        Set<Integer> numeros2 = new LinkedHashSet<>();

        numeros2.add(5);
        numeros2.add(10);
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(55);

        System.out.println(numeros2);

        System.out.println(" TreeSet - reordena elementos");
        Set<String> nomes = new TreeSet<>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Roberto");
        nomes.add("Alan");
         nomes.add("Antônio");
        nomes.add("Joana");
        nomes.add("Ruan");
        nomes.add("Alana");

        System.out.println(nomes);

        System.out.println(" Set não tem get\n" + //
                        "         System.out.println(nomes.get(0));");

System.out.println( );
System.out.println("---//---//-----//---//---//-----//---//---//-----");
System.out.println(" .....That's all for today, folks.... ");
System.out.println("       The End    ");
}

}
