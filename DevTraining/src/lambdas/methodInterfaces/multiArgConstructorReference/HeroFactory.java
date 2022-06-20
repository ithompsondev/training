package lambdas.methodInterfaces.multiArgConstructorReference;

@FunctionalInterface
public interface HeroFactory {
    public Hero construct(String alias, String power, String weakness);
}
