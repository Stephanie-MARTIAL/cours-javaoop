package org.eclipse.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.eclipse.classes.*;
import org.eclipse.enums.Sport;
import org.eclipse.exceptions.IncorrectCodePostalException;

public class Main {

	// throws ca permet de dire que ici la methode va renvoyer une exception
	public static void main(String[] args) {

		System.out.println("-----------------------------EXCEPTION-----------------------------");

		int x = 5, y = 0;
		try {
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
		System.out.println("Fin de calcul");

		System.out.println("-----------------------------OBJ-----------------------------");

		// Deux methodes pour creer un objet ou une instance de classe
		Personne p1 = new Personne("Doe", "Pat", Sport.BASKET);

		// En passant par les Setters
//				p1.setId(1);
//				p1.setNom("Wick");
//				p1.setPrenom("John");

		System.out.println(p1);

		System.out.println(p1.getNom());

		System.out.println(Personne.getNbrPersonnes());

		// En passant par le constructeur
		Personne p2 = new Personne("Doe", "Pat", Sport.TENNIS);
		System.out.println(p2.getPrenom());

		System.out.println(Personne.getNbrPersonnes());

		Personne p3 = new Personne("Wayne", "Bruce", Sport.CROSS_FIT);
		System.out.println(p3);

		System.out.println(Personne.getNbrPersonnes());

		try {

			Adresse a1 = new Adresse("Forge Stellaire", 0001, "Coruscant");

			Personne p4 = new Personne("Darth", "Revan", a1);
			System.out.println(p4);

			Enseignant ens1 = new Enseignant("Darth", "Sidious", a1, 0.0f, Sport.BASKET);

			Personne ens2 = new Enseignant("Darth", "Maul", a1, 0.0f, Sport.CROSS_FIT);

			System.out.println("----------------------------------------------------------");
			ens1.afficherNomMajuscule();
			ens1.afficherPrenomMinuscule();
			System.out.println("----------------------------------------------------------");

			System.out.println(ens1);

			Etudiant etu1 = new Etudiant("Darth", "Vador", a1, "Full Ultime");

			Etudiant etu2 = new Etudiant("Darth", "Revan", a1, "Full Ultime");

			System.out.println("----------------------------------------------------------");
			etu1.afficherNomMajuscule(); // Doit afficher en minuscule (redefinition ds classe enfant)
			etu2.afficherPrenomMinuscule();
			
			System.out.println("----------------------------------------------------------");

			System.out.println(etu1);

			System.out.println("-----------------------------EXOS-----------------------------");

			// Creer deux objets de type Etudiant et deux objets de type
			// Enseignant et stocker les tous dans un seul tableau.
			// 2 Parcourir le tableau et afficher pour chacun soit le salaire soit le
			// niveau

			Personne[] personnes = { ens1, ens2, etu1, etu2 };

			for (Personne perso : personnes) {
				// si l'objet perso est une instance du type Enseignant
				if (perso instanceof Enseignant) {
					System.out.println(((Enseignant) perso).getSalaire());
				} else {
					System.out.println(((Etudiant) perso).getNiveau());
				}
			}

			// Avec une collection (dynamique)

			// List<Personne> pList = new ArrayList<Personne>();
			// pList.add(ens1);
			// pList.add(etu1);

			List<Personne> pList = Arrays.asList(ens1, ens2, etu1, etu2);

			pList.forEach((perso) -> System.out.println(perso));

			int res = (random(1, 25));
			System.out.println(res);

			System.out.println(repeat("tata ", 15));

			System.out.println("----------------------------------------------------------------------------------");

			Admin admin1 = new Admin("Pierre", "Henry");
			Admin admin2 = new Admin("Jacques", "Chirac");
			
//			admin1.setId(1);
//			admin1.setNom("Pierre");
//			admin1.setPrenom("Henry");
			
			admin1.afficherNomComplet();
			System.out.println(admin1);
			System.out.println(admin2);

		} catch (IncorrectCodePostalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int calcVitesseMoyenne(int temps, int distance) {
		return temps / distance;
	}

//	public static boolean ConstruireUntriangle(int cote1, int cote2, int cote3) {
//
//		if (true) {
//			System.out.println("Vous pouvez construire un triangle");
//		}
//	}

//	public static int CalcLePlusGrandDiviseurCommun(int a, int b) {
//
//	}

	public static void imprimeInitiales(String prenom, String nom) {

		String firstLetterPrenom = prenom.substring(0, 1);
		String firstLetterNom = nom.substring(0, 1);

		System.out.println((firstLetterPrenom + firstLetterNom).toUpperCase());

	}

	public int maximum(int a, int b) {
		if (a > b) {
			return a;
		} else
			return b;
	}

	public static String repeat(String mot, int nbRepetitions) {
		String motRepete = " ";
		for (int i = 1; i <= nbRepetitions; i++) {
			motRepete += mot;
		}
		return motRepete;
	}

	public static int random(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}

	public static boolean containValue(int[] array, int item) {

		for (int n : array) {
			if (item == n) {
				return true;
			}
		}
		return false;
	}

}
