package chain_of_responsibility;

public interface DispenseChain {

    void next(DispenseChain chain);
    void dispense(Currency currency);

}
