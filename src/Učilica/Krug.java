package Učilica;

public class Krug {
    private int radijus;
    private String nazivKruga;
    private int povrsinaKruga;


    public Krug(int radijus, String nazivKruga, int povrsinaKruga){
        this.radijus = radijus;
        this.nazivKruga = nazivKruga;
        this.povrsinaKruga = povrsinaKruga;
    }

    // getteri
    public int getRadijus() {
        return radijus;
    }
    public String getNazivKruga() {
        return nazivKruga;
    }
    public int getPovrsinaKruga() {
        return povrsinaKruga;
    }

    // setteri
    public void setRadijus(int radijus) {
        this.radijus = radijus;
    }
    public void setNazivKruga(String nazivKruga) {
        this.nazivKruga = nazivKruga;
    }
    public void setPovrsinaKruga(int povrsinaKruga) {
        this.povrsinaKruga = povrsinaKruga;
    }
}
