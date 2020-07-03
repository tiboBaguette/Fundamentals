package be.vdab.randomObject;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int randomNumber = random.nextInt(1000);
            System.out.println(randomNumber);
            if (randomNumber < 250) {
                System.out.println("PIEF");
            } else if (randomNumber < 500) {
                System.out.println("POEF");
            } else {
                System.out.println("PAF");
            }
        }
    }
}
