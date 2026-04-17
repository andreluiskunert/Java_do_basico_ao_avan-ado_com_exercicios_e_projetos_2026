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
//  6_Tipos de String
// quinta-feira,16/04/2026
String fisrtName = "Andre Luis";
String lastName ="Kunert";
System.out.println("Hello Guys, my name is " + fisrtName + ",my last name is  " + lastName);
System.out.println("----");
System.out.println("my name is " + fisrtName);
System.out.println("my last name is " + lastName);
// concatenação = operador + nas strings,pra uni-las
// System.out.println(fullName);

// 5ª Char
   char letra ='A';
   System.out.println(letra);
   String letra2 = "A";
   System.out.println(letra2);
   char simbolo = '$';
   System.out.println(simbolo);
   }
}