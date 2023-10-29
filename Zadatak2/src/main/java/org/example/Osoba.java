package org.example;

import java.util.Objects;

public class Osoba{
    private String ime;
    private String prezime;
    public String getIme() { return ime; }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public Osoba(String s1, String s2) {
        this.ime = s1;
        this.prezime = s2;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Osoba osoba)) return false;
        return Objects.equals(getIme(), osoba.getIme()) && Objects.equals(getPrezime(), osoba.getPrezime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIme(), getPrezime());
    }


}
