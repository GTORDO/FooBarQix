public class FooBarQix {


	/*               -------------------------------
	 *               |   TRAVAIL A LA CHAINE....   |
	 *               -------------------------------  
	 *  
	 *  Pour plus de fun, (sauf pour la boucle generale)
	 *  aucun int (surtout pas pour la test de multiplicite)
	 *  aucun test
	 *  aucune boucle
	 *  uniquement des operations sur des String
	 *  et des Regex.
	 *  
	 *  A l'interieur de la boucle tout peut tenir sur une seule ligne
	 *  mais je vais vous epargner cette epreuve occulaire...
	 *  
	 *  Enjoy !                                                  O
	 *                                                           |
	 *         O                                                 |------
	 *         |                                    -------
	 *  -------|                                    | Qix |
	 *  |      |                                    -------
	 *  |              -------     -------       o o o o o o o o o o o o
	 *  |              | Foo |     | Bar |      o ----------------------
	 *  |              -------     -------     o/
	 *  o o o o o o o o o o o o o o o o o o o o/
	 *  --------------------------------------   Travail a la chaine ....
	 *    
	 */
	
	/**
	 * La methode qui va bien sans parametre
	 * @param args
	 */
	public static void main(String[] args) {
		
		// La fameuse boucle, seul endroit où je m'autorise l'usage d'un int.
		for (int i=1; i<=100; i++) {

			// C'est plus drole avec des chaines !
			String value = String.valueOf(i);
		
			// Test de la multiplicite
			String 	result = isMultiple(value, "...", "Foo") +
							 isMultiple(value, ".....", "Bar") +
							 isMultiple(value, ".......", "Qix");
			
			// Test de la contenance
			result +=		 value.replaceAll("3", "Foo").replaceAll("5", "Bar").replaceAll("7", "Qix");
			
			// Nettoyage...
			result = result.replaceAll("[0-9]", "").replaceAll("$^", value);
			
			// Affichage
			System.out.println(result);
		}
		
	}
	
	/**
	 * Fonction de test de la multiplicite avec des chaines et gestion du Foo,Bar,Qix
	 * @param valueInString
	 * @param divisor
	 * @param keyWord
	 * @return theResultInString
	 */
	private static String isMultiple(String valueInString, String divisor, String keyWord) {
		// Ma ligne preferee...
		return String.format("%0"+valueInString+"d", 0).replaceAll(divisor, "").replaceAll("$^", keyWord).replaceAll("^(?!"+keyWord+").*$", valueInString);
	}
	
}
