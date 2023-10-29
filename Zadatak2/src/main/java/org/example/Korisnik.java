package org.example;

import java.util.Objects;

public class Korisnik extends Osoba{
    private Racun racun;
    public Korisnik(String s1, String s2) {
        super(s1, s2);
    }
    public void dodajRacun(Racun racun) {
        this.racun = racun;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Korisnik korisnik = (Korisnik) o;
        return Objects.equals(racun, korisnik.racun);
    }
}
