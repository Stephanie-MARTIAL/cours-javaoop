package org.eclipse.classes;

// Les classes abstraites permettent de d�finir des comportements (m�thodes) dont l'impl�mentation (le code dans la m�thode) 
// se fait dans les classes filles
// Ainsi, on a l'assurance que les classes filles respecteront le comportement d�fini par la classe m�re abstraite

public abstract class User {
	
	
	// 3 types de visibilit�s: 
	// - public accessible partout dans le programme
	// - private accessible seulement dans la classe
	// - protected accessible dans le package mais aussi au niveau des classes filles 
	// (BONNES pratiques) � utiliser sur les classes abstraites
	
	private int id;
	private String nom;
	private String prenom;
	private static int count;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String nom, String prenom) {
		super();
		this.id = ++count;
		this.nom = nom;
		this.prenom = prenom;
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

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	public abstract void afficherNomComplet();
	
}

