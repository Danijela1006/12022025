package Učilica;

public class Pravokutnik {
    private int stranaA;
    private int stranaB;
    private String nazivPravokutnika;
    private int povrsinaPrav;

    public Pravokutnik(int stranaA, int stranaB, String nazivPravokutnika, int povrsinaPrav){
        this.stranaA = stranaA;
        this.stranaB = stranaB;
        this.nazivPravokutnika = nazivPravokutnika;
        this.povrsinaPrav = povrsinaPrav;

    }

    // getteri
    public int getStranaA() {
        return stranaA;
    }
    public int getStranaB() {
        return stranaB;
    }
    public String getNazivPravokutnika() {
        return nazivPravokutnika;
    }
    public int getPovrsinaPrav() {
        return povrsinaPrav;
    }

    // setteri
    public void setStranaA(int stranaA) {
        this.stranaA = stranaA;
    }
    public void setStranaB(int stranaB) {
        this.stranaB = stranaB;
    }
    public void setNazivPravokutnika(String nazivPravokutnika) {
        this.nazivPravokutnika = nazivPravokutnika;
    }
    public void setPovrsinaPrav(int povrsinaPrav) {
        this.povrsinaPrav = povrsinaPrav;
    }
}
