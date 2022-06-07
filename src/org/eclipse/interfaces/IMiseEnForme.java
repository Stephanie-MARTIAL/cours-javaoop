package org.eclipse.interfaces;

// Les interfaces servent � cr�er des comportements g�n�riques: si plusieurs classes doivent ob�ir 
// � un comportement particulier, on cr�� une interface d�crivant ce comportement, 
// et on la fait impl�menter par les classes qui en ont besoin.

public interface IMiseEnForme {
	
	void afficherNomMajuscule();
	void afficherPrenomMinuscule();
	
}
