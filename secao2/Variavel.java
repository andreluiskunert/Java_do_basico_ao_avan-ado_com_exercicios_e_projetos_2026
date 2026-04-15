package secao2;

public  class Variavel {
   public static void main(String[] args) {
    // 1-  O que são variáveis?
    //  tipo -> nome -> atribuir um valor;
    String nome = "Andre Luis";
    // nome => "Andre Luis"
    System.out.println("Meu nome é " + nome +";");
   //  2ª Atribuição de valor com outra variável
   String teste = "teste";
   String testandosString =  teste;
  System.out.println(testandosString);  
  long numeroGrande = 999999999999l;
  System.out.println(numeroGrande);
//   7 -  long
 long populacoaMundial = 77777777777l;
 long grandNumero = 1_000_000l;

System.out.println(grandNumero +1);
System.out.println(populacoaMundial);
   }
}