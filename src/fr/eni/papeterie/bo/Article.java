/**
 * 
 */
package fr.eni.papeterie.bo;

/**
 * @author tanguy
 * classe abstraite Article
 *
 */
public abstract class Article {
	
	//Attributs d'instance
	private Integer idArticle;
	private String reference;
	private String marque;
	private String designation;
	private float prixUnitaire;
	private int qteStock;
	
	/**
	 * 
	 */
	public Article() {
	
	}
	
	/**
	 * @param idArticle
	 * @param reference
	 * @param marque
	 * @param designation
	 * @param prixUnitaire
	 * @param qteStock
	 */
	public Article(Integer idArticle, String reference, String marque, String designation, float prixUnitaire,
			int qteStock) {
		this( marque, reference, designation, prixUnitaire, qteStock);
		setIdArticle(idArticle); 
		
	}
	/**
	 * @param reference
	 * @param marque
	 * @param designation
	 * @param prixUnitaire
	 * @param qteStock
	 */
	public Article(String reference, String marque, String designation, float prixUnitaire, int qteStock) {
		
		setReference(reference);
		setMarque(marque);
		setDesignation(designation);
		setPrixUnitaire(prixUnitaire);
		setQteStock(qteStock);
		
	}

	/**
	 * @return the idArticle
	 */
	public Integer getIdArticle() {
		return idArticle;
	}

	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @return the prixUnitaire
	 */
	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	/**
	 * @return the qteStock
	 */
	public int getQteStock() {
		return qteStock;
	}

	/**
	 * @param idArticle the idArticle to set
	 */
	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}

	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @param prixUnitaire the prixUnitaire to set
	 */
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	/**
	 * @param qteStock the qteStock to set
	 */
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}

	@Override
	public String toString() {
		return String.format(
				"Article [idArticle=%s, reference=%s, marque=%s, designation=%s, prixUnitaire=%s, qteStock=%s]",
				idArticle, reference, marque, designation, prixUnitaire, qteStock);
	}
	
	

}
