// package secao26;
// import java.lang.reflect.Field;
// import java.lang.annotation.Annotation;

// public class Anotacoes {
//     // Quinta-feira_D'noite, 06/08/2026
//     public static void main(String[] args) {
//         System.out.println("----Anotações or Annotations ----");
//         System.out.println("01ª_annotations pre definidas");
//            Cachorro cachorro = new Cachorro();

//         cachorro.emitirSom();

//         cachorro.testeMover();
//         System.out.println("==//==//==//==//==//==//==//==//==//==//==//==");
//         System.out.println("02ª_annotation customizada");
//              Exemplo exemplo = new Exemplo();

//         // anotações geralmente vão precisar de try catch

//         // loop em cada um dos métodos
//         for(var metodo : exemplo.getClass().getDeclaredMethods()) {

//             System.out.println(metodo);

//             // verifica se a anotacao esta presente no método
//             if(metodo.isAnnotationPresent((Class<? extends Annotation>) Executar.class)) {

//                 // resgatar ql é a annotation
//                 Executar anotacao = metodo.getAnnotation((Class<T>) Executar.class);

//                 // loop baseado em qts vezes tem q executar
//                 for(int i = 0; i < anotacao.vezes(); i++) {

//                     // invoco o método -> mostrarMensagem
//                     try {
//                         metodo.invoke(exemplo);
//                     } catch (Exception e) {
//                         System.out.println("Erro: " + e.getMessage());
//                     }

//                 }

//             }

//         }

//         System.out.println("That's all for today, Java folks.");
//     }
// }
package secao26;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Anotacoes {

    // Quinta-feira, 06/08/2026
    public static void main(String[] args) {

        System.out.println("---- Anotações ou Annotations ----");

        System.out.println("01ª - annotations predefinidas");

        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();

        cachorro.testeMover();

        System.out.println("==//==//==//==//==//==//==//==//==//==//==//==");

        System.out.println("02ª - annotation customizada");

        Exemplo exemplo = new Exemplo();

        // Loop em cada um dos métodos
        for (var metodo : exemplo.getClass().getDeclaredMethods()) {

            System.out.println(metodo);

            // Verifica se a anotação está presente no método
            if (metodo.isAnnotationPresent(Executar.class)) {

                // Resgata a annotation
                Executar anotacao = metodo.getAnnotation(Executar.class);

                // Loop baseado em quantas vezes tem que executar
                for (int i = 0; i < anotacao.vezes(); i++) {

                    // Invoca o método
                    try {

                        metodo.invoke(exemplo);

                    } catch (Exception e) {

                        System.out.println("Erro: " + e.getMessage());

                    }
                }
            }
        }

        System.out.println("==//==//==//==//==//==//==//==//==//==//==//==");

        System.out.println("03ª - annotation para validar campos ");
        // sábados_D'noite, 08/08/2026
        Usuario usuario = new Usuario("Andre Luis", "pesquisador036@gmail.com");
        validarCampos(usuario);

        Usuario usuario2 = new Usuario("", "");
        validarCampos(usuario2);

        System.out.println("That's all for today, Java folks.");
    }

    // funcao para validar campos anotados
    public static void validarCampos(Object objeto) throws IllegalArgumentException {

        // Pegar a classe, pegar os campos, verificar se eles tem annotation
        Class<?> classe = objeto.getClass();

        for (Field campo : classe.getDeclaredFields()) {

            if (campo.isAnnotationPresent(NotEmpty.class)) {

                // saber o valor de message de cada campo
                NotEmpty anotacao = campo.getAnnotation(NotEmpty.class);

                // ativar a acessibilidade do campo privado
                campo.setAccessible(true);

                try {
                    Object valor = campo.get(objeto);

                    // validar o campo
                    if (valor == null || valor.toString().isEmpty()) {
                        System.out.println(anotacao.message());
                    }

                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }
           System.out.println("==//==//==//==//==//==//==//==//==//==//==//==");

        System.out.println("04ª - annotation com processador");
        // Domingo_D'noite, 09/08/2026
        Servico servico = new Servico();

            try {
                
                LogProcessor.processarLogs(servico);

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        System.out.println("--//-----///------////-------///----------////-------");
        System.out.println("That's all for today, Java folks");
    }
}