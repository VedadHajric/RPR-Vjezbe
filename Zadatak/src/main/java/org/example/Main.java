package org.example;

public class Main {
    public static void main(String[] args) {
        InformacijeOStudentu student = new InformacijeOStudentu();
        student.setIme("Asmir");
        student.setPrezime("Hamidović");
        student.setBrojIndexa("19856");
        student.setGodinaStudija("druga");
        System.out.println(student.getIme() + " " + student.getPrezime() + ", " + student.getBrojIndexa()
                + ", " + student.getGodinaStudija() + ".");
        /*System.out.println(student.getPrezime());
        System.out.println(student.getBrojIndexa());
        System.out.println(student.getGodinaStudija());*/
        InformacijeONastavniku nastavnik = new InformacijeONastavniku();
        nastavnik.setIme("Robert");
        nastavnik.setPrezime("Kumerle");
        nastavnik.setTitulu("diplomirani znalac");
        System.out.println(nastavnik.getIme() + " " + nastavnik.getPrezime() + " " + nastavnik.getTitulu() + ".");

    }
}