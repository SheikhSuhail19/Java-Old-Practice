package ReflectionAPI;

import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Get the Class object for the String class
            Class<?> stringClass = Class.forName("java.lang.String");

            // Get all public methods of the String class
            Method[] methods = stringClass.getMethods();

            // Print the names of the methods
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
