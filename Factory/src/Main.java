import FlyweightFactory.FlyweightFactory;

public class Main {
    public static void main(String[]args){
        Autobuz autobuz1=("A1",1995,40);
        Autobuz autobuz2=("A2",1996,40);
        Autobuz autobuz3=("A3",1997,40);
        Autobuz autobuz4=("A4",1998,40);

         FlyweightFactory flyweightFactory=new FlyweightFactory();
         Linie linie1=flyweightFactory.getLinie(168);
         Linie linie2=flyweightFactory.getLinie(133);

         autobuz1.descrieAutbobuz(flyweightFactory.getLinie(168));
        autobuz2.descrieAutbobuz(linie2);
        autobuz3.descrieAutbobuz(linie3);
        autobuz4.descrieAutbobuz(linie4);
    }
}
