package org.example;

public class Main {
    public static double sinus(double x) {
        x *= Math.PI / 180;
        double rez = 0;
        int stepen = 1;
        for(int i = 0; i < 15; i++, stepen += 2)
            rez += Math.pow(-1, i) * Math.pow(x, stepen) / faktorijel(stepen);
        return rez;
    }

    public static int faktorijel(int x) {
        if(x == 0) return 1;
        return x * faktorijel(x-1);
    }

    public static void main(String[] args) {
        if(args[0].equals("sinus"))
            System.out.println("rezultat je: " + sinus(Double.parseDouble(args[1])));
        else if(args[0].equals("faktorijel"))
            System.out.println("rezultat je: " + faktorijel(Integer.parseInt(args[1])));
        else
            System.out.println("GRESKA");
    }
}