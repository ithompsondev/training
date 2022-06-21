package lambdas.methodInterfaces;

public class ExampleImpl {
    public static void main(String[] args) {
        // We represent our functional interface as a lambda, as we normally would
        int len1 = countStrLen("hello",(str) -> str.length());

        // Or we write our lambda as a method reference
        int len2 = countStrLen("hello",String::length);

        // Or if we did not have a helper method, we use lambdas instead of anon classes
        Example eg = (str) -> { return str.length(); };

        Example eg2 = String::length;

        System.out.println("Length of \'hello\': " + len1 + ", LAMBDA");
        System.out.println("Length of \'hello\': " + len2 + ", METHOD REFERENCE");
        System.out.println("Length of \'hello\': " + eg.strLen("hello") + ", LAMBDA (NO HELPER)");
        System.out.println("Length of \'hello\': " + eg2.strLen("hello") + ", METHOD REFERENCE (NO HELPER)");
    }

    public static Integer countStrLen(String str, Example example) {
        // make use of the functional method from our functional interface
        return example.strLen(str);
    }
}
