package abstract_factory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(FactoryType.HP);
        factory.createCPU();
        factory.createMMU();
    }

}
