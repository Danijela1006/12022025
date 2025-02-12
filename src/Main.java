//import Objekti.Studenti;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private String ime;
    private String prezime;
    private int OIB;

    public String dohvatiPodatke(){
        return "Ime: " + ime + ", Prezime: " + prezime + ", OIB: " + OIB;
    }

    public static void main(String[] args) {
        Main polaznik1 = new Main();  // objekt iz klase Main
        Main polaznik2 = new Main();

        polaznik1.ime = "Perica";
        polaznik1.prezime = "Jukić";
        polaznik1.OIB = 234567812;

        polaznik2.ime = "Marija";
        polaznik2.prezime = "Mandić";
        polaznik2.OIB = 222221133;

        System.out.println(polaznik1);
        System.out.println(polaznik1.dohvatiPodatke());

        System.out.println(polaznik2.dohvatiPodatke());

        //Studenti studenti = new Studenti();

    }
}