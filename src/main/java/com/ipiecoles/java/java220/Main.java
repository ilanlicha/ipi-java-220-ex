package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cadre c1 = new Cadre("Doe", "John", "T12345", LocalDate.now(), 2500.0, false, "masculin", 1.5d);
        Cadre c2 = new Cadre("Doe", "John", "T12345", LocalDate.now(), 2500.0, false, "masculin", 1.5d);
        Cadre c3 = new Cadre("Licha", "Ilan", "T98743", LocalDate.now(), 45000.0, true, "masculin", 6.5d);

        Cadre[] cadres = new Cadre[] {c1, c2, c3};
        for(Cadre c : cadres){
            System.out.println(c);
        }

        System.out.println("c1 = c2 ? " + c1.equals(c2));
        System.out.println("c1 = c3 ? " + c1.equals(c3));

        System.out.println("c1 hash : " + c1.hashCode());
        System.out.println("c2 hash : " + c2.hashCode());
        System.out.println("c3 hash : " + c3.hashCode());

        System.out.println("c1 prime annuelle : " + c1.getPrimeAnnuelle());
        System.out.println("c1 congés : " + c1.getNbConges());
        System.out.println("c3 prime annuelle : " + c3.getPrimeAnnuelle());
        System.out.println("c3 congés : " + c3.getNbConges());
    }
}
