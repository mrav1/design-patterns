package abstract_factory;

public class DellFactory extends AbstractFactory {
    @Override
    public CPU createCPU() {
        return new DellCpu();
    }

    @Override
    public MMU createMMU() {
        return new DellMmu();
    }
}
