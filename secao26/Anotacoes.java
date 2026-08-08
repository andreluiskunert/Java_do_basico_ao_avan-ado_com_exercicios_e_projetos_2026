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

        System.out.println("That's all for today, Java folks.");
    }
}