/**
 * 
 */
package fr.eni.papeterie.bo;

/**
 * @author tanguy
 *
 */
public class Ligne {

	/**
	 * attribut de classe
	 */
	
	protected Article article;
	protected int qte;
	
	/**
	 * @param article
	 * @param qte
	 */
	public Ligne(Article article, int qte) {
		setArticle(article);
		setQte(qte);
	}
	
	/**
	 * @return the article
	 */
	public Article getArticle() {
		return article;
	}

	/**
	 * @return the qte
	 */
	public int getQte() {
		return qte;
	}

	/**
	 * @param article the article to set
	 */
	private void setArticle(Article article) {
		this.article = article;
	}

	/**
	 * @param qte the qte to set
	 */
	public void setQte(int qte) {
		this.qte = qte;
	}
	
	/**
	 * méthode pour récupérer le prix d'un article
	 */
	public float getPrix() {
		return article.getPrixUnitaire();
		
	}

//	@Override
//	public String toString() {
//		return String.format("Ligne [article=%s, qte=%s]", article ? null : getArticle, qte);
//	}
	//Méthodes
	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("Ligne [");
		buf.append(" qte=");
		buf.append(getQte());
		buf.append(", prix=");
		buf.append(getPrix());
		buf.append(", ");
		if (article != null) {
			buf.append("article=");
			buf.append(getArticle().toString());
		}
		buf.append("]");
		return buf.toString();
	}
	

}
