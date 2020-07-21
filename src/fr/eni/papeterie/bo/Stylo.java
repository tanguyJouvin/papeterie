/**
 * 
 */
package fr.eni.papeterie.bo;

/**
 * @author tangu
 *
 */
public class Stylo extends Article {

	/**
	 * Attribut de classe
	 */
	
	private String couleur;
	
	public Stylo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idArticle
	 * @param reference
	 * @param marque
	 * @param designation
	 * @param prixUnitaire
	 * @param qteStock
	 */
	public Stylo(Integer idArticle, String reference, String marque, String designation, float prixUnitaire,
			int qteStock, String couleur) {
		super(idArticle, reference, marque, designation, prixUnitaire, qteStock);
		setCouleur(couleur);
	}

	/**
	 * @param reference
	 * @param marque
	 * @param designation
	 * @param prixUnitaire
	 * @param qteStock
	 */
	public Stylo(String reference, String marque, String designation, float prixUnitaire, int qteStock, String couleur) {
		super(reference, marque, designation, prixUnitaire, qteStock);
		setCouleur(couleur);
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		String s = String.format("%s Stylo [Couleur=%s]", super.toString(), getCouleur());

		return s;
	}

	
	
	

}
