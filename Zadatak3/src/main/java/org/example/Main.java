package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        List<Double> numbers = new ArrayList<Double>();

        while(true) {
          System.out.println("Unesite broj ili rijec stop: ");
          String line = ulaz.nextLine();
          if("stop".equalsIgnoreCase(line.trim())) {
              break;
          }
          try {
              Double num = Double.parseDouble(line);
              numbers.add(num);
          } catch(Exception e) {
              System.out.println("Uneseni string nije broj!");
              continue;
          }
        }
        System.out.println("Rezultati: ");
        System.out.println("MIN: " + MathUtils.min(numbers));
        System.out.println("MAX: " + MathUtils.max(numbers));
        System.out.println("MEAN: " + MathUtils.mean(numbers));
        System.out.println("STDEV: " + MathUtils.stdev(numbers));
    }
}