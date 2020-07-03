package be.vdab.moneyInDaBank.rekeningen;

public class ZichtRekening extends Rekening {

    public ZichtRekening(Persoon person) {
        super(person);
    }

    public void depositMoney(double money) {
        this.totalMoney = totalMoney + money;
    }

    public void withdrawMoney(double money) {
        try {
            if (this.totalMoney < money) {
                throw new NotEnoughMoneyException("Withdraw amount is higher than bank total");
            }
        } catch (NotEnoughMoneyException noMoreIceCreamException) {
            System.out.println(noMoreIceCreamException.toString());
        }
        this.totalMoney = totalMoney - money;
    }

    public void transferMoneyToSpaarrekening(SpaarRekening spaarRekening, double amount) {
        this.totalMoney -= amount;
        spaarRekening.totalMoney += amount;
    }
}
