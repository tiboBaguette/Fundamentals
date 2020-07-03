package be.vdab.moneyInDaBank.rekeningen;

public class Persoon {
    private String name;
    private String email;
    private int age;

    public Persoon(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
