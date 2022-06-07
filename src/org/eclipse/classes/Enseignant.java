package org.eclipse.classes;

import org.eclipse.enums.Sport;

public class Enseignant extends Personne {

	private double salaire;

	public Enseignant() {
		// TODO Auto-generated constructor stub
	}

	public Enseignant(int id, String nom, String prenom, double salaire, Sport sport) {
		super(nom, prenom, sport);
		this.salaire = salaire;
	}

	public Enseignant(String nom, String prenom, Adresse adresse, double salaire, Sport sport) {
		super(nom, prenom, adresse, sport);
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return super.toString() + "Enseignant [salaire=" + salaire + "]";
	}

}
