package secao22;
import java.io.*;

import java.awt.*;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.nio.file.*;

import java.util.zip.*;
public class Arquivo {
    public static void main(String[] args) {
        System.out.println("------------Manipulação de Arquivos e Diretorios------------");
    System.out.println("01ª_Leitura de Arquivo:");
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
          System.out.println("==========//=================///=================//=============");
   System.out.println("04ª_Serialização de Objetos(Serializable):");
//    Sexta-feira_D'Noite
  Pessoa pessoa = new Pessoa("Andre", 44);
   System.out.println(pessoa.getNome());
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
            
            oos.writeObject(pessoa);

            System.out.println("Objeto serializado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto: " + e.getMessage());
        }

        // deserializacao = INPUT
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))) {
            
            Pessoa pessoa2 = (Pessoa) ois.readObject();

            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("Idade: " + pessoa2.getIdade());

        } catch (Exception e) {
            System.out.println("Erro ao deserializar objeto: " + e.getMessage());
        }
         System.out.println("==========//=================///=================//=============");
   System.out.println("05ª_ deserializacao = INPUT:");
//    Sábado_D'tarde 
try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))) {
     
            Pessoa pessoa2 = (Pessoa) ois.readObject();

            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("Idade: " + pessoa2.getIdade());

} catch (Exception e) {
      System.out.println("Erro ao deserializar objeto: " + e.getMessage());

}
      System.out.println("==========//=================///=================//=============");
   System.out.println("06ª_manipulacao de binários:");
//    Sábado_D'tarde 
try (FileInputStream fis = new FileInputStream(currentDir + "minha bike absolute nero5.jepg");
     FileOutputStream fos = new FileOutputStream(currentDir + "copia_minha bike absolute nero5.jepg")) {
            
            int byteData;

            while((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("Arquivo copiado com sucesso.");

} catch (Exception e) {
            System.out.println("Erro ao copiar arquivo: " + e.getMessage());
              System.out.println("==========//=================///=================//=============");
  
}
 System.out.println("07ª_Copia de Video com Buffer:");
///    Terça-feira,07/07/2026_D'noite
/// System.out.println("Proxima aula...");
try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir + "CYBERCOPS.mp4"));
     BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(currentDir + "copia_CYBERCOPS.mp4"))){
      byte[] buffer = new byte[1024]; // Buffer 1kb em 1kb

            int bytesLidos;

            while((bytesLidos = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesLidos);
            }

            System.out.println("Vídeo copiado com sucesso.");
} catch (Exception e) {
    System.out.println("Erro ao copiar vídeo: " + e.getMessage());
}
System.out.println("==========//=================///=================//=============");
 System.out.println("08ª_manipulação de imagem");
 System.out.println("Próxima aula...");
//  Quinta-feira,09/07/2026
try {
    BufferedImage imagem = ImageIO.read(new File(currentDir + "imagem.jpeg"));
   if (imagem == null) {
      System.out.println("Imagem encontro");
      return;
   }
   Graphics g2d = imagem.createGraphics();
//    g2d.setFont(new Font( name:"Arial", Font.BOLD, size:50));
//     FontMetrics fm = g2d.getFontMetrics();
     g2d.setFont(new Font("Arial", Font.BOLD, 50));
            FontMetrics fm = g2d.getFontMetrics();
            String texto = "Texto no Centro";
            // centralizar texto na imagem
            int larguraTexto = fm.stringWidth(texto);
            int alturaTexto = fm.getHeight();

            // posicionamento
            int x = (imagem.getWidth() - larguraTexto) / 2;
            int y = (imagem.getHeight() - alturaTexto) / 2 + fm.getAscent();

            // desenhar retangulo
            g2d.setColor(Color.BLACK);
            g2d.fillRect(x - 10, y - fm.getAscent(), larguraTexto + 20, alturaTexto);

            // desenhar o texto em cima do retangulo
            g2d.setColor(Color.RED);
            g2d.drawString(texto, x, y);

            // liberacao de recursos
            g2d.dispose();

            // salvar a imagem
            File outputFile = new File(currentDir + "imagem_com_texto.png");

            ImageIO.write(imagem, "png", outputFile);

            System.out.println("Gerou o texto na imagem com sucesso.");

} catch (Exception e) {
     System.out.println("Erro ao processar imagem: " + e.getMessage());
}
    
System.out.println("----//----------//------//--------//------------//-------//----------");
  System.out.println("The End...");
    
    }
}
