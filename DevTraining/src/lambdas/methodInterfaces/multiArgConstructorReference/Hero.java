package lambdas.methodInterfaces.multiArgConstructorReference;

public class Hero {
    private final String alias;
    private final String power;
    private final String weakness;

    public Hero(String alias, String power, String weakness) {
        this.alias = alias;
        this.power = power;
        this.weakness = weakness;
    }

    public String getAlias() {
        return alias;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }

    @Override
    public String toString() {
        return this.alias + ", has the power of: " + this.power + ", but is weak to " + this.weakness;
    }

    public static void main(String[] args) {
        // We use a lambda with multiple arguments to implement the functional method
        // In the HeroFactory functional interface (calling the multi arg constructor)
        HeroFactory heroFactory = (alias,power,weakness) -> {
            return new Hero(alias,power,weakness);
        };

        Hero superman = heroFactory.construct("Superman","Flight","Kryptonite");
        System.out.println(superman);

        // We use a constructor reference to implement the functional method
        // in the HeroFactory functional interface (the compile will use the multi arg constructor)
        HeroFactory otherHeroFactory = Hero::new;

        Hero batman = otherHeroFactory.construct("Batman","Money","Nothing");
        System.out.println(batman);
    }
}
