package clase;

public class Calator {
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    public void primesteNotifivare(String notificare){
        System.out.println(nume+",ai primit"+notificare+".");
    }
}
