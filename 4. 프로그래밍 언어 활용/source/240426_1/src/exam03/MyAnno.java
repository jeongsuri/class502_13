package exam03;

import java.lang.annotation.ElementType;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE,METHOD,FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    int min() default 10; //설정항목, 기본값 10
    int max() default 100; //설정항목, 기본값 100
    String[] names() default {"이름1"};
    String value();

}
