public class Vozilo {

   protected String imeVozila;
    protected int godinaProizvodnje;
     Gume gume;

    public Vozilo(String imeVozila, int godinaProizvodnje,Gume gume) {
        this.imeVozila = imeVozila;
        this.godinaProizvodnje = godinaProizvodnje;
        this.gume=gume;
    }

    @Override
    public String toString() {
        return "Vozilo{" +
                "imeVozila='" + imeVozila + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                ", gume=" + gume +
                '}';
    }
}
