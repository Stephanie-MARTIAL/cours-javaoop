package org.eclipse.interfaces;

// Les interfaces servent à créer des comportements génériques: si plusieurs classes doivent obéir 
// à un comportement particulier, on créé une interface décrivant ce comportement, 
// et on la fait implémenter par les classes qui en ont besoin.

public interface IMiseEnForme {
	
	void afficherNomMajuscule();
	void afficherPrenomMinuscule();
	
}
