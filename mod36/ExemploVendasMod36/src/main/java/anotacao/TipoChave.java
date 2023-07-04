package anotacao;

import java.lang.annotation.*;

/**
 * @author Raphael Van Well
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
