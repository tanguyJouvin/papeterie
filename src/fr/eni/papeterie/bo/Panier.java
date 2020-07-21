/**
 * 
 */
package fr.eni.papeterie.bo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanguy
 *Le panier stocke les articles sélectionnés par l'utilisateur au cours de 
 *sa navigation. Le panier n'est pas sauvegardé
 */
public class Panier {
	
	/**
	 * Attributs de classe
	 */
	private float montant;
	private List<Ligne> lignesPanier;

	/**
	 * constructeur qui initialise
	 * les attributs déclarés plus haut
	 * @param montant
	 * @param lignesPanier
	 */
	public Panier() {
		float montant;
		this.lignesPanier = new ArrayList<Ligne>();
	}


	//Getters et Setters
	/**
	 * @return the lignesPanier
	 */
	public List<Ligne> getLignesPanier() {
		return lignesPanier;
	}
	
	/**
	 * Ajouter une ligne au panier. Le prix de la ligne est calculé (Qte*prix)
	 * 
	 * @param numero
	 * @param article
	 * @param qte
	 * 
	 */
	
	public void addLigne(Article article, int qte) {
	
		Ligne ajoutLigne = new Ligne(article, qte);
		lignesPanier.add(ajoutLigne);
	}

	/**
	 * Retourne la ligne sélectionnée du Panier ou null si pas trouvée
	 * 
	 * @param index
	 * @return
	 */
	
	public Ligne getLigne(int index) {
		return lignesPanier.get(index);
	}
	
	
	public void removeLigne(int index) {
		lignesPanier.remove(index);
	}
	
	public void updateLigne(int index, int newQte) {
		this.getLigne(index).setQte(newQte);
		this.lignesPanier.get(index).setQte(newQte);
	}
	
	/**
	 * @return the montant
	 */
	public float getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(float montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append("Panier : \n\n");
		for (Ligne ligne : lignesPanier) {
			bf.append("ligne " );
			bf.append( lignesPanier.indexOf(ligne) );
			bf.append( " :\t");
			bf.append(ligne.toString());
			bf.append("\n");
		}
		bf.append("\nValeur du panier : " + getMontant());
		bf.append("\n\n");
		return bf.toString();
	}



}
