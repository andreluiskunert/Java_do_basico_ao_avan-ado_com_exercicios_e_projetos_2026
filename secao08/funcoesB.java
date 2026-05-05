package secao08;

public class funcoesB {
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

    /**
     * 
     * Calcula a média de três números inteiros
     * 
     * @param num1 O primeiro número/nota a ser enviado
     * @param num2 O segundo número/nota a ser enviado
     * @param num3 O terceiro número/nota a ser enviado
     * @return A média dos três números
     * 
     */
     
 }

