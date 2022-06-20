package lambdas.methodInterfaces;

@FunctionalInterface
public interface Example {
    // This gives us the target type for any lambda
    public Integer strLen(String str);
}
