package be.vdab.moneyInDaBank.rekeningen;

public class SpaarRekening extends Rekening {
    ZichtRekening zichtrekening;
    int lastInterestYear = 2020;

    public SpaarRekening(ZichtRekening zichtrekening) {
        super(zichtrekening.getPerson());
        this.zichtrekening = zichtrekening;
    }

    public void transferMoneyTozichtrekening(ZichtRekening zichtRekening, double amount) {
        this.totalMoney -= amount;
        zichtRekening.totalMoney += amount;
    }

    public void yearlyIntrest(int year) {
        if (year > lastInterestYear) {
            this.totalMoney *= 1.1;
            lastInterestYear = year;
        }
    }
}
