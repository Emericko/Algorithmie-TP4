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
		Outils.Aleatoire.setSeed(9531);
		int nombreCases = 9; // Nombre de cases à remplir par partie, maximum 20
		char choix;
		boolean pointageBase = true, tuileClassique = true;
		int record, scoreTotal, maxSuite;
		Scanner cl = new Scanner(System.in);
		int[] tableauPoint = { 0, 1, 3, 5, 7, 9, 11, 15, 20, 25, 30, 35, 40, 50, 60, 70, 85, 100, 150, 300 };
		int[] tableauTuile = genereTableauTuiles(tuileClassique);
		int[] tableauCase = new int[nombreCases];
		int[] tableauScore;
		record = 0;
		do { // Répéter
			System.out.println("Pointages de (B)ase ou (E)xpert. Pointages actuels :");
			for (int i = 0; i < tableauPoint.length; ++i) {
				if (i == tableauPoint.length - 1) {
					System.out.print(String.format("%2d:", tableauPoint[i]));
				} else {
					System.out.print(String.format("%2d:", tableauPoint[i]));
				}
			}
			System.out.println("");
			System.out.println("Tuiles (C)lassiques ou (D)ifférentes. Tuiles actuelles :");
			for (int i = 0; i < tableauTuile.length; ++i) {
				if (i == tableauTuile.length - 1) {
					System.out.print(String.format("%2d", tableauTuile[i]));
				} else {
					System.out.print(String.format("%2d:", tableauTuile[i]));
				}
			}
			System.out.println("");
			System.out.println("(I)nscrire les cases ou (J)ouer une partie. Cases actuelles :");
			for (int i = 0; i < tableauCase.length; ++i) {
				if (i == tableauCase.length - 1) {
					System.out.print(String.format("%2d", tableauCase[i]));
				} else {
					System.out.print(String.format("%2d:", tableauCase[i]));
				}
			}
			System.out.println("");
			System.out.println("Calcul du (S)core obtenu");
			System.out.println("(Q)uitter");
			System.out.print("[BCDEIJQS] > ");
			choix = cl.next().charAt(0);
			switch (choix) {
				case 'B':
					pointageBase = true;
					ajusteTableauPoints(tableauPoint, pointageBase);
					break;
				case 'E':
					pointageBase = false;
					ajusteTableauPoints(tableauPoint, pointageBase);
					break;
				case 'C':
					tuileClassique = true;
					tableauTuile = genereTableauTuiles(tuileClassique);
					break;
				case 'D':
					tuileClassique = false;
					tableauTuile = genereTableauTuiles(tuileClassique);
					break;
				case 'I':
					inscrireCases(cl, tableauCase);
					break;
				case 'J':
					jouerPartie(cl, tableauTuile, tableauCase);
					break;
				case 'S':
					if (tableauCase[0] == 0) {
						System.out.println("Il n'y a aucun score à determiner");
					} else {
						tableauScore = determineScores(tableauCase, tableauPoint);
						scoreTotal = somme(tableauScore);
						maxSuite = maximum(tableauScore);
						System.out.println(genereChaine(tableauCase, " - ", " / ", -1, "__"));
						System.out.println(genereChaine(tableauScore, "   ", "   ", 0, "  "));
						System.out.println("Total de la partie = " + scoreTotal + " (" + maxSuite + ")");
						if (scoreTotal > record) {
							System.out.println("Bravo, vous avez battu votre record! ");
							System.out.println(String.format("Nouveau score à battre : %03d", scoreTotal));
							record = scoreTotal;
						}
					}
					break;
				default:
					System.out.println("CHOIX INVALIDE");
			}
		} while (choix != 'Q' && choix != 'q');
		System.out.println("Votre record est : " + record);
		System.out.println("Bonne journée");
	}

	/**
	 * Ajuste le pointage selon la difficulté
	 * 
	 * @param points Tableau représentant le pointage selon la longueur de la chaine
	 * @param base   Difficulté choisie par l'utilisateur
	 */
	public static void ajusteTableauPoints(int[] points, boolean base) {
		if (base == true) {
			points[5] = 9;
			points[11] = 35;
			points[16] = 85;
		} else {
			points[5] = 3;
			points[11] = 20;
			points[16] = 50;
		}

	}

	/**
	 * Crée un tableau qui possède des tuiles dont la valeur va de 0 à 30 avec 11 à
	 * 19 répété deux fois ou dont la valeur va de 1 à 40
	 * 
	 * @param classique Choix de l'utilisateur selon s'il veut un nombre de tuiles
	 *                  classique ou non.
	 * 
	 * @return Tableau avec les bonnes étiquettes selon le choix de l'utilisateur
	 */
	public static int[] genereTableauTuiles(boolean classique) {
		int[] tableauNombres = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
				24, 25, 26, 27, 28, 29, 30, 11, 12, 13, 14, 15, 16, 17, 18, 19 };

		if (classique != true) {
			for (int i = 0; i < tableauNombres.length; i++) {
				tableauNombres[i] = i + 1;
			}

		}
		return tableauNombres;
	}

	/**
	 * Crée un tableau qui possède le nombre de cases d'une partie et l'initialise
	 * avec les valeurs
	 * souhaitées par l'utilisateur
	 * 
	 * @param cl    Permet à l'utilisateur d'entrer des variables
	 * @param cases Tableau contenant le nombre de cases qu'on souhaite initialiser
	 */
	public static void inscrireCases(Scanner cl, int[] cases) {
		System.out.print("Inscrivez les valeurs des " + cases.length + " cases : ");
		for (int i = 0; i < cases.length; ++i) {
			cases[i] = cl.nextInt();
		}
	}

	/**
	 * Fonction qui joue une partie de Streams
	 * 
	 * @param cl     Permet à l'utilisateur d'entrer des variables
	 * @param tuiles Tableau avec toutes les tuiles qui peuvent être pigés pour le
	 *               jeu
	 * @param cases  Tableau contenant le nombre de cases qu'on souhaite initialiser
	 */
	public static void jouerPartie(Scanner cl, int[] tuiles, int[] cases) {
		// Seul tuiles ne doit pas être modifié
		// Déclarer la variable pos de type int
		int pos;
		String melangeFormater;
		// Déclarer un tableau de type int nommé melange , sans l'initialiser
		int[] melange;
		// Initialiser un tableau nommé positions ayant la même taille que le tableau
		// cases
		int[] positions = new int[cases.length];
		// POUR i ALLANT DE 0 À taille du tableau cases - 1 FAIRE
		for (int i = 0; i < cases.length; ++i) {
			// positions[i] <- i + 1
			positions[i] = i + 1;
			// cases[i] <- -1
			cases[i] = -1;
			// FINPOUR
		}
		// melange <- melangeTuiles(tuiles)
		melange = melangeTuiles(tuiles);
		// AFFICHER(genereChaine(positions, " ", " "))
		for (int i = 0; i < positions.length; ++i) {
			System.out.print(" " + positions[i] + "   ");
		}
		System.out.println("");
		// POUR i ALLANT DE 0 À taille du tableau cases - 1 FAIRE
		for (int i = 0; i < cases.length; i++) {
			// AFFICHER(genereChaine(cases, " - ", " - ", -1, "__"), " ~~~ ", melange[i],
			// "?")
			melangeFormater = String.format("%2d", melange[i]);
			System.out.print(
					String.format(genereChaine(cases, " - ", " - ", -1, "__") + " ~~~ " + melangeFormater + "? "));
			// Vous devez afficher melange[i] sur deux colonnes en utilisant
			// String.formatted()
			// LIRE(pos)
			pos = cl.nextInt();
			// pos <- pos - 1
			pos = pos - 1;
			// TANT QUE (pos < 0 || pos >= cases.length || cases[pos] != -1) FAIRE
			while (pos < 0 || pos >= cases.length || cases[pos] != -1) {
				// AFFICHER("Cette position est invalide, choisissez-en une autre > ")
				System.out.print("Cette position est invalide, choisissez-en une autre > ");
				// LIRE(pos)
				pos = cl.nextInt();
				// pos <- pos - 1
				pos = pos - 1;
				// FINTANTQUE
			}
			// cases[pos] <- melange[i]
			cases[pos] = melange[i];
			// FINPOUR
		}
		// pos <- trouve(cases, 0)
		pos = trouve(cases, 0);
		// SI (pos != -1) ALORS
		if (pos != -1) {
			// AFFICHER(genereChaine(cases, " - ", " - ", 0, "**"))
			System.out.println(genereChaine(cases, " - ", " - ", 0, "**"));
			// AFFICHER("Quelle valeur doit remplacer le JOKER? ")
			System.out.print(("Quelle valeur doit remplacer le JOKER? "));
			// LIRE(cases[pos])
			cases[pos] = cl.nextInt();
			// FINSI
		}
	}

	/**
	 * Fonction qui determine le nombre de points que chaque suite croissante
	 * de chiffres rapporte
	 * 
	 * @param cases  Tableau contenant les cases initialisées par l'utilisateur
	 * @param points Tableau contenant les points que chaque suite rapporte
	 * 
	 * @return Tableau avec les scores de chaque suite croissante de chiffres
	 */
	public static int[] determineScores(int[] cases, int[] points) {
		// cases et points ne doivent pas être modifiés
		// Aucun affichage n'est réalisé par cette fonction
		int[] scores = new int[cases.length];
		int longueurSuite = 1;
		for (int i = 0; i < cases.length; ++i) {
			if (i + 1 == cases.length) {
				scores[i] = points[longueurSuite - 1];
			} else if (cases[i] > cases[i + 1]) {
				scores[i] = points[longueurSuite - 1];
				longueurSuite = 1;
			} else {
				longueurSuite++;
			}
		}
		return scores;
	}

	/**
	 * Mélange les valeurs d'un tableau
	 * 
	 * @param tuiles Tableau de tuile ordonné
	 * @return Tableau de tuile mélangé
	 */
	public static int[] melangeTuiles(int[] tuiles) {
		int[] melangeTuile = tuiles.clone();
		int temp;

		for (int i = 0; i < melangeTuile.length; i++) {
			int alea = Outils.Aleatoire.nextInt(melangeTuile.length);
			temp = melangeTuile[i];
			melangeTuile[i] = melangeTuile[alea];
			melangeTuile[alea] = temp;

		}
		return melangeTuile;
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

	/**
	 * Sépare une chaine selon si la chaine a une tendence croissante ou
	 * décroissante
	 * 
	 * @param tab  Tableau à séparer
	 * @param sepC Indice de portion croissante
	 * @param sepD Indice de portion décroissante
	 * @param val  Valeur à remplacer
	 * @param rem  Symbole de remplacement
	 * 
	 * @return Chaine avec symbole indiquant la croissance ou la décroissante d'une
	 *         portion donnée
	 */
	public static String genereChaine(int[] tab, String sepC, String sepD, int val, String rem) {
		String chaine = "";
		String temp = "";
		for (int i = 0; i < tab.length; i++) {
			temp = "" + tab[i];
			if (tab[i] == val) {
				temp = rem;
			}
			if (i == tab.length - 1) { // dernier nombre
				chaine += String.format("%2s", temp);
			} else if (tab[i + 1] >= tab[i]) { // si prochain plus grand ou égal
				chaine += String.format(("%2s" + sepC), temp);

			} else { // si prochain plus petit
				chaine += String.format(("%2s" + sepD), temp);
			}

			if ((i + 1) % 20 == 0) {
				chaine += "\n";
			}

		}
		return chaine;
	}

	/**
	 * Fonction qui prend un tableau et renvoie la somme de toutes ses valeurs
	 * 
	 * @param vecteur Tableau dont on souhaite trouver la somme
	 * 
	 * @return Somme de toutes les valeurs du tableau
	 */
	public static int somme(int[] vecteur) {
		int somme = 0;

		for (int i = 0; i < vecteur.length; ++i) {
			somme += vecteur[i];
		}
		return somme;
	}

	/**
	 * Fonction qui prend un tableau et renvoie sa valeur maximale
	 * 
	 * @param vecteur Tableau dont on souhaite trouver la valeur maximale
	 * 
	 * @return Valeur maximale du tableau
	 */
	public static int maximum(int[] vecteur) {
		int max = 0;
		for (int i = 0; i < vecteur.length; ++i) {
			if (vecteur[i] > max) {
				max = vecteur[i];
			}
		}
		return max;
	}

	/**
	 * Fonction qui va chercher la première occuration d'une valeur dans un tableau
	 * et trouver sa position
	 * 
	 * @param vecteur tableau doit on cherche une valeur
	 * @param valeur  valeur recherché
	 * 
	 * @return position de la première occuration ou -1 si aucune occuration n'est
	 *         présente
	 */
	public static int trouve(int[] vecteur, int valeur) {
		int i = 0;
		int occurrence = 0;
		while (i < vecteur.length && vecteur[i] != valeur) {
			i++;
		}
		if (vecteur[i] == valeur) {
			occurrence = i;
		} else {
			occurrence = -1;
		}
		return occurrence;
	}
}
