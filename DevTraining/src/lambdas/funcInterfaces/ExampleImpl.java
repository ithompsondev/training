package lambdas.funcInterfaces;

public class ExampleImpl {

    public static void main(String[] args) {
        // Long syntax
        Example eg = new Example() {
            @Override
            public void apply() {
                System.out.println("LONG: Apply, from functional interface, Example");
            }
        };
        eg.apply();

        // Lambda syntax
        // Since Example is a functional interface, Java infers that the lambda is overriding apply()
        Example eg1 = () -> {
            System.out.println("LAMBDA: Apply, from functional interface, Example");
        };
        eg1.apply();

        // Lambda, syntax
        // Since AnotherExample extends the Example Interface, Java infers that the lambda is overriding super.apply()
        AnotherExample eg2 = () -> {
            System.out.println("LAMBDA: Apply, from extending functional interface, AnotherExample");
        };
        eg2.apply();
    }

}
