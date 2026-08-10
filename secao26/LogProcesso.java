package secao26;
import java.io.*;
import java.lang.reflect.Method;
public class LogProcesso {
    public static void processarLogs(Object objeto) throws Exception{
        Class<?> classe = objeto.getClass();

        for(Method metodo : classe.getDeclaredMethods()) {

            if(metodo.isAnnotationPresent(Log.class)) {

                // ativar a acessibilidade do campo privado
                metodo.setAccessible(true);

                String currentDir = null;
                try (FileWriter writer = new FileWriter(currentDir + "metodos_log.txt", true)) {
                    
                    writer.write("Executando o método " + metodo.getName() + "\n");
                    metodo.invoke(objeto);

                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }

            }

        }

    }
}
