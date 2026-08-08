package secao26;
import java.lang.annotation.*;
public class Executar {
    // Sexta-feira_D'Noite, 07/08/2026
@Retention(RetentionPolicy.RUNTIME) // em tempo de execução
@Target(ElementType.METHOD) // aplicada em métodos
@interface ExecutarMetodo {
    int vezes() default 1;
}

public int vezes() {
    throw new UnsupportedOperationException("Unimplemented method 'vezes'");
}
}
