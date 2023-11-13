package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Laptop {
    private String brend;
    private String model;
    private double cijena;
    private int ram;
    private int hdd;
    private int ssd;
    private String procesor;
    private String gtafickaKartica;
    private double velicinaEkrana;
    public Laptop() {};

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getGtafickaKartica() {
        return gtafickaKartica;
    }

    public void setGtafickaKartica(String gtafickaKartica) {
        this.gtafickaKartica = gtafickaKartica;
    }

    public double getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }

    interface LaptopDao {
        void dodajLaptopUListu(Laptop laptop);
        void dodajLaptopUFile(Laptop laptop) throws IOException;
        Laptop getLaptop(String procesor) throws Exception;
        void napuniListu(ArrayList<Laptop> laptopi);
        ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException;
    };

    class LaptopDaoSerializableFile implements LaptopDao {
        File file;
        ArrayList<Laptop> laptopi;
        @Override
        public  void dodajLaptopUListu(Laptop laptop) {
            laptopi.add(laptop);
        }
        @Override
        public void dodajLaptopUFile(Laptop laptop) throws FileNotFoundException
    }
}