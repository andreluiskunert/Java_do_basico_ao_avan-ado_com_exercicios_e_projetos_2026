package secao2;

public  class Variavel {
   public static void main(String[] args) {
      System.out.println(" O que são variáveis?");
    // 1-  O que são variáveis?
    //  tipo -> nome -> atribuir um valor;
    String nome = "Andre Luis";
    // nome => "Andre Luis"
    System.out.println("Meu nome é " + nome +";");
    System.out.println("-/-/-//====================================================================================" );
   //  2ª Atribuição de valor com outra variável
   System.out.println("Atribuição de valor com outra variável");
   String teste = "teste";
   String testandosString =  teste;
  System.out.println(testandosString);  
  long numeroGrande = 999999999999l;
  System.out.println(numeroGrande);
  System.out.println("-/-/-//====================================================================================" );
//   3 -  long
System.out.println("Long");
 long populacoaMundial = 77777777777l;
 long grandNumero = 1_000_000l;

System.out.println(grandNumero +1);
System.out.println(populacoaMundial);
//  4_Tipos de String
// quinta-feira,16/04/2026
String fisrtName = "Andre Luis";
String lastName ="Kunert";
System.out.println("Hello Guys, my name is " + fisrtName + ",my last name is  " + lastName);
System.out.println("----");
System.out.println("my name is " + fisrtName);
System.out.println("my last name is " + lastName);
// concatenação = operador + nas strings,pra uni-las
// System.out.println(fullName);
System.out.println("-/-/-//====================================================================================" );
// 5ª Char
System.out.println("Char");
   char letra ='A';
   System.out.println(letra);
   String letra2 = "A";
   System.out.println(letra2);
   char simbolo = '$';
   System.out.println(simbolo);
System.out.println("-/-/-//====================================================================================" );
   // ---//
// 6ª Int
System.out.println("Int");
int n = 43;
System.out.println("minha idade é: " + n + " anos ;");
System.out.println("Este ano farei de : " + (n + 1) + " anos de idade");
System.out.println("Daqui algum tempo estarei no Canadá em Vancouve, com que idade: " + (n * 2) + " anos;");
System.out.println(" já tive de idade: " + (n / 2) + " anos de idade");
int soma = n + 12;
System.out.println("Ontem será que estarei quanto tiver: " + soma + " anos de idade");
System.out.println("-/-/-//====================================================================================" );
// 7ª Long
System.out.println();
 long populacoaMundialAtual = 7800000l;
  System.out.println("A população Mundial é " + populacoaMundialAtual +"m²");
  long grandNumeroAtual = 2_000_000l;
  System.out.println("A população Mundial irá aumentar mais "+ grandNumeroAtual + ",puxa vida...kkkkk");
System.out.println("-/-/-//====================================================================================" );
// sábado,18/04/2026_De tarde
// 8_Double
System.out.println("Double");
double preco = 19.90;
System.out.println(preco);
System.out.println(preco -12);
System.out.println(preco /2);
double pi = 3.14_141_592_123;
System.out.println(pi);
double valorComD = 2026.2D;
System.out.println("estou no periodo da graduação Tecnologica em Desenvolvimento Full Stack, é o periodo:"+ valorComD+  ";");
System.out.println("-/-/-//====================================================================================" );
System.out.println("Operadores aritméticos parte 1");
// 09_Operadores aritméticos parte 1
int soma2 = 12 + 5;
System.out.println("soma2 é :" + soma2);
System.out.println(22 + 4);
System.out.println(10 - 5);
System.out.println(10 * 5);
System.out.println(10 / 2.5);
System.out.println(10.0 / 2.5);
// pra ter um resultado quebrado (1.5), pelo menos 1 num da divisão tem que ser double...
System.out.println(10 / 3 );
System.out.println(10.0 / 3 );
System.out.println(10 % 3);
System.out.println("-/-/-//====================================================================================" );
System.out.println("Operadores aritméticos parte 2");
// 10_Operadores aritméticos parte 2_Sabado,18/04/2026_De noite
int x = 5;
x++;
System.out.println("O x++ é:"+ x + ";" );
int y = 5;
y--;
System.out.println("O y-- é: "+ y + ";");
int a = 10;
a += 5;
System.out.println("O valor de a += 5 é "+ a + ";");
int b = 10;
b-=5;
System.out.println("O valor de b-=5 é " + b + ";");

System.out.println("-/-/-//====================================================================================" );
System.out.println("Type casting");
// 11_Type casting_Sabado,18/04/2026_De noite  
int numero02 =43;
long numeroLong = numero02;
System.out.println("O numero02 em long é:" + numeroLong + ";");
double numeroDouble = numero02;
System.out.println("O numero02 em double é:" + numeroDouble + ";");
double valorDouble = 9.78;
System.out.println("O valorDouble é :" + valorDouble + ";");
int valorInt = (int) valorDouble;
System.out.println("Convertendo de Int pra Double : " + valorInt + ";");
// casting de char
char letra02 ='A';
int codigoAscii = (int) letra02;
System.out.println("O valor de A na tabela ASCII é : " + codigoAscii + ";");


   }
}