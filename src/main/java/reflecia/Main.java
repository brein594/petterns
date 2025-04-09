package reflecia;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void getClassInfo (Object obj) {
        Class<?> aClass = obj.getClass();
        Method[] method = aClass.getDeclaredMethods();
        Field[] fields = aClass.getFields();
        Field[] declaredFields = aClass.getDeclaredFields();
        Constructor<?>[] constructor = aClass.getConstructors();

        System.out.println(aClass);
        System.out.println(Arrays.toString(method));
        System.out.println(Arrays.toString(fields));
        System.out.println(Arrays.toString(declaredFields));
        System.out.println(Arrays.toString(constructor));
    }
    public static void setPrivateValue(Object obj, String fieldName, String newValue) {
        Class<?> aClass = obj.getClass();
        try {
          Field field = aClass.getDeclaredField(fieldName);
          field.setAccessible(true);
          field.set(obj, newValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Test createTestobjectWithValue(String value) {
        try {
            var constructor = Test.class.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);
            return constructor.newInstance(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void callPrivateMethod(Object obj, String methodName, String parameter) {
        Class<?> aClass = obj.getClass();
        try {
            Method method = aClass.getDeclaredMethod(methodName,String.class);
            method.setAccessible(true);
            method.invoke(obj, parameter);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        var test = new Test();
        getClassInfo(test);

        setPrivateValue(test, "value", "newValue");
        System.out.println(test);

        var test1 = createTestobjectWithValue("apple");
        System.out.println(test1);

        var test3 = new Test();
        System.out.println(test3);
        callPrivateMethod(test3, "setValue", "banan");
        System.out.println(test3);
    }
}
