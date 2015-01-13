/**
 * 
 */
package nl.tudelft.footballmanager.development;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import nl.tudelft.footballmanager.model.League;
import nl.tudelft.footballmanager.model.Team;
import nl.tudelft.footballmanager.model.xml.XMLPlayer;

/**
 * @author Toine Hartman <tjbhartman@gmail.com>
 *
 */
public class MultipleLeaguesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		readSelectedLeagues();
		readAllLeagues();
	}

//	@SuppressWarnings("unused")
	private static void readAllLeagues() {
		System.out.println("Testing reading multiple leagues at once...");
		System.out.println("Reading all leagues...");

		ArrayList<League> leagues = League.readAll();
		System.out.println("Read leagues from file, sorting:");
		printLeagues(leagues, false);
	}

	private static void printLeagues(ArrayList<League> leagues, boolean recurse) {
		for (League l : leagues) {
			System.out.println("\t" + l.getLeague());
			if (recurse) {
				for (Team t : l.getTeams()) {
					System.out.println("\t\t" + t.getTeam());
				}
			}
		}
	}

//	@SuppressWarnings("unused")
	private static void readSelectedLeagues() {
		System.out.println("Testing reading multiple leagues at once...");
		String[] namesArr = {"Eredivisie", "Liga BBVA", "Scotland League", "Hellas Liga"};

		System.out.println("List of league names created");
		System.out.println(namesArr);

		ArrayList<League> leagues = League.readMany(namesArr);
		System.out.println("Read leagues from file, result:");
		printLeagues(leagues, true);
	}

}
