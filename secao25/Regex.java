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
        System.out.println("----- That's all for today, folks.... ");
        System.out.println("                    The End             ");

    }
    

}
