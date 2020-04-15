package chain_of_responsibility;

public class AtmDispenser {

    public static void dispense(int amount) {
        if (amount < 10 || amount % 10 != 0) {
            System.err.println("Currency must be multiple of 10");
            return;
        }
        Dollar50Dispenser d1 = new Dollar50Dispenser();
        Dollar20Dispenser d2 = new Dollar20Dispenser();
        Dollar10Dispenser d3 = new Dollar10Dispenser();

        d1.next(d2);
        d2.next(d3);

        d1.dispense(new Currency(amount));
    }
}
