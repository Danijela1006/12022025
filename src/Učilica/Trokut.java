package Učilica;

public class Trokut {
    private int strA;
    private int strB;
    private int strC;
    private String nazivTrokuta;
    private int opsegTrokuta;

    public Trokut (int strA, int strB, int strC, String nazivTrokuta, int povrsinaTrokuta){
        this.strA = strA;
        this.strB = strB;
        this.strC = strC;
        this.nazivTrokuta = nazivTrokuta;
        this.opsegTrokuta = povrsinaTrokuta;
    }

    public int opsegTrokuta (){
        opsegTrokuta = strA * strB * strC;
        return opsegTrokuta;
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
    public int getOpsegTrokuta() {
        return opsegTrokuta;
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
    public void setOpsegTrokuta(int opsegTrokuta) {
        this.opsegTrokuta = opsegTrokuta;
    }
}
