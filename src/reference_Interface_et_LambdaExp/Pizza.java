package reference_Interface_et_LambdaExp;


public class Pizza implements ICuisable {
	
	private String nom;
	private int dureeCuisson = 3;
	private int prix;
	
	
	public Pizza(String nom, int prix){
		this.nom = nom;
		this.prix = prix;
	}
	

	/*GETTER ET SETTER
	 * */
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getDureeCuisson() {
		return dureeCuisson;
	}
	public void setDureeCuisson(int dureeCuisson) {
		this.dureeCuisson = dureeCuisson;
	}

	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}


	@Override
	public void cuire(String cuisson) {
		System.out.println("Ma cuisson est : " + cuisson);
		
	}


}
