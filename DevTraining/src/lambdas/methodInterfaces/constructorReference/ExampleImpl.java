package lambdas.methodInterfaces.constructorReference;

import java.util.ArrayList;

public class ExampleImpl {

    private static final int EGSIZE = 10;

    public static void main(String[] args) {
        ArrayList<Object> emptyA = new ArrayList<>();
        ArrayList<Object> emptyB = new ArrayList<>();

        System.out.println("Empty List A Length: " + emptyA.size());
        System.out.println("\tUsing LAMBDA to initialize the empty list...");
        initialize(EGSIZE,emptyA,() -> new Object());
        System.out.println("Empty List A Length after init: " + emptyA.size());

        System.out.println("\nEmpty List B Length: " + emptyB.size());
        System.out.println("\tUsing METHOD REFERENCE=>CONSTRUCTOR REFERENCE to initialize the empty list...");
        initialize(EGSIZE,emptyB,Object::new);
        System.out.println("Empty List B Length after init: " + emptyB.size());
    }

    // Here we have helper method that requires a functional interface as an argument
    // We can pass in a lambda function to implement the functional method, which should return a new Integer
    // Or we can implement a constructor reference to implement the functional method, which should return a new Integer
    // Remember, we use lambdas and method references to implement and override the function method in a function
    // interface
    public static void initialize(int len, ArrayList<Object> items, Example factory) {
        for (int i = 0; i < len; i++) {
            items.add(factory.create());
        }
    }
}
