package Učilica;

public class Pravokutnik {
    private int stranaA;
    private int stranaB;
    private String nazivPravokutnika;

    public Pravokutnik(int stranaA, int stranaB, String nazivPravokutnika){
        this.stranaA = stranaA;
        this.stranaB = stranaB;
        this.nazivPravokutnika = nazivPravokutnika;
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
}
