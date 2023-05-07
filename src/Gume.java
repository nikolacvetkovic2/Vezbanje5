public class Gume extends Vozilo {

   public String letnjeIliZimske;

    public Gume(String imeVozila, int godinaProizvodnje, Gume gume) {
        super(imeVozila, godinaProizvodnje, gume);
    }


    @Override
    public String toString() {
        return "Gume{" +
                "imeVozila='" + imeVozila + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                ", gume=" + gume +
                '}';
    }
}


