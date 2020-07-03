package be.vdab.moneyInDaBank.rekeningen;

public class ZichtRekening extends Rekening {

    public ZichtRekening(Persoon person) {
        super(person);
    }

    public void depositMoney(double money) {
        this.totalMoney = totalMoney + money;
    }

    public void withdrawMoney(double money) {
        this.totalMoney = totalMoney - money;
    }

    public void transferMoneyToSpaarrekening(SpaarRekening spaarRekening, double amount) {
        this.totalMoney -= amount;
        spaarRekening.totalMoney += amount;
    }
}
