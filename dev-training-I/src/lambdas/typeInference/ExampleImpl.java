package lambdas.typeInference;

public class ExampleImpl {
    public static void main(String[] args) {
        // Using type inference/target typing for lambdas
        // Most notable to ES6 arrow functions and how they can be stored in a variable
        Example eg = (name,age) -> { System.out.println("Welcome, " + name + ", of " + age + " years"); };
        eg.welcome("John Smith",22);
        eg.welcome("Mary Sue",24);
    }
}
