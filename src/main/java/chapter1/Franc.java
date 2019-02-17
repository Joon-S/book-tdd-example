package chapter1;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount;
    }
}
