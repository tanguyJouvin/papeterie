/**
 * 
 */
package fr.eni.papeterie.bo;

/**
 * @author tangu
 *
 */
public class Ramette extends Article {
	
	private int grammage;

	/**
	 * 
	 */
	public Ramette() {
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
	public Ramette(Integer idArticle, String reference, String marque, String designation, float prixUnitaire,
			int qteStock, int grammage) {
		super(idArticle, reference, marque, designation, prixUnitaire, qteStock);
		setGrammage(grammage);
	}

	/**
	 * @param reference
	 * @param marque
	 * @param designation
	 * @param prixUnitaire
	 * @param qteStock
	 */
	public Ramette(String reference, String marque, String designation, float prixUnitaire, int qteStock, int grammage) {
		super(reference, marque, designation, prixUnitaire, qteStock);
		setGrammage(grammage);
	}

	/**
	 * @return the grammage
	 */
	public int getGrammage() {
		return grammage;
	}

	/**
	 * @param grammage the grammage to set
	 */
	public void setGrammage(int grammage) {
		this.grammage = grammage;
	}

	
	@Override
	public String toString() {
		String s = String.format("%s Rammette [grammage=%s]", super.toString(), getGrammage());

		return s;
	}

	
	
	

}
