package secao24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

   }

}
