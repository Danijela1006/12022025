package Učilica;

public class Krug {
    private int radijus;
    private String nazivKruga;


    public Krug(int radijus, String nazivKruga){
        this.radijus = radijus;
        this.nazivKruga = nazivKruga;
    }

    // getteri
    public int getRadijus() {
        return radijus;
    }
    public String getNazivKruga() {
        return nazivKruga;
    }


    // setteri
    public void setRadijus(int radijus) {
        this.radijus = radijus;
    }
    public void setNazivKruga(String nazivKruga) {
        this.nazivKruga = nazivKruga;
    }

}
