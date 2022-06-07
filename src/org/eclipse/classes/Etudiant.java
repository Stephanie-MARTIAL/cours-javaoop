package org.eclipse.classes;

import org.eclipse.enums.Sport;

public class Etudiant extends Personne {

	private String niveau;
	
	
	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, Adresse adresse, Sport sport, String niveau) {
		super(nom, prenom, adresse, sport);
		this.niveau = niveau;
	}

	public Etudiant(String nom, String prenom, Adresse adresse, Sport sport) {
		super(nom, prenom, adresse, sport);
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nom, String prenom, Adresse adresse) {
		super(nom, prenom, adresse);
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nom, String prenom, Sport sport) {
		super(nom, prenom, sport);
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nom, String prenom, Adresse adresse, String niveau) {
		super(nom, prenom, adresse);
		this.niveau = niveau;
	}

	public Etudiant(String nom, String prenom, Adresse adresse, String niveau, Sport sport) {
		super(nom, prenom, adresse, sport);
		this.niveau = niveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return super.toString() + "Etudiant [niveau=" + niveau + "]";
	}
	
	// Polymorphysme : cela veut dire simplement qu'une classe peut prendre
	// plusieurs formes (Principe d'heritage)
	// Redefinition
	@Override
	public void afficherNomMajuscule() {
		System.out.println(getNom().toLowerCase());
	}

}


