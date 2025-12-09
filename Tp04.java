package emericko.tp04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Scanner;
import commun.Outils;

public class Tp04 {
	@Test
	void test11() {
		int[] pointsO = new int[] { 0, 1, 3, 5, 7, 9, 11, 15, 20, 25,
				30, 35, 40, 50, 60, 70, 85, 100, 150, 300 };
		int[] pointsA = new int[] { 0, 1, 3, 5, 7, 3, 11, 15, 20, 25,
				30, 20, 40, 50, 60, 70, 50, 100, 150, 300 };
		ajusteTableauPoints(pointsO, false);
		assertArrayEquals(pointsA, pointsO);
	}

	@Test
	void test12() {
		int[] pointsO = new int[] { 0, 1, 3, 5, 7, 9, 11, 15, 20, 25,
				30, 35, 40, 50, 60, 70, 85, 100, 150, 300 };
		int[] pointsA = new int[] { 0, 1, 3, 5, 7, 9, 11, 15, 20, 25,
				30, 35, 40, 50, 60, 70, 85, 100, 150, 300 };
		ajusteTableauPoints(pointsO, true);
		assertArrayEquals(pointsA, pointsO);
	}

	@Test
	void test13() {
		int[] pointsO = new int[] { 0, 1, 3, 5, 7, 3, 11, 15, 20, 25,
				30, 20, 40, 50, 60, 70, 50, 100, 150, 300 };
		int[] pointsA = new int[] { 0, 1, 3, 5, 7, 3, 11, 15, 20, 25,
				30, 20, 40, 50, 60, 70, 50, 100, 150, 300 };
		ajusteTableauPoints(pointsO, false);
		assertArrayEquals(pointsA, pointsO);
	}

	@Test
	void test14() {
		int[] pointsO = new int[] { 0, 1, 3, 5, 7, 3, 11, 15, 20, 25,
				30, 20, 40, 50, 60, 70, 50, 100, 150, 300 };
		int[] pointsA = new int[] { 0, 1, 3, 5, 7, 9, 11, 15, 20, 25,
				30, 35, 40, 50, 60, 70, 85, 100, 150, 300 };
		ajusteTableauPoints(pointsO, true);
		assertArrayEquals(pointsA, pointsO);
	}

	@Test
	void test21() {
		assertArrayEquals(new int[] {
				0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
				20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
				genereTableauTuiles(true));
	}

	@Test
	void test22() {
		assertArrayEquals(new int[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 },
				genereTableauTuiles(false));
	}

	@Test
	void test31() {
		int[] nb = { 1, 2, 3, 4, 5 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 0, 16 }, determineScores(nb, pts));
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test32() {
		int[] nb = { 5, 4, 3, 2, 1 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 0, 0 }, determineScores(nb, pts));
		assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test33() {
		int[] nb = { 1, 2, 4, 3, 5 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 4, 0, 1 }, determineScores(nb, pts));
		assertArrayEquals(new int[] { 1, 2, 4, 3, 5 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test34() {
		int[] nb = { 5, 4, 1, 3, 2 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 1, 0 }, determineScores(nb, pts));
		assertArrayEquals(new int[] { 5, 4, 1, 3, 2 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test35() {
		int[] nb = { 1, 2, 2, 3, 1 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 9, 0 }, determineScores(nb, pts));
		assertArrayEquals(new int[] { 1, 2, 2, 3, 1 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test41() {
		assertArrayEquals(new int[] {}, melangeTuiles(new int[] {}));
	}

	@Test
	void test42() {
		assertArrayEquals(new int[] { 5 }, melangeTuiles(new int[] { 5 }));
	}

	@Test
	void test43() {
		Outils.Aleatoire.resetSeedSet();
		Outils.Aleatoire.setSeed(123);
		int[] nbO = { 1, 2, 3, 4, 5 };
		assertArrayEquals(new int[] { 4, 1, 3, 5, 2 }, melangeTuiles(nbO));
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nbO);
	}

	@Test
	void test51() {
		assertEquals(" 1 -  3 -  2 -  4", genereChaine(new int[] { 1, 3, 2, 4 }, " - ", " - ", -1, ""));
	}

	@Test
	void test52() {
		assertEquals(" 1/ 3\\ 2/ 4", genereChaine(new int[] { 1, 3, 2, 4 }, "/", "\\", -1, ""));
	}

	@Test
	void test53() {
		assertEquals("?? ~ 3 ~ 2 ~ 4", genereChaine(new int[] { 1, 3, 2, 4 }, " ~", " ~", 1, "??"));
	}

	@Test
	void test54() {
		assertEquals(" 1 ~ 3 ~ 2 ~==", genereChaine(new int[] { 1, 3, 2, 4 }, " ~", " ~", 4, "=="));
	}

	@Test
	void test55() {
		assertEquals(" 1 + % - 2 + 4", genereChaine(new int[] { 1, 3, 2, 4 }, " +", " -", 3, "%"));
	}

	@Test
	void test61() {
		assertEquals(25, somme(new int[] { 1, 3, 5, 7, 9 }));
	}

	@Test
	void test62() {
		assertEquals(6, somme(new int[] { 1, 0, 0, 5, 0 }));
	}

	@Test
	void test63() {
		assertEquals(0, somme(new int[] { 0, 0, 0, 0, 0 }));
	}

	@Test
	void test64() {
		assertEquals(8, somme(new int[] { 8 }));
	}

	@Test
	void test65() {
		assertEquals(0, somme(new int[] {}));
	}

	@Test
	void test71() {
		assertEquals(4, maximum(new int[] { 1, 3, 5, 7, 9 }));
	}

	@Test
	void test72() {
		assertEquals(1, maximum(new int[] { 1, 8, 4, 6 }));
	}

	@Test
	void test73() {
		assertEquals(0, maximum(new int[] { 9, 7, 5, 3, 1 }));
	}

	@Test
	void test74() {
		assertEquals(0, maximum(new int[] { 5 }));
	}

	@Test
	void test75() {
		assertEquals(2, maximum(new int[] { 3, 3, 8, 8, 3 }));
	}

	@Test
	void test81() {
		assertEquals(1, trouve(new int[] { 1, 3, 5, 7, 9 }, 3));
	}

	@Test
	void test82() {
		assertEquals(0, trouve(new int[] { 1, 3, 5, 7, 9 }, 1));
	}

	@Test
	void test83() {
		assertEquals(4, trouve(new int[] { 1, 3, 5, 7, 9 }, 9));
	}

	@Test
	void test84() {
		assertEquals(-1, trouve(new int[] { 1, 3, 5, 7, 9 }, 4));
	}

	@Test
	void test85() {
		assertEquals(-1, trouve(new int[] {}, 7));
	}

	public static void main(String[] args) {
		// A FAIRE (60) : code
		Outils.Aleatoire.setSeed(9531); // Outils.Aleatoire.setSeed(9531);
		int nombreCases = 9; // Nombre de cases à remplir par partie, maximum 20
		char choix;
		boolean pointageBase = true, tuileClassique = true; 
		int record, scoreTotal, maxSuite;

		Scanner cl = new Scanner(System.in);
		int[] tableauPoint = {0, 1, 3, 5, 7, 9, 11, 15, 20, 25, 30, 35, 40, 50, 60, 70, 85, 100, 150, 300};
		// Déclarer un tableau pour les points et l'initialiser avec les points de base inscrits sur la feuille de pointage disponible dans l'énoncé
		int[] tableauTuile = genereTableauTuiles(tuileClassique);
		// Déclarer un tableau de tuiles et l'initialiser en appelant genereTableauTuiles()
		int[] tableauCase = new int[nombreCases];
		// Déclarer et initialiser un tableau de taille nombreCases pour les cases
		int[] tableauScore = {}; // Déclarer un tableau pour les scores, sans l'initialiser (sans faire de new)
		record = 0; // Déclarer d'autres variables, si nécessaire
		do { // Répéter
			System.out.println("Pointages de (B)ase ou (E)xpert. Pointages actuels :");
			for (int i = 0; i < tableauPoint.length; ++i) {
				System.out.print(tableauPoint[i] + ":"); //A FAIRE DES ESPACE!!!!
			}
			System.out.println("");
			System.out.println("Tuiles (C)lassiques ou (D)ifférentes. Tuiles actuelles :");
			for (int i = 0; i < tableauTuile.length; ++i) {
				System.out.print(tableauTuile[i] + ":"); //A FAIRE DES ESPACE!!!!
			}
			System.out.println("");
			System.out.println("(I)nscrire les cases ou (J)ouer une partie. Cases actuelles :");
			for (int i = 0; i < tableauCase.length; ++i) {
				System.out.print(tableauCase[i] + ":"); //A FAIRE DES ESPACE!!!!
			}
			System.out.println("");
			System.out.println("Calcul du (S)core obtenu");
			System.out.println("(Q)uitter");
			System.out.print("[BCDEIJQS] > ");
			choix = cl.next().charAt(0); // Afficher le menu et lire le choix de l'usager
			switch (choix) { // Selon son choix
				case 'B': // B : appeler ajusteTableauPoints()
					pointageBase = true;
					ajusteTableauPoints(tableauPoint, pointageBase);
					break;
				case 'E': // E : appeler ajusteTableauPoints()
					pointageBase = false;
					ajusteTableauPoints(tableauPoint, pointageBase);
					break;
				case 'C': // C : appeler genereTableauTuiles()
					tuileClassique = true;
					genereTableauTuiles(tuileClassique);
					break;
				case 'D': // D : appeler genereTableauTuiles()
					tuileClassique = false;
					break;
				case 'I': // I : appeler inscrireCases()
					inscrireCases(cl, tableauCase);
					break;
				case 'J': // J : appeler jouerPartie()
					jouerPartie(cl, tableauTuile, tableauCase);
					break;
				case 'S': // S : Calcul du score
					tableauScore = determineScores(tableauCase, tableauPoint); // Appeler determineScores() et récupérer le tableau des scores
					scoreTotal = somme(tableauScore); // Appeler somme() pour obtenir le score total
					maxSuite = maximum(tableauScore); // Appeler maximum() pour avoir la poisition du score maximal pour une suite
					System.out.println("Total de la partie = " + scoreTotal + "(" + maxSuite + ")"); // Afficher le résultat de la partie
					if (scoreTotal > record) { // Mise à jour du score record si le joueur a battu son record précédent
						System.out.print("Bravo, vous avez battu votre record! ");
						System.out.print("Nouveau score à battre : " + scoreTotal);
						record = scoreTotal;
					}
					break;
				default:
					System.out.println("CHOIX INVALIDE"); // Autre choix : Afficher CHOIX INVALIDE
			}
		} while (choix != 'Q' && choix != 'q'); // Tant que le joueur ne choisit pas de quitter
		System.out.println("Votre record est : " + record); // Afficher le pointage record et saluer le joueur
		System.out.println("Bonne journée");
	}

	// A FAIRE (9) : code - documentation(/**)
	public static void ajusteTableauPoints(int[] points, boolean base) {
		// Aucun affichage n'est réalisé par cette procédure
		// On modifie seulement les trois cases du tableau des points qui varient
		// selon le type de pointage choisi (voir énoncé).
	}

/**
     * Crée un tableau qui possède des tuiles dont la valeur va de 1 à 30 avec 11 à 19 répété deux fois ou dont la valeur va de 1 à 40
     * 
     * @param classique Choix de l'utilisateur selon s'il veut un nombre de tuiles classique ou non.
     * 
     * @return Tableau avec les bonnes étiquettes selon le choix de l'utilisateur
     */
    public static int[] genereTableauTuiles(boolean classique) {
        
        if (classique == true) {
            int[] tableauTuiles = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,11,12,13,14,15,16,17,18,19};
        }
        int[] tableauTuiles = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
        
        return tableauTuiles;
    }

	// A FAIRE (4) : code - documentation(/**)
	public static void inscrireCases(Scanner cl, int[] cases) {
		// AFFICHER("Inscrivez les valeurs des ", taille de cases , " cases : ")
		// POUR i ALLANT DE 0 À taille du tableau cases - 1 FAIRE
		// LIRE(cases[i])
		// FINPOUR
	}

	// A FAIRE (25) : code - documentation(/**)
	public static void jouerPartie(Scanner cl, int[] tuiles, int[] cases) {
		// Seul tuiles ne doit pas être modifié
		// Déclarer la variable pos de type int
		// Déclarer un tableau de type int nommé melange , sans l'initialiser
		// Initialiser un tableau nommé positions ayant la même taille que le tableau
		// cases
		// POUR i ALLANT DE 0 À taille du tableau cases - 1 FAIRE
		// positions[i] <- i + 1
		// cases[i] <- -1
		// FINPOUR
		// melange <- melangeTuiles(tuiles)
		// AFFICHER(genereChaine(positions, " ", " "))
		// POUR i ALLANT DE 0 À taille du tableau cases - 1 FAIRE
		// AFFICHER(genereChaine(cases, " - ", " - ", -1, "__"), " ~~~ ", melange[i], "?
		// ")
		// Vous devez afficher melange[i] sur deux colonnes en utilisant
		// String.formatted()
		// LIRE(pos)
		// pos <- pos - 1
		// TANT QUE (pos < 0 || pos >= cases.length || cases[pos] != -1) FAIRE
		// AFFICHER("Cette position est invalide, choisissez-en une autre > ")
		// LIRE(pos)
		// pos <- pos - 1
		// FINTANTQUE
		// cases[pos] <- melange[i]
		// FINPOUR
		// pos <- trouve(cases, 0)
		// SI (pos != -1) ALORS
		// AFFICHER(genereChaine(cases, " - ", " - ", 0, "**"))
		// AFFICHER("Quelle valeur doit remplacer le JOKER? ")
		// LIRE(cases[pos])
		// FINSI
	}

	// A FAIRE (13) : code - documentation(/**)
	public static int[] determineScores(int[] cases, int[] points) {
		// cases et points ne doivent pas être modifiés
		// Aucun affichage n'est réalisé par cette fonction
		// Initialiser à zéro un tableau de scores de la même taille que le tableau
		// cases
		// Initialiser la longueur de la suite à 1
		// Pour chaque paire de cases adjacentes, vérifier s'il s'agit de la fin
		// d'une suite et faire le traitement approprié
		// Ne pas oublier d'écrire les points obtenus pour la dernière suite
		return new int[0]; // Retourne le tableau des scores créé
	}

	// A FAIRE (10) : code - documentation(/**)
	public static int[] melangeTuiles(int[] tuiles) {
		// tuiles ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Lire la documentation de l'énoncé et utiliser Outils.Aleatoire
		// Indice : Créer un nouveau tableau de tuiles ( clone() ) qui sera mélangé
		return new int[0]; // Retourne le tableau de tuiles mélangées
	}

	/**
	 * Permet de générer une chaîne avec des séparateurs dans laquelle on ne
	 * veut pas spécifier de valeur à remplacer. Cette fonction appelle la
	 * fonction genereChaine() générique en ajoutant les paramètres manquants.
	 * 
	 * @param tab  Tableau que l'on veut transformer en une chaîne
	 * @param sepC Séparateur entre deux nombres égaux ou en ordre croissant
	 * @param sepD Séparateur entre deux nombres en ordre décroissant
	 * @return Chaîne représentant le tableau avec les séparateurs spécifiés
	 */
	public static String genereChaine(int[] tab, String sepC, String sepD) {
		// NE PAS MODIFIER CETTE MÉTHODE
		return genereChaine(tab, sepC, sepD, Integer.MIN_VALUE, null);
	}

	// A FAIRE (20) : code - documentation(/**)
	public static String genereChaine(int[] tab, String sepC, String sepD, int val, String rem) {
		// tab ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Lire la documentation de l'énoncé et utiliser String.formatted()
		// Indice : Faire un cas spécial pour le premier élément qui ne
		// doit pas être précédé d'un séparateur
		return ""; // Retourne une chaîne qui sera affichée par la méthode appelante
	}

	// A FAIRE (6) : code - documentation(/**)
	public static int somme(int[] vecteur) {
		// vecteur ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		return Integer.MIN_VALUE; // Retourne une valeur
	}

	// A FAIRE (8) : code - documentation(/**)
	public static int maximum(int[] vecteur) {
		// vecteur ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		return Integer.MIN_VALUE; // Retourne une position
	}

	// A FAIRE (9) : code - documentation(/**)
	public static int trouve(int[] vecteur, int valeur) {
		// vecteur ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		return Integer.MIN_VALUE; // Retourne une position
	}
}
