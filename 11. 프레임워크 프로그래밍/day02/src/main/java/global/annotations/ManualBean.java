package global.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //클래스명, 인터페이스명 위에
@Retention(RetentionPolicy.RUNTIME)
public @interface ManualBean {
}
