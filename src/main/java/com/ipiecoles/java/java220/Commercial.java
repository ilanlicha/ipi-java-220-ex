package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Commercial extends Employe{

    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    private Double caAnnuel = 0d;

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    private Integer performance;

    public Commercial() {

    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire,
                      Double caAnnuel) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire,
                      Double caAnnuel, Integer performance) {
        this(nom, prenom, matricule, dateEmbauche, salaire, caAnnuel);
        this.performance = performance;
    }

    public Double getPrimeAnnuelle() {
        return Math.max(Math.ceil(getCaAnnuel() * 0.05d),500);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commercial)) return false;

        Commercial commercial = (Commercial) o;

        if (Double.compare(commercial.caAnnuel, caAnnuel) != 0) return false;
        if (commercial.performance != performance) return false;
        return true;
    }

    public Boolean performanceEgale(Integer performance){
        return this.performance.equals(performance);
    }

    public Note equivalenceNote(){
        switch (this.performance){
            case 0:
            case 50:
                return Note.INSUFFISANT;
            case 100:
                return Note.PASSABLE;
            case 150:
                return Note.BIEN;
            case 200 :
                return Note.TRES_BIEN;
            default :
                return null;
        }
    }
}
