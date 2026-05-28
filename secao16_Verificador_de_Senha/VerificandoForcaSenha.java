package secao16_Verificador_de_Senha;

/**
    1 - Importar Scanner: Importar a classe Scanner para capturar a entrada do usuário.

    2 - Receber Senha: Solicitar ao usuário que digite uma senha 
    e armazená-la em uma variável.

    3 - Verificar Força da Senha: Chamar o método verificarForcaSenha 
    para avaliar a força da senha.

    > mais de x caracteres +1
    > se tem letras  +1
    > se tem caracteres especiais +1
    > se tem numeros +1

    forca = 3

    'a senha tem seguranca média'

    4 - Avaliar e Exibir Resultado: Exibir uma mensagem indicando a força da senha 
    com base no valor retornado.

    5 - Fechar Scanner: Fechar o Scanner para liberar recursos.
 */
// Quarta-feira, 27/05/2026_De noite
import java.util.Scanner;
public class VerificandoForcaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua senha: ");
        String senha = scanner.next();
        int forca = verificarForcaSenha(senha);
        if (forca <= 2) {
            System.out.println("Senha fraca");
          } else if (forca == 3) {
            System.out.println("Senha media");
            
          } else if (forca == 4) {
            System.out.println("Senha Segura");
            
          } else{
            System.out.println("Senha é muito Forte");
          }
        scanner.close();
         System.out.println("That's all for today, folks!");
    }
    public static int verificarForcaSenha(String senha) {
        
        int forca = 0;

        // Lógica para ver se a senha é forte
        if(senha.length() > 8) {
            forca++;
        }

        // letras maiúsculas de a a z
        if(senha.matches(".*[A-Z].*")) {
            forca++;
        }

        // letras minúsculas de a a z
        if(senha.matches(".*[a-z].*")) {
            forca++;
        }

        // verificar se tem números
        if(senha.matches(".*\\d.*")) {
            forca++;
        }

        // - > traço
        // - > intervalo entre 2 caracteres
        if(senha.matches(".*[!@#$%&*()\\-_?<>].*")) {
            forca++;
        }

        return forca;
    }
    
}
