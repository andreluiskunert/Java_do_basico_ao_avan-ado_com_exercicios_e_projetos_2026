package secao26;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Executar {
    int vezes();
}

public class Exemplo {
    @Executar(vezes = 3)
    public void mostrarMensagem(){
        System.out.println("executando método....");
    }
}
