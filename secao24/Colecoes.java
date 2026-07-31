package secao24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import secao17.Produto;

import java.util.Iterator;

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


System.out.println("===//===//===//===//===//===//===//===//===");
  System.out.println("04_Map");
// Sábado_D'tarde, 25/07/2026
System.out.println("1ªHashMap");
 Map<String, Integer> idadeMap = new HashMap<>();
 System.out.println("Os valores do professores");
 System.out.println("adiciona no map com o put");
   idadeMap.put("João", 30);
   idadeMap.put("Matheus", 33);
   idadeMap.put("Alan", 18);
   System.out.println(idadeMap);
    idadeMap.put("Alan", 24);

        System.out.println(idadeMap);
         System.out.println("Idade de Alan: " + idadeMap.get("Alan"));
   System.out.println(" map com chave ja existente, atualiza valor");
   System.out.println("Meus valores_Da última Republica Cristã");
     idadeMap.put("Lucas Camargo",  25);
   idadeMap.put("Jean Cardoso",   30);
   idadeMap.put("Luis Carlos",   44);
   idadeMap.put("André Luis",   44);
   System.out.println(idadeMap);
    
     System.out.println("Remove elementos");
        idadeMap.remove("Matheus");

        System.out.println(idadeMap);

        //
        System.out.println(" encontrando por chave, e por valor");
        System.out.println(idadeMap.containsKey("Alan"));
        System.out.println(idadeMap.containsValue(99));

        // 
        System.out.println("exibe valores");
        System.out.println(idadeMap.entrySet());

        // 
        System.out.println("LinkedHashMap");
        Map<String, String> capitalMap = new LinkedHashMap<>();

        capitalMap.put("Brasil", "Brasília");
        capitalMap.put("Argentina", "Buenos Aires");
        capitalMap.put("França", "Paris");

        System.out.println(capitalMap.entrySet());

        System.out.println(capitalMap.containsKey("Brasil"));

        // TreeMap - reordena os itens
        Map<String, Double> produtoPrecoMap = new TreeMap<>();

        produtoPrecoMap.put("Maçã", 3.50);
        produtoPrecoMap.put("Pera", 4.50);
        produtoPrecoMap.put("Leite", 5.50);
        produtoPrecoMap.put("Avelã", 11.0);

        System.out.println(produtoPrecoMap);

        System.out.println(produtoPrecoMap.containsValue(11.0));
        System.out.println("===//===//===//===//===//===//===//===//===");
  System.out.println("05_iterando");
// Sábado_D'tarde, 25/07/2026
         System.out.println(" for-each");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        // Iterator
        Iterator<String> nomesIterator = nomes.iterator();

        // remover um elemento
        while(nomesIterator.hasNext()) {

            String nome = nomesIterator.next();

            if(nome.equals("João")) {
                nomesIterator.remove();
            }

        }

        System.out.println(nomes);

        // ListIterator
        ListIterator<String> listIteratorNomes = listaDeNomes.listIterator();

        while(listIteratorNomes.hasNext()) {
            System.out.println("Nome: " + listIteratorNomes.next());
        }

        while(listIteratorNomes.hasPrevious()) {
            System.out.println("Nome: " + listIteratorNomes.previous());
        }
 
   System.out.println("===//===//===//===//===//===//===//===//===");
  System.out.println("06_ collections imutaveis");
// Sábado_D'noite, 25/07/2026
 // 
 System.out.println("§criando lista imutavel");
        List<String> listaMutavel = new ArrayList<>();

        listaMutavel.add("teste");
        listaMutavel.add("testando");

        List<String> listaImutavel = Collections.unmodifiableList(listaMutavel);

        System.out.println(listaImutavel);

        //
        System.out.println("  n podemos adicionar novos elementos\n" + //
                    "        listaImutavel.add(\"teste2\");");

        List<String> listaImutavel2 = List.of("item 1", "item 2", "item 3");

        // listaImutavel2.add("Item 4");
      

        System.out.println(listaImutavel2);

        Set<Integer> listaImutavelSet = Set.of(1, 2, 3);

        // 
        System.out.println("listaImutavelSet.add(4);");
        System.out.println(listaImutavelSet);
   System.out.println("===//===//===//===//===//===//===//===//===");
  //  Domingo_D'noite, 26/07/2026
  System.out.println("07_ filter");
  List<Integer> numerosFiltrados = numeros.stream()
                                   .filter(numero -> numero > 3)
                                   .collect(Collectors.toList());
    System.out.println("Os numeros são: " +  numerosFiltrados);
    System.out.println("Lista Original: " + numeros);

   System.out.println("===//===//===//===//===//===//===//===//===");
  //  Segunda-feira_D'noite, 27/07/2026
  System.out.println("08_Busca");
  System.out.println("01ª For:");
  int numeroParaEncontrar = 5;
  boolean encontrou = false;

  for(Integer numero: numeros){
    if (numero == numeroParaEncontrar) {
        encontrou = true;
    }
  }
  System.out.println(numeros);
  System.out.println("Encontrou?" + encontrou);
  System.out.println("02ªContains");
   String nomeBuscado = "Maria";
        boolean encontrou2 = nomes.contains(nomeBuscado);

        System.out.println(nomes);
        System.out.println("Entrou nome? " + encontrou2);

        // 
        System.out.println("03ªfindAny");
        Optional<Integer> qualquerNumero = numeros.stream().findAny();

        System.out.println(qualquerNumero);

        Optional<Integer> primeiroNumero = numeros.stream().findFirst();

        System.out.println(primeiroNumero);

        Optional<Integer> primeiroPar = numeros.stream().filter(num -> num % 2 == 0).findFirst();

        System.out.println(primeiroPar);
   System.out.println("===//===//===//===//===//===//===//===//===");
   System.out.println("09_Map");
  //  segunda-feira_D'noite,27/07/2026
  System.out.println(" modificam a collection");
  List<Integer> quadrados = numeros.stream().map(n -> n * n).collect(Collectors.toList());
    System.out.println("O numero é :" + numeros);
        System.out.println("O quadrado é : " + quadrados);

        List<String> nomesMaiusculos = nomes.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());

        System.out.println("Os nomes Maisculos são :" + nomesMaiusculos); 
        System.out.println("===//===//===//===//===//===//===//===//===");
   System.out.println("10_modificação");
  //  Terça-feira_D'noite,28/07/2026
  System.out.println(" adiciona novo el.");
     //
        numeros.add(50);

        System.out.println(numeros);

        // 
        System.out.println("remove elementos pelo valor");
        numeros.remove(Integer.valueOf(3));

        System.out.println(numeros);

        //
        System.out.println(" alterar todos os elementos");
        numeros.replaceAll(numero -> numero * 3);

        System.out.println(numeros);

        numeros.add(201);
        numeros.add(205);
        numeros.add(208);

        System.out.println(numeros);

        // 
        System.out.println("remocao baseada em condicao");
        numeros.removeIf(numero -> numero > 200);

        System.out.println(numeros);
               System.out.println("===//===//===//===//===//===//===//===//===");
   System.out.println("11_Reduce");
  //  Quarta-feira_D'noite,29/07/2026
  int soma = numeros.stream().reduce(0, (acumulador, numero)-> acumulador + numero);
 System.out.println("Soma de Todos os números : " + soma + ";" );
 System.out.println("Constatenação de Variaveis: ");
  String frase = nomes.stream().reduce("",(concatenador, nome)-> concatenador + "" + nome);
System.out.println("Todos os nomes são : " + frase + ";");
    System.out.println("===//===//===//===//===//===//===//===//===");
   System.out.println("12_ordenacao com comparator");
  //  Quinta-feira_D'noite, 30/07/2026
  List<Pessoa> pessoas = new ArrayList<>();
  System.out.println("Lista do Professor");
    pessoas.add(new Pessoa("Pedro", 33));
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("João", 67));
        pessoas.add(new Pessoa("Maria", 18));
        pessoas.add(new Pessoa("Rodrigo", 40));
        pessoas.add(new Pessoa("Ana", 19));
          pessoas.add(new Pessoa("Pedro", 33));
        System.out.println("Minha lista:");
        pessoas.add(new Pessoa("Luis Carlos", 45));
        pessoas.add(new Pessoa("Jean Cardoso", 35));
        pessoas.add(new Pessoa("Lucas Camargo", 25));
        pessoas.add(new Pessoa("Josias Caldas", 19));
        pessoas.add(new Pessoa("André Luis", 44));
        // 
        System.out.println("ordenar pelo nome:");
        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("Ordenar pelo nome e idade:");
        pessoas.sort(Comparator.comparing(Pessoa::getNome)
                                .thenComparing(Pessoa::getIdade));
        
        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

  System.out.println("ordenar pelo nome");
   System.out.println("===//===//===//===//===//===//===//===//===");
   System.out.println("13_uso avançado de streams");
  //  Quinta-feira_D'noite, 30/07/2026
   // 
   System.out.println("flatMap - achatar listas:");
        List<List<String>> listaDeListas = Arrays.asList(
            Arrays.asList("Maçã", "Morango"),
            Arrays.asList("Banana", "Mamão"),
            Arrays.asList("Uva", "Melão")
        );

        List<String> listUnica = listaDeListas.stream()
                                              .flatMap(List::stream)
                                              .collect(Collectors.toList());

        System.out.println(listUnica);

        //
        System.out.println(" pipeline");
        List<Integer> resultado = numeros.stream()
                                         .filter(n -> n % 2 == 0) // filtro de nums. pares
                                         .map(n -> n * 5) // multiplicacao
                                         .sorted() // ordenacao
                                         .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(resultado);
System.out.println("===//===//===//===//===//===//===//===//===");
   System.out.println("14_uso avançado de streams");
  //  Quinta-feira_D'noite, 30/07/2026
    // 13 - 
    System.out.println("Collectors");
        List<Produto> produtos = Arrays.asList(
            new Produto("Camisa", "Roupas"),
            new Produto("TV", "Eletrônicos"),
            new Produto("Rádio", "Eletrônicos"),
            new Produto("Sofá", "Móveis"),
            new Produto("Mesa", "Móveis")
        );

        //
        System.out.println(" agrupar por categoria");
        List<Produto> produtosPorCategoria = (List<Produto>) produtos.stream()
                                                                  .collect(Collectors.groupingBy(p -> p.categoria));

        System.out.println(produtos);

        System.out.println(produtosPorCategoria);

        // 
        System.out.println("Particionar");
        Map<Boolean, List<Produto>> eletronicosENaoEletronicos = produtos.stream()
                                                                         .collect(Collectors.partitioningBy(p -> p.categoria.equals("Eletrônicos")));

        System.out.println(eletronicosENaoEletronicos);

        // Contando quantos produtos existem
        long totalProdutos = produtos.stream()
                                     .collect(Collectors.counting());

        System.out.println(totalProdutos);
System.out.println( );
System.out.println("---//---//-----//---//---//-----//---//---//-----");
System.out.println(" .....That's all for today, folks.... ");
System.out.println("       The End    ");
}

}
