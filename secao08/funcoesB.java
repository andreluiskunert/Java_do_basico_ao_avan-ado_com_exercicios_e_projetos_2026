package secao08;

public class funcoesB {
    static int globalVar = 25;
    public static void main(String[] args) {
        // Segunda-feira, 04/05/2026_De noite
        System.out.println(" 5ª - Funções com condicionais:");
        String r1 = verificarAcesso(19, true, false);
        System.out.println("Usuário: Ana Maria "+r1);
        String r2 = verificarAcesso(16, false, false);
        System.out.println("Usuário: Paulo Ricardo "+ r2);
        System.out.println("===///===///========////====");
        System.out.println("6ª Funções Swicth:");
        System.out.println("Que dia é o dia 5?"+ obterDiaDaSemana(3));
        System.out.println("Que dia é o dia 5?"+ obterDiaDaSemana(5));
        System.out.println("Que dia é o dia 7?"+ obterDiaDaSemana(7));
        
     System.out.println("===///===///========////====");
     //
     System.out.println(" 7ª System exit");
        verificarAutenticacao("admin", "SenhaSegura");

        System.out.println("Oi!");
     System.out.println("===///===///========////====");
     System.out.println("Documentando funções:");
     System.out.println("\n" + //
                  "    /**\n" + //
                  "     * \n" + //
                  "     * Calcula a média de três números inteiros\n" + //
                  "     * \n" + //
                  "     * @param num1 O primeiro número/nota a ser enviado\n" + //
                  "     * @param num2 O segundo número/nota a ser enviado\n" + //
                  "     * @param num3 O terceiro número/nota a ser enviado\n" + //
                  "     * @return A média dos três números\n" + //
                  "     * \n" + //
                  "     */");
                  System.out.println("Exemplo:");
                System.out.println("A media simestral do João é :" + mediaBimestral(5, 6) + ";");
                  System.out.println("=========////=========///===");
     System.out.println("Escopos em Java:");
     int localVar = 15;
     System.out.println("Aqui temos escopo local...{localVar} o valor é:" + localVar + ";");
     System.out.println("Fora da Classe:"+ globalVar+ ";");            
    //   escopoLocal(localVar);
     System.out.println("=====///========///=====");
     System.out.println("O que são Funções Built-in em Java?{Teoria}");
     System.out.println("●\n" + //
                  "São funções já incorporadas na linguagem Java que fornecem funcionalidades\n" + //
                  "comuns e essenciais. Elas são prontas para uso e não precisam ser definidas pelo\n" + //
                  "programador;\n" + //
                  "●Estão disponíveis automaticamente sem necessidade de importação ou definição;\n" + //
                  "●Para que servem: manipulação de strings, operações matemáticas, conversão de\n" + //
                  "dados, entre outras funcionalidades;\n" + //
                  "●\n" + //
                  "Geralmente, as funções built-in são altamente otimizadas para desempenho;");
          System.out.println("=====///========///=====");
          System.out.println("Funções Built-in de String{Prática} ");
          System.out.println("Obs.: Em um Arquivo");
          System.out.println("=====///========///=====");

                  System.out.println("The End");
    }
    public static String verificarAcesso(
        int idade,
         boolean temCarteira, 
         boolean temHistoricoNegativo) {
            if(idade >= 18 && temCarteira && !temHistoricoNegativo) {
                return "Acesso permitido: todos os critérios atendidos!";
            } else if(idade >= 18 && temCarteira && temHistoricoNegativo) {
                return "Acesso negado: Histórico negativo detectado!";
            } else {
                return "Acesso negado: Critérios não atentidos!";
            }

       }

    public static String obterDiaDaSemana(int dia) {

        switch(dia) {
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Dia inválido";
        }
       

     }
      public static void verificarAutenticacao(String usuario, String senha) {

        if(!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
            System.out.println("Autenticação falhou!");
            System.exit(1);
        }

        System.out.println("Autenticação bem sucedida!");
      }
      public static double mediaBimestral(int num1, int num2) {
      return (num1 + num2) / 2;
      }
      public static void escopoLocal(){
         System.out.println(globalVar);
      }
     
 }

