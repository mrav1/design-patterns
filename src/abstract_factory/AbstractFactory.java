package abstract_factory;

/*

  1. Creates an instance of several families of classes.
  2. Provide an interface for creating families of related
     or dependent objects without specifying their concrete classes.

 */
public abstract class AbstractFactory {

    private static final HpFactory HP_FACTORY = new HpFactory();
    private static final DellFactory DELL_FACTORY = new DellFactory();

    public static AbstractFactory getFactory(FactoryType factoryType) {
        AbstractFactory factory = null;
        switch (factoryType) {
            case HP:
                factory = HP_FACTORY;
                break;
            case DELL:
                factory = DELL_FACTORY;
                break;
        }
        return factory;
    }

    public abstract CPU createCPU();

    public abstract MMU createMMU();

}
