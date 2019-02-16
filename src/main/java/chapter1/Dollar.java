package chapter1;

public class Dollar extends Money {

    public Dollar(int amount) {
        super.amount = amount;
    }

    public Dollar times(int multiplier) {
        amount *= multiplier;
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount;
    }
}
