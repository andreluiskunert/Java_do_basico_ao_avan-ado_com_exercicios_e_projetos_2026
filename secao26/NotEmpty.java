package secao26;
// Sábado_d'noite,08/08/2026
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NotEmpty {
    String message() default "O campo não pode ser mulo ou vazio";

    
}
