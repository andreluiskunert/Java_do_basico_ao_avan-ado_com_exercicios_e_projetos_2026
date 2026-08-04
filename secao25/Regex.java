package secao25;

import java.lang.reflect.Parameter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.DocFlavor.STRING;

public class Regex {
    // Sexta-feira_D'noite, 31/07/2026
    // Obs.: 3 aulas de introdução ao conteúdo;
    //----//--
  
    public static void main(String[] args) {  
        // Sabádo_D'Tarde,01/08/2026
        System.out.println("01ºQuantificadores:");
        System.out.println("exp. reg, text, ver se no texto há a exp. reg.");
        String regex = "a*";  
        String texto = "b aaab aa ba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
         System.out.println("Correspondencias para a{2,4}");
        while(matcher.find()) {

            // 
            System.out.println("find = encontrar algo na string....");

            System.out.println("'" + matcher.group() + "'");

        }

        regex = "a{2}"; // apenas com 2 a's
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println(" §Correspondencias para a{2}");
        while(matcher.find()) {

            // 
        System.out.println(" §find = encontrar algo na string....");

            System.out.println("'" + matcher.group() + "'");

        }
        System.out.println("---//-----///---///-----/////--------////------");
         System.out.println("02ºancoras e fronteiras:");
        //  Sabádo_D'noite, 01/08/2026
        System.out.println("^ no inicio da string");
            regex = "^c";
            texto = "carro casa cadeira";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(texto);
             System.out.println("Correspodencia para ^c");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }
        System.out.println(" $ no final");
           regex = "cadeira$";
           texto = "carro casa cadeira";
           pattern = Pattern.compile(regex);
           matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para a$");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }
        System.out.println("§fronteira \\b -> apenas o que ta entre os \\b");
         regex = "\\bpalavra\\b";
        texto = "palavra compalavra palavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para \\bpalavra\\b");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        System.out.println("§fronteira \\B -> string com fronteira com o texto a ser procurado");
        regex = "\\Bpalavra";
        texto = "palavra compalavra apalavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para \\Bpalavra");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }
         System.out.println("---//-----///---///-----/////--------////------");
        System.out.println(" 03ºgrupos e captura");
         //
        regex = "(\\d{2})-(\\d{2})-(\\d{4})"; // (DD)-(MM)-(AAAA), \\d{2}-\\d{2}-\\d{4}
        texto = "A data de hoje é 01-08-2026 e a data de ontem foi 31-07-2026";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencia de grupo");
        while(matcher.find()) {
            System.out.println("Dia: " + matcher.group(1) );
            System.out.println("Mês: " + matcher.group(2 ));
            System.out.println("Ano: " + matcher.group(3) );
            System.out.println("Todos os grupos: " + matcher.group(0) ); // 0 = todos os grupos
        }
         System.out.println("§ Backreference para substituicao $1 = grupo 1, $2 = grupo 2...");
        
        String textoSubstituido = texto.replaceAll("(\\d{2})-(\\d{2})-(\\d{4})", "$3/$2/$1");

        System.out.println("Texto após substituição: " + textoSubstituido);
System.out.println();
        System.out.println("---//-----///---///-----/////--------////------");
        System.out.println(" 04ºavançando em pattern e matcher");
        // Domingo_D'noite,02/08/2026
        System.out.println("§ correspondencia parcial:");
        regex = "\\d{2}";
        texto= "123ABC456";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(texto);
         System.out.println("þ Posicao das correspondencias");
         while (matcher.find()) {
            System.out.println("§ Quando eu tiver uma ocorrencia, o start é onde comeca e o end onde termina:");
            // 
            System.out.println("Encontrado: " + matcher.group() + ", começa em " + matcher.start() + " e termina em " + matcher.end());

         }
         System.out.println("§ quote para tratar caracteres literais:");
 //       
        String literalRegex = Pattern.quote("resultado");
        texto = "A equação correta é 1+1=2 e é o resultado do exercício";

        pattern = Pattern.compile(literalRegex);
        matcher = pattern.matcher(texto);

        System.out.println("Caracteres literais");
        if(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
            System.out.println(matcher.start() + " - " + matcher.end());
        }
          System.out.println("---//-----///---///-----/////--------////------");
        System.out.println(" 05º expressoes avançadas");
        // Segunda-feira_D'noite,03/08/2026
        System.out.println("1ªLookahead positivo:");
        String regexLookAhead = "\\d+(?=\\$)";
        texto = "Preços: 100$ 200$ $300 $400";
        System.out.println("Obs.: lookahead positivo -> DO QUE A GENTE SINALIZOU PARA TRÁS");
   
        pattern = Pattern.compile(regexLookAhead);
        matcher = pattern.matcher(texto);
        System.out.println("Lookahead positivo");
        while (matcher.find()) {
             System.out.println("Encontrou: " + matcher.group());
        }
        System.out.println(" lookbehind positivo -> PARA FRENTE DO QUE A GENTE DEFINIU");
          String regexLookBehind = "(?<=\\$)\\d+";
        texto = "Preços: 100$ 200$ $300 $400";

        pattern = Pattern.compile(regexLookBehind);
        matcher = pattern.matcher(texto);

        System.out.println("Lookbehind positivo");
        while (matcher.find()) {
            System.out.println("Encontrou: " + matcher.group());
        }

        // lookahead negativo
        // que vai encontrar palavras QUE NÃO TEM (negativo) ponto final
        // w -> a-z != é
        String regexLookAheadNegativo = "\\b\\w+\\b(?!\\.)";
        texto = "Esta é uma frase. E esta é outra";

        pattern = Pattern.compile(regexLookAheadNegativo);
        matcher = pattern.matcher(texto);

        System.out.println("Lookahead negativo");
        while (matcher.find()) {
            System.out.println("Encontrou: " + matcher.group());
        }

        // lookbehind negativo
        // Todas as palavras que não são precedidas por #
        String regexLookBehindNegativo = "(?<!#)\\b\\w+\\b";
        texto = "#java #javascript #php python";

        pattern = Pattern.compile(regexLookBehindNegativo);
        matcher = pattern.matcher(texto);

        System.out.println("Lookbehind negativo");
        while (matcher.find()) {
            System.out.println("Encontrou: " + matcher.group());
        }

        System.out.println("----- That's all for today, Java folks..... ");
        System.out.println("                    The End             ");

    }
    

}
