public class Autobuz {
    private string model;
    private Integer an;
    private Integer nrLocuri;

    public Autobuz(string model, Integer an, Integer nrLocuri) {
        this.model = model;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descrieAutbobuz(Linie linie){
        System.out.println("Linie:"+linie.toString()+ "Autobuz:"+this.toString());

    }
    @Override
    public String toString(){
        return "Autobuz{"+
                "model="+model+'\''+
                ",an="+  an+
                ", nrLocuri="+nrLocuri+ '}';

    }
}
