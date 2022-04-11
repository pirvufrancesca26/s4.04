package clase;

public class CardSTB implements ModPlata {
    @Override
    public void plateste(float pret){
        System.out.println("S-a realizat plata cu card bancar in valorare de:"+pret+"prin card STB");
    }
}
