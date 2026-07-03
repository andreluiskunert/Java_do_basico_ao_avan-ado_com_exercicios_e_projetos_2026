package secao22;
import java.io.*;
public class Arquivo {
    public static void main(String[] args) {
    System.out.println("01_Leitura de Arquivo:");
        //   Java_do_basico_ao_avan-ado_com_exercicios_e_projetos_2026/secao22/Arquivo.java
        // Obs.: Caminho Relativo
        String currentDir = System.getProperty("user.dir");
   System.out.println("Resultado 01 é :" + currentDir + " arquivo.txt ;");
   System.out.println("Resultado 02"+"Java_do_basico_ao_avan-ado_com_exercicios_e_projetos_2026/secao22");
    System.out.println("==========//=================///=================//============");
    System.out.println("02ª_Leitura de Arquivos:");
    //  Sgunda-feira_D'noite, 01/07/2026
    // FileReader = caracter por caracter
        // BufferedReader = linha por linha

        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
            
            int caracter;

            while((caracter = reader.read()) != -1) {
                System.out.print((char) caracter);
            }

        } catch (Exception e) {
           
            System.out.println("Erro ao ler arquivo: " + e.getMessage());

        }

        System.out.println();

        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
            
            String linha;

            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (Exception e) {
           
            System.out.println("Erro ao ler arquivo: " + e.getMessage());

        }
        
  System.out.println("==========//=================///=================//=============");
   System.out.println("03ª_ Escrever em arquivos:");
//    Quinta-feira_D'Noite
   try (FileWriter writer = new FileWriter(currentDir + "saida.txt")) {
            
            writer.write("Escrevendo em arquivo \n");
            writer.write("Escrevendo em arquivo 2");

        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))) {
            
            writer.write("Escrevendo em arquivo com o buffered");
            writer.newLine();
            writer.write("Escrevendo em arquivo com o buffered 2");
            writer.newLine();

        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt", true))) {
            
            writer.append("Testando");

        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
        }

  System.out.println("The End...");
    }
}
