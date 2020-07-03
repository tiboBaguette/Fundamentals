package be.vdab.moneyInDaBank.rekeningen;

public class NotEnoughMoneyException extends Throwable {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}

