import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Load class dynamically
            Class<?> clazz = Class.forName("SampleClass");

            // Get declared methods
            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("Methods in SampleClass:");
            for (Method method : methods) {
                System.out.println(method.getName() + " | Parameters: " + method.getParameterCount());
            }

            // Create instance and invoke method dynamically
            Object instance = clazz.getDeclaredConstructor().newInstance();
            Method method = clazz.getDeclaredMethod("greet", String.class);
            method.invoke(instance, "Divya");

        } catch (Exception e) {
            System.out.println("Reflection error: " + e.getMessage());
        }
    }
}

// Sample class to be loaded dynamically
class SampleClass {
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    private void hiddenMethod() {
        System.out.println("This method is private!");
    }
}