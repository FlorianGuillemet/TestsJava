package reference_Interface_et_LambdaExp;

public class Main {

	public static void main(String[] args) {
	
		/*
		 * La Classe Pizza implémente ICuisable
		 * */
		
		/* 1 - Dans une étiquette Pizza, on peut utiliser la méthode de l'interface et toutes les autres méthodes de Pizza et de Object.
		 * */
		
		Pizza pizz = new Pizza("Magharita", 11);
		
		//Methode de l'interface
		pizz.cuire("au four traditionnel");
		
		//Autres méthodes de la classe
		System.out.println(pizz.getDureeCuisson());
		pizz.setPrix(12);
		
		/* 2 - Dans une étiquette Interface ICuisable, on ne peut utiliser que la méthode de l'interface et des méthodes de Object
		 * => privilegier cette reference si on ne veut utiliser que les methodes de l'interface
		 * */ 

		ICuisable iPizzI = new Pizza("Calzone", 12);
		
		//Methode de l'interface
		iPizzI.cuire("au four à bois");
		
		/* 3 - Classe anonyme. Instanciation d'un objet qui n'a pas de type concret.
		 * on ne peut utiliser que la méthode de l'interface et des méthodes de Object
		 * Besoin de redéfinir la méthode à la volee.
		 * => interessant si on veut utiliser la methode de l'interface pour un objet "temporaire", on n'a pas besoin de coder la classe 
		 * */
		
		ICuisable iCuis = new ICuisable() {
			
			@Override
			public void cuire(String cuisson) {
				System.out.println("je suis cuite : " + cuisson);				
			}
		};
		
		//Methode de l'interface
		iCuis.cuire("à l'huile ... !");
		
		/* 4 - Expression Lambda. 
		 * Même chose que classe anonyme mais code simplifié
		 * */
	
		ICuisable iCuiL = (cuisson2) -> System.out.println("Et moi : " + cuisson2 );
		
		//Methode de l'interface
		iCuiL.cuire("dans un four lambda");

		//Autre maniere en utilisant la methode de l'interface Runnable
		String cuisson = "dans l'eau bouillante ...??!";		
		Runnable runLambda = () -> System.out.println("Et moi je suis cuite : " + cuisson );
		runLambda.run();
			

	}

}
