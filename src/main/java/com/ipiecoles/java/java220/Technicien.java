package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Technicien extends Employe{
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    private Integer grade;

    public Technicien(){}

    public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire,
                      Integer grade, Boolean tempsPartiel, String sexe) {
        super(nom, prenom, matricule, dateEmbauche, salaire, tempsPartiel, sexe);
        this.grade = grade;
    }

    @Override
    public void setSalaire(Double salaire) {
         super.setSalaire(salaire * (1d+(this.grade / 10d)));
    }

    @Override
    public Integer getNbConges(){
        return Entreprise.NB_CONGES_BASE + this.getNombreAnneeAnciennete();
    }

    @Override
    public Double getPrimeAnnuelle() {
        return Entreprise.primeAnnuelleBase() * (1d+(this.grade / 10d))
                + Entreprise.PRIME_ANCIENNETE * super.getNombreAnneeAnciennete();
    }
}
