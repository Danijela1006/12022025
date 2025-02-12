package Objekti;

public class Studomat {
    public static void main(String[] args) {
        Studenti student1 = new Studenti("Jurica",  "Dragić",  22);
        Studenti student2 = new Studenti ("Jurica",  "Dragić",  44);

        Studenti student3 = new Studenti("Josip", "Grše");


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        student2.setIme("Maja");
        System.out.println(student2.getIme());
        student1.setPrezime("Lalić");
        System.out.println(student1.getPrezime());
        System.out.println(student2.getBrojIndeksa());

        System.out.println("Broj prijavljenih ispita: ");




    }
}
