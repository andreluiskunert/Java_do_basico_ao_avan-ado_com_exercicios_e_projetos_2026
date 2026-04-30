package secao05;

public class operadoreslogicos {
    public static void main(String[] args) {
        // 8 _AND
        int idade = 18;
         boolean temCNH = true;

       // true == true > true (variável)
        System.out.println(idade >= 18 && temCNH);
        System.out.println(idade >= 18 && temCNH == true);

        boolean carteiraVencidade = false;

        System.out.println(idade >= 18 && temCNH && carteiraVencidade == false);

        int a = 10;
        int b = 20;

        // True && True => True
        if(a > 5 && b > 10) {
            System.out.println("Deu certo!");
        }

        // False && True => True (Curto circuito)
        if(a > 55 && b > 10) {
            System.out.println("Deu certo! 2");
        }

        // 9 - OR
//  Terça-feira,28/04/2026_De noite
boolean estaChuvendo = true;
boolean temGuardaChuva = true;
System.out.printf("Como está o tempo hoje " + estaChuvendo+ " chovendo " + temGuardaChuva +"sempre levo guarda chuva", estaChuvendo || temGuardaChuva);
System.out.println( );
System.out.println(false || false);
System.out.println( );
System.out.println(10 > 20 || 100 == idade);
int idade2 = 16;
boolean ehMenbro = true;
 // O usuário pode participar do clube
        // ele precisa ter > 16 anos OU ser membr
 if (idade2 > 16 || ehMenbro) {
  System.out.println("Pode entrar"); 
    
 } else {
    System.out.println("Acesso negado...voltei com seus pais ou responsaveis");
 }

// 10 - NOT
// Quarta-feira,29/04/2026_De noite 
  System.out.println(estaChuvendo);
  System.out.println(!estaChuvendo);
   System.out.println(estaChuvendo || !temGuardaChuva);

        System.out.println(!(estaChuvendo || !temGuardaChuva));

       
    }
}
