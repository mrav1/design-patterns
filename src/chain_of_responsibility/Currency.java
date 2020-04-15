package chain_of_responsibility;

public class Currency {

    private int amount;

    public Currency(int remainder) {
        this.amount =remainder;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}
