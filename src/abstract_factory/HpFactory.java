package abstract_factory;

public class HpFactory extends AbstractFactory {
    @Override
    public CPU createCPU() {
        return new HpCpu();
    }

    @Override
    public MMU createMMU() {
        return new HpMmu();
    }
}
