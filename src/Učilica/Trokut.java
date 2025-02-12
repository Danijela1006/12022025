package Učilica;

public class Trokut {
    private int strA;
    private int strB;
    private int strC;
    private String nazivTrokuta;


    public Trokut (int strA, int strB, int strC, String nazivTrokuta){
        this.strA = strA;
        this.strB = strB;
        this.strC = strC;
        this.nazivTrokuta = nazivTrokuta;

    }

    // getteri
    public int getStrA() {
        return strA;
    }
    public int getStrB() {
        return strB;
    }
    public int getStrC() {
        return strC;
    }
    public String getNazivTrokuta() {
        return nazivTrokuta;
    }


    // setteri
    public void setStrA(int strA) {
        this.strA = strA;
    }
    public void setStrB(int strB) {
        this.strB = strB;
    }
    public void setStrC(int strC) {
        this.strC = strC;
    }
    public void setNazivTrokuta(String nazivTrokuta) {
        this.nazivTrokuta = nazivTrokuta;
    }

}
