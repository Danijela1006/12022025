package Trgovina;
import java.util.Scanner;
import java.util.ArrayList;

public class UnosProizvoda {
    public static  void main (String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Proizvod> listaProizvoda = new ArrayList<>();

        System.out.println("Unesite proizvode (za prekid unosa unesite rijec 'end'):");

        while(true){  // izvrsava se sve dok ne dođe break, tj.dok korisnik ne unese riječ "end"
            System.out.println("Unesite naziv proizvoda: ");
            String naziv = s.nextLine();
            if(naziv.equals("end")){
                break;
            }
            System.out.println("Unesite cijenu proizvoda: ");
            double cijena = s.nextDouble();

            System.out.println("Unesite količinu proizvoda:");
            int kolicina = s.nextInt();
            s.nextLine();

            listaProizvoda.add(new Proizvod(naziv, cijena, kolicina));
        }
        System.out.println("\nUneseni su sljedeći proizvodi: ");
        for(Proizvod p : listaProizvoda){
            p.Informacije();
        }
        s.close();
    }
}
