package be.vdab.moneyInDaBank.rekeningen;

public class Rekening {
    Persoon person;
    double totalMoney;

    public Rekening(Persoon person) {
        this.person = person;
        this.totalMoney = 0;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public Persoon getPerson() {
        return person;
    }

    public void setPerson(Persoon person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Rekening{" +
                "person=" + person +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
