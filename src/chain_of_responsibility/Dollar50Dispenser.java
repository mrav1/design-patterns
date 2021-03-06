package chain_of_responsibility;

public class Dollar50Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void next(DispenseChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        int var = 50;
        if (currency.getAmount() >= var) {
            int num = currency.getAmount() / var;
            int remainder = currency.getAmount() % var;
            System.out.println("Dispensing " + num + " " + var + "$ note");
            if (remainder != 0)
                chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(currency);
        }
    }
}
