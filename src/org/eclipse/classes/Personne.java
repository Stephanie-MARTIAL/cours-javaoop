package org.eclipse.classes;

import org.eclipse.interfaces.IMiseEnForme;
import org.eclipse.enums.Sport;

import java.util.Arrays;
import java.util.List;


// POJO -> PLAIN OLD JAVA OBJECT
public class Personne implements IMiseEnForme {

	private int id;
	private String nom;
	private String prenom;
	// declaration d'un type sport de type enum
	private Sport sport;
	// Agregation : type d'association
	// Si le user est supprimé, Adresse continue d'exister
	private Adresse adresse;
	// attribut statique => attribut dont la valeur est paratgee
	// par toutes les instances
	private static int nbrPersonnes;

	public Personne() {
		super();
		nbrPersonnes++;
	}

	// Surcharge contructeur
	public Personne(String nom, String prenom, Sport sport) {
		super();
		this.id = ++nbrPersonnes;
		this.nom = nom;
		this.prenom = prenom;
		this.sport = sport;
	}

	// Surcharge contructeur
		public Personne(String nom, String prenom, Adresse adresse) {
			super();
			this.id = ++nbrPersonnes;
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.sport = sport;
		}
		
	// Surcharge contructeur
	public Personne(String nom, String prenom, Adresse adresse, Sport sport) {
		super();
		this.id = ++nbrPersonnes;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.sport = sport;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public static int getNbrPersonnes() {
		return nbrPersonnes;
	}
	
	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public void afficherNomComplet(String nom) {
		System.out.println(nom.toUpperCase());
	}
	
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", sport=" + sport + ", adresse="
				+ adresse + "]";
	}

	// Methode préfix par final -> méthode que l'on ne pourra pas redéfinir dans les classes filles 
	// Surcharge de methode afficherNomComplet(String nom, String prenom)
	// Rajout d'un deuxieme parametre
	public final void afficherNomComplet(String nom, String prenom) {
		System.out.println(nom.toUpperCase() + " " + prenom.toUpperCase());
	}

	// Surcharge de methode afficherNomComplet(String nom, String prenom, Adresse adresse)
	// Rajout d'un deuxieme parametre
	public void afficherNomComplet(String nom, String prenom, Adresse adresse) {
		System.out.println(nom.toUpperCase() + " " + prenom.toUpperCase() + " " + adresse);
	}
	
	@Override
	public void afficherNomMajuscule() {
		System.out.println(nom.toUpperCase());
	}

	@Override
	public void afficherPrenomMinuscule() {
		System.out.println(prenom.toLowerCase());
	}
}
