public class Vozilo {

   protected String imeVozila;
    protected int godinaProizvodnje;

    public Vozilo(String imeVozila, int godinaProizvodnje) {
        this.imeVozila = imeVozila;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    @Override
    public String toString() {
        return "Vozilo{" +
                "imeVozila='" + imeVozila + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                '}';
    }
}
