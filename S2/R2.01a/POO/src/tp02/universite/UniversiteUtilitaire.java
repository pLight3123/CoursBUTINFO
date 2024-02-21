package tp02.universite;

public class UniversiteUtilitaire {
	/**
	 * Capitalise la chaine de charactères en paramètre
	 *
	 * @return la chaine en minuscules, sauf la première lettre qui est en majuscule
	 */
	public static String capitalize(String chaine) {
		StringBuilder chaineSB = new StringBuilder(chaine.toLowerCase());	// Creation d'un StringBuilder à partir de chaine en minuscules
		chaineSB.setCharAt(0, Character.toUpperCase(chaineSB.charAt(0)));	// Modification du premier charactère de chaineSB pour le mettre en majuscule
		return chaineSB.toString();	// Renvoi de chaineSB passé en string
	}

	public static void affichePersonne(Personne personne) {
		System.out.println(personne);
	}
}
