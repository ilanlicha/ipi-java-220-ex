package com.ipiecoles.java.java220;

import java.util.Objects;

import org.joda.time.LocalDate;

public class Cadre extends Employe {
    private Double coefficiant = 1d;

    public Double getCoefficiant() {
        return coefficiant;
    }

    public void setCoefficiant(Double coefficiant) {
        this.coefficiant = coefficiant;
    }

    public Cadre(){}

    public Cadre(String nom,String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Boolean tempsPartiel, String sexe, Double coefficiant){
        super(nom, prenom, matricule, dateEmbauche, salaire, tempsPartiel, sexe);
        this.coefficiant = coefficiant;
    }

    @Override
	public String toString() {
		return "Cadre{" +
				"coefficiant=" + coefficiant +
				"} " + super.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Cadre)) return false;
		if (!super.equals(o)) return false;
		Cadre that = (Cadre) o;
		return Objects.equals(coefficiant, that.coefficiant);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), coefficiant);
	}

    @Override
    public Double getPrimeAnnuelle() {
        return Entreprise.primeAnnuelleBase() * this.coefficiant;
    }

    @Override
    public Integer getNbConges(){
        return (int) (Entreprise.NB_CONGES_BASE + Math.ceil(this.coefficiant));
    }
}
