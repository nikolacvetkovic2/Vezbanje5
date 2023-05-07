import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            List<Vozilo> listaSvihVozila=new ArrayList<>();
            Vozilo vozilo;
             Gume gume=null;

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
                  vozilo=new Vozilo(imeVozila,godinaProizvodnje,gume);
                   listaSvihVozila.add(vozilo);
              }

              for(int i=0;i< listaSvihVozila.size();i++){

                  System.out.println("Lista svih vozila i godina proizvodnje: " + listaSvihVozila.get(i));
    }
}
}