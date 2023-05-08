import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            List<Object> listaSvihVozila=new ArrayList<Object>();
            Vozilo vozilo;
            Gume gume;


              while (true){
                  System.out.println("Unestite vozilo:");
                  String imeVozila =scanner.next();
                  if(imeVozila.equalsIgnoreCase("quit")){
                      break;
                  }
                  System.out.println("Unestite godinu proizvodnje:");
                  String godinaProizvodnjeUnos= scanner.next();
                  if(godinaProizvodnjeUnos.equalsIgnoreCase("quit")){
                      break;
                  }
                  int godinaProizvodnje = Integer.parseInt(godinaProizvodnjeUnos);

                  System.out.println("Unestite tip gume:");
                  String letnjeIliZimske=scanner.next();
                  if(letnjeIliZimske.equalsIgnoreCase("quit")){
                      break;
                  }
                  vozilo=new Vozilo(imeVozila,godinaProizvodnje);
                   listaSvihVozila.add(vozilo);
                   gume=new Gume(letnjeIliZimske);
                   listaSvihVozila.add(gume);
              }

              for(int i=0;i< listaSvihVozila.size();i++){
                  System.out.println("Lista svih vozila i godina proizvodnje: " + listaSvihVozila.get(i));
    }
}
}