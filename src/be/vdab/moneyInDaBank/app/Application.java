package be.vdab.moneyInDaBank.app;

import be.vdab.moneyInDaBank.rekeningen.Persoon;
import be.vdab.moneyInDaBank.rekeningen.SpaarRekening;
import be.vdab.moneyInDaBank.rekeningen.ZichtRekening;

import java.time.Year;

public class Application {
    public static void main(String[] args) {
        Persoon persoon = new Persoon("Bob", "bob@gmail.com", 25);
        ZichtRekening zichtRekening = new ZichtRekening(persoon);
        SpaarRekening spaarRekening = new SpaarRekening(zichtRekening);

        System.out.println(zichtRekening.getTotalMoney());
        System.out.println(spaarRekening.getTotalMoney());
        zichtRekening.depositMoney(500);
        zichtRekening.transferMoneyToSpaarrekening(spaarRekening, 300);
        spaarRekening.transferMoneyTozichtrekening(zichtRekening, 100);
        System.out.println(zichtRekening.getTotalMoney());
        System.out.println(spaarRekening.getTotalMoney());
        System.out.println(spaarRekening.toString());
        System.out.println(zichtRekening.toString());

        Year year = java.time.Year.now();
        int currentYear = year.getValue();
        spaarRekening.yearlyIntrest(currentYear);
        System.out.println(spaarRekening.toString());

        zichtRekening.withdrawMoney(5000);

    }
}
