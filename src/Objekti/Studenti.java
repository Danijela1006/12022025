package Objekti;

import java.util.ArrayList;

class Studenti {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private ArrayList<String> prijavljeniIspiti = new ArrayList<>();

    // metoda za upis ispita i ispisati te ispite
    public void listaIspita(int brojIspita){

    }

    // konstruktor
    public Studenti (String ime, String prezime, int brojIndeksa){
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;

    }

    // seteri
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    // getteri
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public int getBrojIndeksa() {
        return brojIndeksa;
    }
    public Studenti(String ime, String prezime) {
        this (ime, prezime, 5);
    }

//    public Studenti(String ime, String prezime) {
//        this.ime = ime;
//        this.prezime = prezime;
//    }

    @Override
    public String toString() {
        return "Student: {" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojIndeksa=" + brojIndeksa +
                ", lista ispita=" + prijavljeniIspiti;
    }



}
