package exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        Class clazz = Member.class;
        Constructor constructors = clazz.getConstructors()[0];
        Object object = constructors.newInstance();

        Field field = clazz.getDeclaredField("str");
        System.out.println(field);
        field.setAccessible(true);

        field.set(object, "DEF");

        System.out.println(object);
    }
}
